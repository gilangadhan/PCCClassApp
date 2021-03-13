package com.dicoding.pccclassapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.dicoding.pccclassapp.hero.ShowListActivity

class MainActivity : AppCompatActivity() {
    // 2 TextView, 1 ImageView, dan 1 Button
    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameTextView = findViewById(R.id.name)
        emailTextView = findViewById(R.id.email)
        submitButton = findViewById(R.id.button)

        submitButton.setOnClickListener {
//            val name = nameTextView.text
//            val email = emailTextView.text
//            Toast.makeText(this, "Nama saya adalah ${name}.\nEmail saya adalah ${email}.", Toast.LENGTH_SHORT).show()

            startActivity(Intent(this@MainActivity, ShowListActivity::class.java))
        }
    }
}