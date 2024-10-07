package com.example.paradoxodeepicuro.epicuro

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.paradoxodeepicuro.R

class mauexiste9 : AppCompatActivity() {

    private lateinit var  buttonShowText: Button
    private lateinit var  buttonShowText2: Button
    private lateinit var  buttonShowText3: Button
    private lateinit var textViewHidden: TextView
    private lateinit var textViewHidden2: TextView
    private lateinit var textViewHidden3: TextView
    private var isTextVisible = false // Variável para manter o estado de visibilidade do texto

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mauexiste9)
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


        buttonShowText = findViewById(R.id.button11)
        buttonShowText2 = findViewById(R.id.button14)
        buttonShowText3 = findViewById(R.id.button15)
        textViewHidden = findViewById(R.id.textView27)
        textViewHidden2 = findViewById(R.id.textView28)
        textViewHidden3 = findViewById(R.id.textView29)
        textViewHidden.visibility = View.VISIBLE
        textViewHidden2.visibility = View.GONE
        textViewHidden3.visibility = View.GONE
        buttonShowText.setBackgroundColor(ContextCompat.getColor(this@mauexiste9, R.color.green))

        val fadeIn = AlphaAnimation(0.0f, 1.0f).apply {
            duration = 1500 // duração da animação em milissegundos (2 segundos)
            fillAfter = true // mantém o estado após a animação terminar
        }

        textViewHidden.startAnimation(fadeIn)


        buttonShowText.setOnClickListener {
            if (isTextVisible) {
                // Oculta o texto
                textViewHidden.visibility = View.GONE
                buttonShowText.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.blue
                ))
            } else {
                // Mostra o texto
                textViewHidden2.visibility = View.GONE
                textViewHidden3.visibility = View.GONE
                textViewHidden.visibility = View.VISIBLE
                textViewHidden2.clearAnimation()
                textViewHidden3.clearAnimation()
                textViewHidden.startAnimation(fadeIn)
                buttonShowText.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.green
                ))
                buttonShowText2.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.blue
                ))
                buttonShowText3.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.blue
                ))
            }

        }

        buttonShowText2.setOnClickListener {
            if (isTextVisible) {
                // Oculta o texto
                textViewHidden2.visibility = View.GONE
                buttonShowText2.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.blue
                ))
            } else {
                // Mostra o texto
                textViewHidden.visibility = View.GONE
                textViewHidden3.visibility = View.GONE
                textViewHidden2.visibility = View.VISIBLE
                textViewHidden3.clearAnimation()
                textViewHidden.clearAnimation()
                textViewHidden2.startAnimation(fadeIn)
                buttonShowText2.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.green
                ))
                buttonShowText.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.blue
                ))
                buttonShowText3.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.blue
                ))
            }

        }
        buttonShowText3.setOnClickListener {
            if (isTextVisible) {
                // Oculta o texto
                textViewHidden3.visibility = View.GONE
                buttonShowText3.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.blue
                ))
            } else {
                // Mostra o texto
                textViewHidden.visibility = View.GONE
                textViewHidden2.visibility = View.GONE
                textViewHidden3.visibility = View.VISIBLE
                textViewHidden2.clearAnimation()
                textViewHidden.clearAnimation()
                textViewHidden3.startAnimation(fadeIn)
                buttonShowText3.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.green
                ))
                buttonShowText.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.blue
                ))
                buttonShowText2.setBackgroundColor(ContextCompat.getColor(this@mauexiste9,
                    R.color.blue
                ))
            }

        }
    }
}