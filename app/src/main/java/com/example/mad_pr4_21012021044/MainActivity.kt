package com.example.mad_pr4_21012021044

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var loginBtn = findViewById<Button>(R.id.login_button)
        var registerBtn = findViewById<Button>(R.id.register_button)

        loginBtn.setOnClickListener {
            Intent(this@MainActivity,LoginActivity::class.java)
                .also { startActivity(it) }
        }
        registerBtn.setOnClickListener {
            Intent(this@MainActivity,RegisterActivity::class.java)
                .also { startActivity(it) }
        }
    }
}