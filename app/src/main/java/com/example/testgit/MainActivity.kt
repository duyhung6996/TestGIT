package com.example.testgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv1 = findViewById<TextView>(R.id.tv_1)
        tv1.text = "Hello"
        val tv2 = findViewById<TextView>(R.id.tv_2)
        tv2.text = "ManPD"
    }
}