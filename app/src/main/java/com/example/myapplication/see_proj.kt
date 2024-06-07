package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View.GONE
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class see_proj : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.proj_see)

        val button1: Button = findViewById(R.id.button2)
        val button2: Button = findViewById(R.id.button3)
        val button3: Button = findViewById(R.id.button4)
        val button4: Button = findViewById(R.id.button0)
//se tiver logado manager e nao admin:
        //button2.visibility = GONE
        //button3.visibility = GONE
        button1.setOnClickListener {
            val intent = Intent(this, MainActivity_user::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, new_project::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, MainActivity_user::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, new_task::class.java)
            startActivity(intent)
        }

    }
}