package com.example.mad_practical_2_21012011169

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var textView: TextView? = null
    val TAG = "MainActivity"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate() method is called")

    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart() method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("OnResume() method is called")
    }
    fun showMessage(msg:String){
        Log.i(TAG, "$msg")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }
}

