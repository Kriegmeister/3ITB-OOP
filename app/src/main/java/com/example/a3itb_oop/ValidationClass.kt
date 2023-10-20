package com.example.a3itb_oop

import android.util.Log
import java.util.regex.Pattern

class ValidationClass {

    public fun ValidatePassword(password : String = "Sample123") : Boolean {
        //First Validation - Check if null or empty
        if (!password.isNullOrBlank()){
            Log.i("info_garma","Pass 1")
            //Second Validation - Check the length of the string
            if(password.length >= 5 && password.length <= 8){
                Log.i("info_garma","Pass 2")
                //Third Validation - Check lower and upper case
                if(Regex("[A-Z]").containsMatchIn(password) && Regex("[a-z]").containsMatchIn(password)  ) {
                    Log.i("info_garma","Pass 3")
                    //Fourth Validation - Check Numbers
                    if(Regex("[0-9]").containsMatchIn(password)) {
                        Log.i("info_garma","Pass 4")
                        //Fifth Validation - Check characters
                        Log.i("info_garma","Pass 5")
                        val special = Regex("[!@#$%^&*()_+=|<>?{}\\[\\]]~-")
                        if(special.containsMatchIn(password)){
                            Log.i("info_garma","tama")
                        }else{
                            Log.i("info_garma", "de wala di ka special")
                        }
                    }else{
                        Log.i("info_garma", "walang numbers")
                    }
                }else{
                    Log.i("info_garma", "mali walang caps")
                }


            }else{
                Log.i("info_garma", "too short")
            }
        } else{
            Log.i("info_garma", "walang laman")
        }
        return false

    }
}


//Shadow Realm
/*var char_password = password.toCharArray()
               var (isUpper, isLower) = char_password.partition { it.isUpperCase() }*/