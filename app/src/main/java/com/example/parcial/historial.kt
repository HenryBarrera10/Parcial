package com.example.parcial

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class historial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.historial)
    }
    fun regresarInicio(view: View){

        val intent= Intent(this,MainActivity::class.java).apply {  }
        startActivity(intent)
    }

}