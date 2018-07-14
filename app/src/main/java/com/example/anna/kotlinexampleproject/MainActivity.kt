package com.example.anna.kotlinexampleproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val counter = Counter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener {
            incrementCounter()
        }

        minus.setOnClickListener {
            decrementCounter()
        }

        increase_by_input.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                counter.incrementBy = increase_by_input.text.toString().toInt()
                false
            } else {
                true
            }
        }


    }

    private fun incrementCounter() {
        counter.incrementCounter()
        counter_num.text = counter.count.toString()
    }

    private fun decrementCounter() {
        counter.decrementCounter()
        counter_num.text = counter.count.toString()
    }
}
