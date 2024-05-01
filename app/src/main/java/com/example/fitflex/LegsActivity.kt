
package com.example.fitflex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LegsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legs)

        val button1 = findViewById<Button>(R.id.button16)
        val button2 = findViewById<Button>(R.id.button17)
        val button3 = findViewById<Button>(R.id.button18)
        val button4 = findViewById<Button>(R.id.button19)
        val button5 = findViewById<Button>(R.id.button20)

        button1.setOnClickListener {
            val intent = Intent(this, LegsExerciseDescription::class.java)
            // Pass an identifier for the image
            intent.putExtra("imageIdentifier", "image6")
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this,  LegsExerciseDescription::class.java)
            // Pass an identifier for the image
            intent.putExtra("imageIdentifier", "image7")
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this,  LegsExerciseDescription::class.java)
            // Pass an identifier for the image
            intent.putExtra("imageIdentifier", "image8")
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this,  LegsExerciseDescription::class.java)
            // Pass an identifier for the image
            intent.putExtra("imageIdentifier", "image9")
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this,  LegsExerciseDescription::class.java)
            // Pass an identifier for the image
            intent.putExtra("imageIdentifier", "image10")
            startActivity(intent)
        }
    }
}