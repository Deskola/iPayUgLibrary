package com.example.ipayuglibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var emailIT: EditText
    private lateinit var phoneIT: EditText
    private lateinit var amountIT: EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener {

            emailIT = findViewById(R.id.email_addr)
            phoneIT = findViewById(R.id.phone_num)
            amountIT = findViewById(R.id.amnt)

            val intent = Intent(this, Checkout::class.java)
            intent.putExtra("EMAIL", emailIT.text.toString())
            intent.putExtra("PHONE", phoneIT.text.toString())
            intent.putExtra("AMOUNT", amountIT.text.toString())
            startActivity(intent)
        }
    }
}