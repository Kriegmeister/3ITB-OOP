package com.example.a3itb_oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declarations of buttons
        var buttonRegister: Button = findViewById(R.id.btnRegister)
        var buttonMainMenu: Button = findViewById(R.id.btnMainMenu)

        //Declaration of Edit Texts
        var editFirstName: EditText = findViewById(R.id.edtFirstname)
        var editLastName: EditText = findViewById(R.id.edtLastname)
        var editUsername: EditText = findViewById(R.id.edtUsername)
        var editPassword: EditText = findViewById(R.id.edtPassword)
        var editEmail: EditText = findViewById(R.id.edtEmail)
        var editBirthday: EditText = findViewById(R.id.edtBirthDate)
        var editMobileNumber: EditText = findViewById(R.id.edtMobileNumber)

        //Declaration of Spinner
        var spinnerAccess: Spinner = findViewById(R.id.spnAccess)

        //button setOnCLickListeners
        buttonRegister.setOnClickListener { }

        buttonMainMenu.setOnClickListener { }

        //Populating of Spinner
        val accesses = resources.getStringArray(R.array.Accesses)
        val adapter = ArrayAdapter(this, R.layout.activity_main, accesses)
        spinnerAccess.adapter = adapter
    }
}