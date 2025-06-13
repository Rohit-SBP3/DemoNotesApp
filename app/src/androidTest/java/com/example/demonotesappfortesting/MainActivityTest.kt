package com.example.demonotesappfortesting

import androidx.core.content.MimeTypeFilter.matches
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test


class MainActivityTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testSubmitBtn_expected_correctValue() {
        onView(withId(R.id.edt_title)).perform(typeText("Hello"))
        onView(withId(R.id.edt_description)).perform(typeText("World"), closeSoftKeyboard())

        onView(withId(R.id.btn_submit)).perform(click())

        onView(withId(R.id.tv_show)).check(matches(withText("HelloWorld")))

    }

}