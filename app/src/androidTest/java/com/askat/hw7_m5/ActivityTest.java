package com.askat.hw7_m5;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ActivityTest {

    @Rule
    public ActivityScenarioRule activityScenarioRule = new ActivityScenarioRule(MainActivity.class);


    @Test
    public void simpleAdd() {
        onView(withId(R.id.ed_first_number)).perform(typeText("14"));
        onView(withId(R.id.ed_second_number)).perform(typeText("12"));
        onView(withId(R.id.btn_plus)).perform(click());
        onView(withId(R.id.txt_result)).check(matches(withText("26")));
    }

    @Test
    public void simpleDivide(){
        onView(withId(R.id.ed_second_number)).perform(typeText("6"));
        onView(withId(R.id.ed_second_number)).perform(typeText("3"));
        onView(withId(R.id.btn_divide)).perform(click());
        onView(withId(R.id.txt_result)).check(matches(withText("2")));
    }
}
