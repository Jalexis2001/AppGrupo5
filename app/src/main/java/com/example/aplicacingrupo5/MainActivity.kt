package com.example.aplicacingrupo5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val Tag = "com.estudio.aplicacingrupo5.MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIngresar = findViewById<Button>(R.id.btnIngresar)
    }

    btnIngresar.setOnClickListener(View.OnClickListener {
        val intent = Intent(this, Menu::class.java)
        intent.putExtra(Tag, "Información")
        startActivity(intent)
    })
}