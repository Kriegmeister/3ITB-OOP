package com.example.a3itb_oop

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import java.lang.Exception
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declarations of CLasses
        var registrationObject = RegistrationClass()

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
        editBirthday.setOnClickListener {
            val calendar : Calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                this,
                {it, year, month, day ->
                    val dat = (day.toString() + '-' + (month + 1) + '-' + year)
                    editBirthday.setText(dat)
                }, year, month, day
            )
        }
        buttonRegister.setOnClickListener {
            try {
                var userData = UserInfo(editUsername.text.toString(),
                                        editPassword.text.toString(),
                                        editFirstName.text.toString(),
                                        editLastName.text.toString(),
                                        editEmail.text.toString(),
                                        editMobileNumber.text.toString(),
                                        editBirthday.text.toString(),
                                        spinnerAccess.selectedItem.toString())

                registrationObject.AddToArray(userData)
            }catch (e: Exception) {
                Log.e("error_garma", e.message.toString())
            }
        }
        buttonMainMenu.setOnClickListener { }

        //Populating of Spinner
        val accesses = resources.getStringArray(R.array.Accesses)
        val adapter = ArrayAdapter(this, R.layout.spinner_activity, R.id.txtSpinner, accesses)
        spinnerAccess.adapter = adapter
    }
}