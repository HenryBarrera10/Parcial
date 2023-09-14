package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun abrirAhorros(view: View){

        val intent=Intent(this,ahorros::class.java).apply {  }
        startActivity(intent)
    }
    fun abrirSacarDinero(view: View){

        val intent=Intent(this,sacardinero::class.java).apply {  }
        startActivity(intent)
    }
    fun abrirHistorial(view: View){

        val intent=Intent(this,historial::class.java).apply {  }
        startActivity(intent)
    }


}