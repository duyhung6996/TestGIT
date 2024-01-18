package com.example.testgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv1 = findViewById<TextView>(R.id.tv_1)
        tv1.text = "Test 123"
        val tv2 = findViewById<TextView>(R.id.tv_2)
        tv2.text = "Deo Hop Ly Cai LOL"
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            Toast.makeText(this,"ĐCM deo hop ly Cai LOL",Toast.LENGTH_SHORT).show()
        }
    }
}