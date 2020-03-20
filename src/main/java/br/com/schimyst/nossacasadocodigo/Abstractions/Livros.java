package br.com.schimyst.nossacasadocodigo.Abstractions;

import br.com.schimyst.nossacasadocodigo.Model.Livro;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Livros {

    private Set<Livro> livros = new HashSet<>();

    public Set<Livro> getLivros() {
        return livros;
    }

    public void adiciona(Livro livro) {
        if(!livros.contains(livro)) {
            livros.add(livro);
        } else {
            throw new IllegalArgumentException("O email já existe na lista de autores!");
        }
    }

    public void getLivroByTitulo(String titulo) {
        if(titulo.isEmpty()) {
            throw new IllegalArgumentException("Você precisa passar o titulo do livro para buscá-lo!");
        }
        Optional<Livro> optionalLivro = livros.stream()
                .filter(livro -> titulo.equals(livro.getTitulo()))
                .findAny();

        System.out.println(optionalLivro);
    }
}