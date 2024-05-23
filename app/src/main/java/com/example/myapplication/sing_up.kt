package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class sing_up: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sing_up)

        val button1: Button = findViewById(R.id.button3)
        val button2: Button = findViewById(R.id.button2)

        button2.setOnClickListener {
            val intent = Intent(this, frist_page::class.java)
            startActivity(intent)
        }

        button1.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}