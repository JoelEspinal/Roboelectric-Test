package joelepinal.com.roboelectricdemo;

import android.widget.Button;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
// @Config(constants = BuildConfig.class)
public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setUp() throws Exception{
        activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }

    @Test
    public void clickButtonChangeMessage_shouldChangeTextViewMessageShown() {
        final String expectedMessage = "Hello World!";
        TextView textViewShowMessage = activity.findViewById(R.id.textView_show_message);
        Button changeMessageButton = activity.findViewById(R.id.button_change_message);

        changeMessageButton.performClick();

        String actualMessage = textViewShowMessage.getText().toString();

        assertEquals(expectedMessage, actualMessage);
    }

}
