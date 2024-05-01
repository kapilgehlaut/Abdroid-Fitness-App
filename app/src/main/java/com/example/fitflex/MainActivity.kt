package com.example.fitflex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weightInput = findViewById<EditText>(R.id.weight_input)
        val heightInput = findViewById<EditText>(R.id.height_input)
        val calculateButton = findViewById<Button>(R.id.calculate_button)

        calculateButton.setOnClickListener {
            val weight = weightInput.text.toString().toDouble()
            val height = heightInput.text.toString().toDouble()
            val bmi = calculateBMI(weight, height)
            val intent = Intent(this, BMIActivity::class.java).apply {
                putExtra("BMI", bmi)
            }
            startActivity(intent)
        }
    }

    private fun calculateBMI(weight: Double, height: Double): Double {
        return weight / (height * height)
    }
}
