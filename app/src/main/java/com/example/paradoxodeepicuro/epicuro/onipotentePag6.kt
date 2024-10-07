package com.example.paradoxodeepicuro.epicuro

import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.paradoxodeepicuro.R

class onipotentePag6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onipotente_pag6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textViews = listOf<TextView>(
            findViewById(R.id.textView1311),

            // Adicione outros TextView IDs aqui, se necessário
        )

        val textViews2 = listOf<TextView>(
            findViewById(R.id.textView1411),

            // Adicione outros TextView IDs aqui, se necessário
        )

        // Crie a animação de fade in
        val fadeIn = AlphaAnimation(0.0f, 1.0f).apply {
            duration = 1000 // duração da animação em milissegundos (2 segundos)
            fillAfter = true // mantém o estado após a animação terminar
        }
        val fadeIn2 = AlphaAnimation(0.0f, 1.0f).apply {
            duration = 2000 // duração da animação em milissegundos (2 segundos)
            fillAfter = true // mantém o estado após a animação terminar
        }

        // Inicie a animação em cada TextView
        textViews.forEach { it.startAnimation(fadeIn) }
        textViews2.forEach { it.startAnimation(fadeIn2) }
    }
}