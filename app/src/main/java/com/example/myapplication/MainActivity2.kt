package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra("NAME")

        val address = intent.getStringExtra("ADDRESS")

        val profession = intent.getStringExtra("PROFESSION")

        val job = intent.getStringExtra("JOB")

        val food = intent.getStringExtra("FOOD")

        val nameView = findViewById<TextView>(R.id.nameEditView).apply {
            text = name
        }

        val addressView = findViewById<TextView>(R.id.addressEditView).apply {
            text = address
        }

        val professionView = findViewById<TextView>(R.id.professionEditView).apply {
            text = profession
        }

        val jobView = findViewById<TextView>(R.id.jobEditView).apply {
            text = job
        }

        val foodView = findViewById<TextView>(R.id.foodEditView).apply {
            text = food
        }

    }

}