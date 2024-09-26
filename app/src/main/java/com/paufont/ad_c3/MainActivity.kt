package com.paufont.ad_c3

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContentView(R.layout.pantalla1)
        //setContentView(R.layout.pantalla2)
        //setContentView(R.layout.pantalla3)
        setContentView(R.layout.pantalla4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.pantalla4)) { v, insets -> //cambiar el numero de pantalla, cada id té el mateix nom que el layout
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i("AD_C3","onResume");
    }

    override fun onPause() {
        super.onPause()
        Log.i("AD_C3","onPause");
    }

    override fun onStart() {
        super.onStart()
        Log.i("AD_C3","onStart");
    }

    override fun onStop() {
        super.onStop()
        Log.i("AD_C3","onStop");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("AD_C3","onDestroy");
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("AD_C3","onRestart");
    }
}