package com.example.aplicacingrupo5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    val Tag = "com.estudio.aplicacingrupo5.MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnQue = findViewById<Button>(R.id.btnQue)
        val btnVym = findViewById<Button>(R.id.btnVym)
        val btnRegimenes = findViewById<Button>(R.id.btnRegimenes)
        val btnServicios = findViewById<Button>(R.id.btnServicios)
    }

    btnQue.setOnClickListener(View.OnClickListener {
        val intent = Intent(this, Informacion::class.java)
        intent.putExtra(Tag, "¿Qué brinda?")
        startActivity(intent)
    })
    btnVym.setOnClickListener(View.OnClickListener {
        val intent = Intent(this, Informacion::class.java)
        intent.putExtra(Tag, "Visión y Misión")
        startActivity(intent)
    })
    btnRegimenes.setOnClickListener(View.OnClickListener {
        val intent = Intent(this, Informacion::class.java)
        intent.putExtra(Tag, "Regimenes")
        startActivity(intent)
    })
    btnServicios.setOnClickListener(View.OnClickListener {
        val intent = Intent(this, Informacion::class.java)
        intent.putExtra(Tag, "Servicios")
        startActivity(intent)
    })
}