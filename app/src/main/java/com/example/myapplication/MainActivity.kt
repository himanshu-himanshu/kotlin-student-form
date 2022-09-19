package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDetails(view: View) {

        if( view.id == R.id.submitButton ) {
            val nameEditText = findViewById<EditText>(R.id.editNameView)
            val name = nameEditText.text.toString()

            val addressEditText = findViewById<EditText>(R.id.editAddressView)
            val address = addressEditText.text.toString()

            val professionEditText = findViewById<EditText>(R.id.editProfessionView)
            val profession = professionEditText.text.toString()

            val jobEditText = findViewById<EditText>(R.id.editDreamJobView)
            val job = jobEditText.text.toString()

            val foodEditText = findViewById<EditText>(R.id.editFoodView)
            val food = foodEditText.text.toString()

            val nameEmpty = TextUtils.isEmpty(name)

            val addressEmpty = TextUtils.isEmpty(address)

            val professionEmpty = TextUtils.isEmpty(profession)

            val jobEmpty = TextUtils.isEmpty(job)

            val foodEmpty = TextUtils.isEmpty(food)

            if(nameEmpty || addressEmpty || professionEmpty || jobEmpty || foodEmpty) {
                Toast.makeText(applicationContext, "Fields Can not be empty", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, MainActivity2::class.java).apply {
                    putExtra("NAME", name)
                    putExtra("ADDRESS", address)
                    putExtra("PROFESSION", profession)
                    putExtra("JOB", job)
                    putExtra("FOOD", food)
                }

                startActivity(intent)
            }

            //Toast.makeText(applicationContext, name, Toast.LENGTH_LONG).show()
        }
    }

}