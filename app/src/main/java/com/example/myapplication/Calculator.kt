package com.example.myapplication

import kotlinx.coroutines.delay

class Calculator {
    fun add(a: Int, b: Int) = a + b

    fun heavyCalc() {
        repeat(5) {
            Thread.sleep(100)
          //  delay(1000)
        }
    }
    fun smthFalse() = true
}