package com.example.paradoxodeepicuro.epicuro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.Button
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.view.animation.AlphaAnimation
import android.widget.TextView
import android.net.Uri
import android.widget.ImageView
import com.example.paradoxodeepicuro.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
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
// Encontre o TextView
        val textViews = listOf<TextView>(
            findViewById(R.id.textView6),
            findViewById(R.id.textView),

            // Adicione outros TextView IDs aqui, se necessário
        )

        val textViews2 = listOf<TextView>(
            findViewById(R.id.textView2),
            findViewById(R.id.textView3),
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
    val buttonGoToSecond = findViewById<Button>(R.id.button2)

    // Defina o onClickListener para o botão
    buttonGoToSecond.setOnClickListener {
        // Chame a função para mudar de Activity
        goToSecondActivity()
        }

     }
    // Função para iniciar a SecondActivity
      fun goToSecondActivity() {
        val intent = Intent(this, pagina2::class.java)
        startActivity(intent)
    }


}