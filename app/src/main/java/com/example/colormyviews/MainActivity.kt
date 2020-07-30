package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // make a call function for the listener
        setListener()
    }


    // Make colored the view
    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }


    // set listener
    private fun setListener() {
        val boxOneText = findViewById<TextView>(R.id.box_one)
        val boxTwoText = findViewById<TextView>(R.id.box_two)
        val boxThreeText = findViewById<TextView>(R.id.box_three)
        val boxFourText = findViewById<TextView>(R.id.box_four)
        val boxFiveText = findViewById<TextView>(R.id.box_five)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_id)


        val viewsCollect: List<View> = listOf(
            boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, rootConstraintLayout
        )

        for (item in viewsCollect) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}












