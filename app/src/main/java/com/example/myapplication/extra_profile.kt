package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class extra_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.extra_profile)

        val button1: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        button1.setOnClickListener {
            val intent = Intent(this, MainActivity_user::class.java)
            startActivity(intent)
        }


        button3.setOnClickListener {
            val intent = Intent(this, edit_profile::class.java)
            startActivity(intent)
        }
    }
}