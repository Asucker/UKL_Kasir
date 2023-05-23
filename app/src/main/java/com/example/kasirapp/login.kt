package com.example.kasirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class login : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtUsername = findViewById(R.id.editTextId)
        edtPassword = findViewById(R.id.editTextTextPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        var emptyEmail: Boolean = false
        var emptyPassword: Boolean = false

        if (edtUsername.text.toString().trim().length == 0) {
            edtUsername.error = "Email tidak boleh kosong"
            emptyEmail = true
        }

        if (edtPassword.text.toString().trim().length == 0) {
            edtPassword.error = "Password tidak boleh kosong"
            emptyPassword = true
        }

        if (!emptyEmail && !emptyPassword) {
            val dataReceived = Intent(this@login, MainActivity::class.java)
            val email = edtUsername.text.toString()
            dataReceived.putExtra("String", email)
            startActivity(dataReceived)
        }

        }
    }
