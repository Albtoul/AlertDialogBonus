package com.example.alertdialogbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tv2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tv2 = findViewById(R.id.textView2)
        val str1 = intent.getStringExtra("name")
        tv2.text="$str1"
    }
}