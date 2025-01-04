package com.example.laba1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PersonaActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_persona1)

        val Name: TextView = findViewById(R.id.person_name_one)
        val text: TextView =findViewById(R.id.person_info)
        val buttonBack: Button = findViewById(R.id.button_back)


        Name.text = intent.getStringExtra("personName")
        text.text = intent.getStringExtra("personInfo")


            buttonBack.setOnClickListener {

                val intent = Intent(this, MainActivity::class.java)

                startActivity(intent)


            }








    }
    }
