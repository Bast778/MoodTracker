package oxymium.moodtracker.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import oxymium.moodtracker.R;

public class SadActivity extends AppCompatActivity {

    private ConstraintLayout mSadLayout;
    private MediaPlayer mPlaySadSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sad);

        mSadLayout = (ConstraintLayout) findViewById(R.id.mt_full_layout_sad);


        //loads song & plays it onCreate
        mPlaySadSong = MediaPlayer.create(getApplicationContext(), R.raw.sad_song);
        mPlaySadSong.start();

        mSadLayout.setOnTouchListener(new OnSwipeTouchListener(SadActivity.this) {

            public void onSwipeTop() {
                Intent disappointedActivity = new Intent(SadActivity.this, DisappointedActivity.class);
                startActivity(disappointedActivity);
            }

        });
    }
}