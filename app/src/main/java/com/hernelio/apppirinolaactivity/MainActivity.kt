package com.hernelio.apppirinolaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.hernelio.apppirinolaactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var dato: TextView
    lateinit var imagenes1: ImageView
    lateinit var imagenes2: ImageView

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        var binding = ActivityMainBinding.inflate(layoutInflater)

        dato = binding.textonumero
        imagenes1 = binding.imageView
        imagenes2 = binding.imageView2

        setContentView(binding.root)
    }

    fun aleatorio():String{
        val valor = (1..6).random()
        return when{

            valor ==1 ->"Uno"
            valor ==2 ->"Dos"
            valor ==3 ->"Tres"
            valor ==4 ->"Cuatro"
            valor ==5 ->"Cinco"
            valor ==6 ->"Seis"
            else -> "cero"
        }

    }

    fun jugarPirinola(view: View){

        var resultado = aleatorio()

        if (resultado.equals("Uno")){
            imagenes1.setImageResource(R.drawable.uno)
            imagenes2.setImageResource(R.drawable.todosponen)
            dato.setText("todos ponen")
        }


        if (resultado.equals("Tres")){
            imagenes1.setImageResource(R.drawable.tres)
            imagenes2.setImageResource(R.drawable.pon1)
            dato.setText("Pon Uno")
        }
        if (resultado.equals("Cuatro")){
            imagenes1.setImageResource(R.drawable.cuatro)
            imagenes2.setImageResource(R.drawable.pon2)
            dato.setText("Pon Dos")
        }
        if (resultado.equals("Cinco")){
            imagenes1.setImageResource(R.drawable.cinco)
            imagenes2.setImageResource(R.drawable.toma2)
            dato.setText("Toma Dos")
        }
        if (resultado.equals("Seis")){
            imagenes1.setImageResource(R.drawable.seis)
            imagenes2.setImageResource(R.drawable.tomatodo)
            dato.setText("Toma todo")
        }


    }
}