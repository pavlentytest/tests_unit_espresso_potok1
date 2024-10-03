package com.example.myapplication

import org.junit.After
import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private var calculator: Calculator? = null

    @Before
    fun before() {
        calculator = Calculator()
    }

    @Test
    fun addition() {
        Assert.assertEquals(3, calculator?.add(1,3) ?: 0)
    }

    @Test
    fun addition2() {
        Assert.assertEquals(103, calculator?.add(101,2) ?: 0)
    }

    @Test(expected = NullPointerException::class)
    fun nullTestString(){
        val str: String? = null
        Assert.assertTrue(str!!.isEmpty())
    }

    @Test(timeout = 1000)
    fun requestTest() {
        calculator?.heavyCalc()
    }

    @Test
    fun test123() {
        calculator?.let { Assume.assumeFalse(it.smthFalse()) }
    }

    @After
    fun after() {
        calculator = null
    }
}