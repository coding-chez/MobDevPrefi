package com.example.mobdevprefi.register

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mobdevprefi.R
import com.example.mobdevprefi.login.LoginActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etFirstName: EditText = findViewById(R.id.etFirstName)
        val etLastName: EditText = findViewById(R.id.etLastName)
        val etUsername: EditText = findViewById(R.id.etUsername)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val etConfirmPassword: EditText = findViewById(R.id.etConfirmPassword)
        val btnSignUp: Button = findViewById(R.id.btnSignUp)
        val tvLoginLink: TextView = findViewById(R.id.tvLoginLink)

        btnSignUp.setOnClickListener {
            val firstName = etFirstName.text.toString().trim()
            val lastName = etLastName.text.toString().trim()
            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val confirmPassword = etConfirmPassword.text.toString().trim()

            if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() ||
                password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "Please fill out all fields!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password != confirmPassword) {
                Toast.makeText(this, "Passwords do not match!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Registration Successful!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("password", password)
            startActivity(intent)
            finish()
        }

        tvLoginLink.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
