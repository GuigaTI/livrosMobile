package br.edu.fatecpg.livros

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtTitulo = findViewById<EditText>(R.id.edtTitulo)
        val edtAutor = findViewById<EditText>(R.id.edtAutor)
        val btnCadastrar = findViewById<Button>(R.id.btnSalvar)

        btnCadastrar.setOnClickListener {
            val intent = Intent(this,InfoLivro::class.java)
            intent.putExtra("Titulo",edtTitulo.text.toString())
            intent.putExtra("Autor",edtAutor.text.toString())
            startActivity(intent)
        }


    }
}