package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class new_project : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_project)

        val button1: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button4)



        button3.setOnClickListener {
            val intent = Intent(this, MainActivity_user::class.java)
            startActivity(intent)
        }



        button1.setOnClickListener {
            val intent = Intent(this, MainActivity_user::class.java)
            startActivity(intent)
        }



    }
}