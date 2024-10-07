package com.example.paradoxodeepicuro.epicuro

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.paradoxodeepicuro.R

class pagina3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pagina3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val footerImagemView = findViewById<ImageView>(R.id.imageView6)
        val footerTextView3 = findViewById<TextView>(R.id.textView13)
        footerTextView3.text = "Desenvolvido por Lennon Moreira©"


        footerTextView3.setOnClickListener {
            val url = "https://www.linkedin.com/in/lennon-moreira-8a094b21b/" // Substitua pelo seu URL
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        footerImagemView.setOnClickListener {
            val url = "https://www.linkedin.com/in/lennon-moreira-8a094b21b/" // Substitua pelo seu URL
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val textViews = listOf<TextView>(
            findViewById(R.id.textView5),
            findViewById(R.id.textView4),

            // Adicione outros TextView IDs aqui, se necessário
        )

        val textViews2 = listOf<TextView>(
            findViewById(R.id.textView7),
            findViewById(R.id.textView9),
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


        // Encontre o botão pelo ID
        val buttonGoToSecond = findViewById<Button>(R.id.button6)
        val buttonGoToSecond2 = findViewById<Button>(R.id.button5)

        // Defina o onClickListener para o botão
        buttonGoToSecond.setOnClickListener {
            // Chame a função para mudar de Activity
            goToSecondActivity()
        }
        // Defina o onClickListener para o botão
        buttonGoToSecond2.setOnClickListener {
            // Chame a função para mudar de Activity
            goToSecondActivity2()
        }


    }
    // Função para iniciar a SecondActivity
    fun goToSecondActivity() {
        val intent = Intent(this, pagina4::class.java)
        startActivity(intent)
    }
    // Função para iniciar a SecondActivity
    fun goToSecondActivity2() {
        val intent = Intent(this, pagina5::class.java)
        startActivity(intent)
    }


}