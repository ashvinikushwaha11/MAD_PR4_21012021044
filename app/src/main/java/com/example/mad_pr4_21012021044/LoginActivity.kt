package com.example.mad_pr4_21012021044

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signup:Button=findViewById(R.id.sign_up)
        signup.setOnClickListener {
            Intent(this,RegisterActivity::class.java).also { startActivity(it) }
        }
    }
}