
package com.example.fitflex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class BackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back)

        val button1 = findViewById<Button>(R.id.button6)
        val button2 = findViewById<Button>(R.id.button7)
        val button3 = findViewById<Button>(R.id.button8)
        val button4 = findViewById<Button>(R.id.button9)
        val button5 = findViewById<Button>(R.id.button10)
    }
}