
package com.example.fitflex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ChestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chest)

        val button1 = findViewById<Button>(R.id.button11)
        val button2 = findViewById<Button>(R.id.button12)
        val button3 = findViewById<Button>(R.id.button13)
        val button4 = findViewById<Button>(R.id.button14)
        val button5 = findViewById<Button>(R.id.button15)
    }
}