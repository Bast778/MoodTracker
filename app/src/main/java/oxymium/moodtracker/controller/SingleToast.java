package oxymium.moodtracker.controller;


import android.content.Context;
import android.widget.Toast;


// Will make Toast shorter

public class SingleToast {

    private static Toast mToast;

    public static void show(Context context, String text, int duration) {
        if (mToast != null) mToast.cancel();
        mToast = Toast.makeText(context, text, duration);
        mToast.show();
    }
}