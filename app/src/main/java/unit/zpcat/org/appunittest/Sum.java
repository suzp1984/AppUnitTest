package unit.zpcat.org.appunittest;

import android.util.Log;

/**
 * Created by moses on 6/30/15.
 */
public class Sum {
    private final String TAG = "Sum";

    public int add(int a, int b) {
        Log.e(TAG, "Sum.add(" + a + ", " + b + ");");
        return a + b;
    }
}
