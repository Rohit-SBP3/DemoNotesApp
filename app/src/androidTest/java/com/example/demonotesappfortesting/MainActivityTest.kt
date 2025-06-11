package com.example.demonotesappfortesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test


class MainActivityTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testSubmitBtn_expected_correctValue() {
        onView(withId(R.id.btn_submit)).perform()

    }

}