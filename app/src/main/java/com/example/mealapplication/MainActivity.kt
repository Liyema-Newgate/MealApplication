package com.example.mealapplication

import android.os.Bundle

import android.widget.Button

import android.widget.EditText

import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    private lateinit var mealTypeInput: EditText

    private lateinit var suggestButton: Button

    private lateinit var suggestionTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        mealTypeInput = findViewById(R.id.mealTypeInput)

        suggestButton = findViewById(R.id.suggestButton)

        suggestionTextView = findViewById(R.id.suggestionTextView)


        suggestButton.setOnClickListener { suggestMeal() }

    }


    private fun suggestMeal() {

        val mealType = mealTypeInput.text.toString().trim().lowercase()

        if (mealType.isEmpty()) {

            suggestionTextView.text = "Please enter a meal type."

            return

        }

        val suggestion = when (mealType) {

            "breakfast" -> "How about some pancakes or an omelette?"

            "lunch" -> "You could try a salad or a sandwich."

            "dinner" -> "How about some pasta or grilled chicken?"

            else -> "Please enter Breakfast, Lunch, or Dinner."

        }

        suggestionTextView.text = suggestion

    }

}