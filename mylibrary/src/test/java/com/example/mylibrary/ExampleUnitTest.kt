package com.example.mylibrary

import android.util.Log
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun `fun`() {
        val bean = Bean()
        bean.age
        bean.doSomething1()
        bean.name = "Hao"
        val bean1 = Bean()
        Log.e("fun", bean1.name!!)
    }
}