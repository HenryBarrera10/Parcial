package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var txtSaldos:TextView?=null
    private var saldoActual:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtSaldos=findViewById(R.id.txtSaldo)
        val dato=intent.getStringExtra("dato")

        if (dato != null) {

            saldoActual += dato.toInt()
        }
        txtSaldos?.text="El Saldo actual es $saldoActual"

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