package com.example.fitflex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ExerciseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        val chest = findViewById<Button>(R.id.button_chest)
        val back = findViewById<Button>(R.id.button_back)
        val shoulder = findViewById<Button>(R.id.button_shoulder)
        val legs = findViewById<Button>(R.id.button_legs)
        val biceps = findViewById<Button>(R.id.button_biceps)

        biceps.setOnClickListener {
            val intent = Intent(this, BicepsActivity::class.java)
            startActivity(intent)
        }

            back.setOnClickListener {
                val intent = Intent(this, BackActivity::class.java)
                startActivity(intent)
            }

                chest.setOnClickListener {
                    val intent = Intent(this, ChestActivity::class.java)
                    startActivity(intent)
                }

                    legs.setOnClickListener {
                        val intent = Intent(this, LegsActivity::class.java)
                        startActivity(intent)
                    }

                        shoulder.setOnClickListener {
                            val intent = Intent(this, ShoulderActivity::class.java)
                            startActivity(intent)
                        }


                    }
                }
