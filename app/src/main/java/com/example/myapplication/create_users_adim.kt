package com.example.myapplication

import MainActivity_user_admin
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class create_users_adim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_user_or_manager)

        val button1: Button = findViewById(R.id.button4)
        val button2: Button = findViewById(R.id.button5)
        val button3: Button = findViewById(R.id.button2)

        button1.setOnClickListener {
            val intent = Intent(this, MainActivity_user_admin::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, MainActivity_user_admin::class.java)
            startActivity(intent)
        }


        button3.setOnClickListener {
            val intent = Intent(this, MainActivity_user_admin::class.java)
            startActivity(intent)
        }
    }
}