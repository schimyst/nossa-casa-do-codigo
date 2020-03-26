package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Abstractions.Livros;
import br.com.schimyst.nossacasadocodigo.Model.Livro;

import java.util.Optional;

public class LivroRepository {

    private Livros livros;

    public LivroRepository(Livros livros) {
        this.livros = livros;
    }

    public Optional<Livro> getLivroByTitulo(String titulo) {
        if(titulo.isEmpty()) {
            throw new IllegalArgumentException("Você precisa passar o titulo do livro para buscá-lo!");
        }
        Optional<Livro> optionalLivro = livros.getLivros().stream()
                .filter(livro -> titulo.equals(livro.getTitulo()))
                .findAny();

        return optionalLivro;
    }
}