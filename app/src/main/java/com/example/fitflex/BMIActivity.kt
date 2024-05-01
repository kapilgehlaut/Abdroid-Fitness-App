package com.example.fitflex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BMIActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        val bmiText = findViewById<TextView>(R.id.bmi_text)
        val dietText = findViewById<TextView>(R.id.diet_text)
        val view_exercise = findViewById<Button>(R.id.view_exercises_button)

        val bmi = intent.getDoubleExtra("BMI", 0.0)
        bmiText.text = String.format("Your BMI: %.2f", bmi)

        val dietAdvice = if (bmi < 18.5) {
            "You should focus on increasing your calorie intake with healthy foods."
        } else {
            "You should maintain a balanced diet to stay healthy."
        }
        dietText.text = dietAdvice

        val ToastText="View Exercises by clicking in the Button"

        Toast.makeText(applicationContext, ToastText, Toast.LENGTH_LONG).show()

        view_exercise.setOnClickListener {
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }

    }
}
