package br.edu.fatecpg.livros.dao

import br.edu.fatecpg.livros.model.livro

class LivroDao {
    private var livro: livro? = null

    fun inserir(livro: livro) {
        this.livro = livro
    }

    fun getUltimo(): livro? {
        return livro
    }
}
