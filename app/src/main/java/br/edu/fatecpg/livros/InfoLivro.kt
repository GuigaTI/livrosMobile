package br.edu.fatecpg.livros

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class InfoLivro : AppCompatActivity(R.layout.activity_info_livro) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Recupere os dados da Intent
        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")

        // Configure os elementos de texto para exibir os dados
        val txtTitulo = findViewById<TextView>(R.id.txtTitulo)
        val txtAutor = findViewById<TextView>(R.id.txtAutor)
        val fabVoltar = findViewById<FloatingActionButton>(R.id.fabVoltar)

        // Exiba os dados
        txtTitulo.text = "Título: $titulo"
        txtAutor.text = "Autor: $autor"

        fabVoltar.setOnClickListener {
            finish()  // Fecha a atividade e volta para a tela anterior
        }
    }
}
