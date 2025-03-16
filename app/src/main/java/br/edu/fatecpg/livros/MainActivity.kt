package br.edu.fatecpg.livros

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.livros.dao.LivroDao
import br.edu.fatecpg.livros.model.livro

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtTitulo = findViewById<EditText>(R.id.edtTitulo)
        val edtAutor = findViewById<EditText>(R.id.edtAutor)
        val btnCadastrar = findViewById<Button>(R.id.btnSalvar)

        btnCadastrar.setOnClickListener {
            // Criar um objeto Livro
            val livro = livro(edtTitulo.text.toString(), edtAutor.text.toString())

            // Passar os dados para a segunda tela
            val intent = Intent(this, InfoLivro::class.java)
            intent.putExtra("titulo", livro.titulo)
            intent.putExtra("autor", livro.autor)

            startActivity(intent)
        }
    }
}
