package com.example.fitflex

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class BicepsExerciseDescription : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bicepsexercisedescription)

        val imageView = findViewById<ImageView>(R.id.imageView)

        // Retrieve the identifier for the image from the intent
        val imageIdentifier = intent.getStringExtra("imageIdentifier")

        // Load the image based on the identifier
        when (imageIdentifier) {
            "image1" -> imageView.setImageResource(R.drawable.bicepsimage1)
            "image2" -> imageView.setImageResource(R.drawable.bicepsimages2)
            "image3" -> imageView.setImageResource(R.drawable.bicepsercise2)
            "image4" -> imageView.setImageResource(R.drawable.bicepsimages4)
            "image5" -> imageView.setImageResource(R.drawable.bicepsimage5)
        }
    }
}
