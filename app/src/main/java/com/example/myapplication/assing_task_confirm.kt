package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class assing_task_confirm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.assin_conf)

        val button1: Button = findViewById(R.id.button2)
        val button2: Button = findViewById(R.id.button3)



        button1.setOnClickListener {
            val intent = Intent(this, user_add::class.java)
            startActivity(intent)
        }


        button2.setOnClickListener {
            val intent = Intent(this, MainActivity_user::class.java)
            startActivity(intent)
        }



    }
}