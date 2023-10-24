package com.example.a3itb_oop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class CustomDialog : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView : View = inflater.inflate(R.layout.activity_fragment_dialog, container, false)
        var bundle = arguments
        var buttonFragment : Button = rootView.findViewById(R.id.btnDialog)
        buttonFragment.setOnClickListener {
            var newMessage = bundle!!.getString("bdleText")
            var textFragment : TextView = rootView.findViewById(R.id.txtFragment)
            textFragment.setText(newMessage.toString())
        }

        return rootView
    }
}