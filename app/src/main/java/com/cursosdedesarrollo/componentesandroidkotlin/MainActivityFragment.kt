package com.cursosdedesarrollo.componentesandroidkotlin

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {
    var dato:String?=""
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        //accediendo a los datos de la aplicación desde el fragmento
        this.dato=(activity?.application as? Aplicacion)?.dato
        Log.d("app:Main2ActFragment","Dato:"+this.dato)
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO
        /*
        button.setOnClickListener({
            (activity as MainActivity).cargaSegunda()
        })

         */

    }
}
