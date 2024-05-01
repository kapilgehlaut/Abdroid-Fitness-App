package com.example.fitflex

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LegsExerciseDescription : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legsexercisedescription)

        val imageView = findViewById<ImageView>(R.id.imageView)

        // Retrieve the identifier for the image from the intent
        val imageIdentifier = intent.getStringExtra("imageIdentifier")

        // Load the image based on the identifier
        when (imageIdentifier) {
            "image6" -> imageView.setImageResource(R.drawable.legserercise1)
            "image7" -> imageView.setImageResource(R.drawable.legsexercise2)
            "image8" -> imageView.setImageResource(R.drawable.legsexercise3)
            "image9" -> imageView.setImageResource(R.drawable.legexercise4)
            "image10" -> imageView.setImageResource(R.drawable.legexercise5)
        }
    }
}
