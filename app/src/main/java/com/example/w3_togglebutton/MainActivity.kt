package com.example.w3_togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val button=findViewById<ToggleButton>(R.id.toggleButton)
        button.setOnClickListener{
            Toast.makeText(applicationContext,
                "Кнопка работает, а создатель нет",
                Toast.LENGTH_LONG).show()
        }
    }
}