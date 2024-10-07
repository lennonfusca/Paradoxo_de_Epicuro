package com.example.paradoxodeepicuro

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
import com.example.paradoxodeepicuro.epicuro.MainActivity
import com.example.paradoxodeepicuro.epicuro.pagina2

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
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
            findViewById(R.id.textView31),

            // Adicione outros TextView IDs aqui, se necessário
        )


        // Crie a animação de fade in
        val fadeIn = AlphaAnimation(0.0f, 1.0f).apply {
            duration = 1000 // duração da animação em milissegundos (2 segundos)
            fillAfter = true // mantém o estado após a animação terminar
        }


        // Inicie a animação em cada TextView
        textViews.forEach { it.startAnimation(fadeIn) }


        // Encontre o botão pelo ID
        val buttonGoToSecond = findViewById<Button>(R.id.button1)

        // Defina o onClickListener para o botão
        buttonGoToSecond.setOnClickListener {
            // Chame a função para mudar de Activity
            goToSecondActivity()
        }

    }
    // Função para iniciar a SecondActivity
    fun goToSecondActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}