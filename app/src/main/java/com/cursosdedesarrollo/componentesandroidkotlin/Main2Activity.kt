package com.cursosdedesarrollo.componentesandroidkotlin

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Main2Activity : AppCompatActivity() {

    var mensaje:String =""

    private var dato: String? =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        val textView = findViewById<View>(R.id.textView) as TextView
        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        setSupportActionBar(toolbar)
        try {
            this.mensaje=intent.getStringExtra("Mensaje")
        }catch (e:Exception){
            println("por si acaso")
        }
        textView.setText(this.mensaje)

        //accediendo a los datos de la aplicación
        this.dato=(application as? Aplicacion)?.dato
        Log.d("app:Main2Activity","Dato:"+this.dato)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
