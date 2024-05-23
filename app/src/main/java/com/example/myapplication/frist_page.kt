package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class frist_page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.start_page)

        val button1: Button = findViewById(R.id.button3)
        val button2: Button = findViewById(R.id.button4)

        button1.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, sing_up::class.java)
            startActivity(intent)
        }
    }

    private fun enableEdgeToEdge() {
        // This is a placeholder implementation.
        // Actual implementation should adjust the window insets for edge-to-edge display.
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}