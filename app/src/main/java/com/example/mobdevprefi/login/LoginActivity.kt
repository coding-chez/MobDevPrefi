package com.example.mobdevprefi.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mobdevprefi.R
import com.example.mobdevprefi.home.HomeActivity
import com.example.mobdevprefi.register.RegisterActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername: EditText = findViewById(R.id.etLoginUsername)
        val etPassword: EditText = findViewById(R.id.etLoginPassword)
        val btnLogin: Button = findViewById(R.id.btnLogin)
        val tvSignUpLink: TextView = findViewById(R.id.tvSignUpLink)

        // Retrieve credentials from RegisterActivity
        val receivedUsername = intent.getStringExtra("username")
        val receivedPassword = intent.getStringExtra("password")

        if (receivedUsername != null && receivedPassword != null) {
            etUsername.setText(receivedUsername)
            etPassword.setText(receivedPassword)
        }

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter login credentials!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (username == receivedUsername && password == receivedPassword) {
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid username or password!", Toast.LENGTH_SHORT).show()
            }
        }

        tvSignUpLink.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
