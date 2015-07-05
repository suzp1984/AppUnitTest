package unit.zpcat.org.appunittest;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.suitebuilder.annotation.MediumTest;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jacobsu on 7/5/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivity;
    private TextView txtView;
    private Button button;

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(true);
        mainActivity = getActivity();
        txtView = (TextView) mainActivity.findViewById(R.id.txt);
        button = (Button) mainActivity.findViewById(R.id.button);
    }


    public void testPreConditions() {
        assertNotNull("MainActivity is null", mainActivity);
        assertNotNull("TextView is null", txtView);
    }


    public void testTextView() {
        final String expected = mainActivity.getString(R.string.hello_world);
        final String actual = txtView.getText().toString();

        assertEquals(expected, actual);
    }

    @MediumTest
    public void testClickMeButton() {
        final String expected = mainActivity.getString(R.string.hello_me);
        TouchUtils.clickView(this, button);

        assertTrue(View.VISIBLE == txtView.getVisibility());
        assertEquals(expected, txtView.getText().toString());
    }

}
