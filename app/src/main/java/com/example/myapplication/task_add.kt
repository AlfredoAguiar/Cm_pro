package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class task_add : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tasks_add)

        val button1: Button = findViewById(R.id.button2)
        val button2: Button = findViewById(R.id.button3)
        val button3: Button = findViewById(R.id.button4)
        val button4: Button = findViewById(R.id.button5)


        button1.setOnClickListener {
            val intent = Intent(this, MainActivity_user::class.java)
            startActivity(intent)
        }


        button2.setOnClickListener {
            val intent = Intent(this, user_add::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, user_add::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, user_add::class.java)
            startActivity(intent)
        }


    }
}