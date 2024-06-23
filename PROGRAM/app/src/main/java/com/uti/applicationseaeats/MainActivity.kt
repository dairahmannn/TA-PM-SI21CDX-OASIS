package com.uti.applicationseaeats

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var button1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById<View>(R.id.button1) as Button

        button1!!.setOnClickListener { v: View? ->
            val intent1 = Intent(
                applicationContext,
                MenuUtama::class.java
            )
            startActivity(intent1)
        }
    }
}