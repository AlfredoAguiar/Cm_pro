package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_)

        val button1: Button = findViewById(R.id.button3)
        val button2: Button = findViewById(R.id.button2)

        button2.setOnClickListener {
            val intent = Intent(this, frist_page::class.java)
            startActivity(intent)
        }

        button1.setOnClickListener {
            val intent = Intent(this, MainActivity_user::class.java)
            startActivity(intent)
        }

}
}