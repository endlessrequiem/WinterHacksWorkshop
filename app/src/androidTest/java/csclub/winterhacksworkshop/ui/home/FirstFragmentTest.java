package csclub.winterhacksworkshop.ui.home;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import csclub.winterhacksworkshop.MainActivity;
import csclub.winterhacksworkshop.R;

public class FirstFragmentTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void ButtonTest() {


        onView((withId(R.id.buttonTest)))
                .perform(click());

        onView(withId(R.id.text_firstfragment)).check(matches(withText((("Hello World")))));

    }

}