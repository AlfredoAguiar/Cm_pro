package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class edit_users_adim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_users_admin)

        val button1: Button = findViewById(R.id.button4)
        val button2: Button = findViewById(R.id.button5)
        val button3: Button = findViewById(R.id.button3)

        button1.setOnClickListener {
            val intent = Intent(this, extra_profile::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, extra_profile::class.java)
            startActivity(intent)
        }


        button3.setOnClickListener {
            val intent = Intent(this, extra_profile::class.java)
            startActivity(intent)
        }
    }
}