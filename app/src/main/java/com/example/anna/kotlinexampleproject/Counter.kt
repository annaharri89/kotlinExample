package com.example.anna.kotlinexampleproject

class Counter {
    var incrementBy: Int = 1
    var count: Int = 0; private set
    private val min = 0
    private val max = 99999

    fun incrementCounter() {
        count += incrementBy
        if (count > max) {
            count = max
        }
    }

    fun decrementCounter() {
        count -= incrementBy
        if (count < min) {
            count = min
        }
    }
}