package com.example.a3itb_oop

import android.util.Log
import java.lang.Exception

var arrayUser = ArrayList<UserInfo>();

class RegistrationClass {

    public fun AddToArray(userInfo : UserInfo) {

        try {
            arrayUser.add(userInfo)
            ShowArray()
        }catch (e: Exception) {
            Log.e("error_garma", e.message.toString())
        }
    }

    private fun ShowArray() {
        for(user in arrayUser) {
            Log.i("info_garma",user.username)
        }
    }
}