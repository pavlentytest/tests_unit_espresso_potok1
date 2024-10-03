package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val mainActivitytext = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checAuthUI() {
      //  onView(withId(R.id.button)).check(matches(isDisplayed()))
        onView(withId(R.id.editTextText)).perform(typeText("admin"))
    }
}