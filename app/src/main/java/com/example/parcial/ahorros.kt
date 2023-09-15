package com.example.parcial

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class ahorros : AppCompatActivity() {

    private var txtSaldoAhorro: EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ahorros)
        txtSaldoAhorro=findViewById(R.id.txtSaldoAhorro)
    }



    fun regresarInicio(view: View){
        var saldo =txtSaldoAhorro?.text.toString()
        val intent= Intent(this,MainActivity::class.java)
        intent.putExtra("dato", saldo)

        startActivity(intent)
    }

}