package br.edu.fatecpg.livros

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class InfoLivro : AppCompatActivity(R.layout.activity_info_livro) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val txtTitulo = findViewById<TextView>(R.id.txtTitulo)
        val txtAutor = findViewById<TextView>(R.id.txtAutor)
        val fabVoltar = findViewById<FloatingActionButton>(R.id.fabVoltar)

        val titulo = intent.getStringExtra("Titulo")
        val autor = intent.getStringExtra("Autor")

        txtTitulo.text = "Título: $titulo"
        txtAutor.text = "Autor: $autor"

        fabVoltar.setOnClickListener {
            finish()
        }
    }
}