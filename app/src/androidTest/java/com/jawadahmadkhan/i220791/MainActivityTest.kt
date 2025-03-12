package com.jawadahmadkhan.i220791

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Before
    fun setUp() {
        Intents.init()
        ActivityScenario.launch(MainActivity::class.java)
    }

    @After
    fun tearDown() {
        Intents.release()
    }

    @Test
    fun testTapOScreenOpensLoginActivity() {
        // Click anywhere on the screen
        onView(withId(android.R.id.content)).perform(click())

        // Verify that LoginActivity is started
        Intents.intended(hasComponent(LoginActivity::class.java.name))
    }
}
