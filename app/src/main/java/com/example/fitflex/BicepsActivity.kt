package com.example.fitflex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BicepsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biceps)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)

        button1.setOnClickListener {
            val intent = Intent(this, BicepsExerciseDescription::class.java)
            // Pass an identifier for the image
            intent.putExtra("imageIdentifier", "image1")
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this,  BicepsExerciseDescription::class.java)
            // Pass an identifier for the image
            intent.putExtra("imageIdentifier", "image2")
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this,  BicepsExerciseDescription::class.java)
            // Pass an identifier for the image
            intent.putExtra("imageIdentifier", "image3")
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this,  BicepsExerciseDescription::class.java)
            // Pass an identifier for the image
            intent.putExtra("imageIdentifier", "image4")
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this,  BicepsExerciseDescription::class.java)
            // Pass an identifier for the image
            intent.putExtra("imageIdentifier", "image5")
            startActivity(intent)
        }
    }
}
