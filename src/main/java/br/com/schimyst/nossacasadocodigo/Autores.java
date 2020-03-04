package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.util.HashSet;
import java.util.Set;

public class Autores {

    private Set<Autor> autores = new HashSet<>();

    public Set<Autor> getAutores() {
        return autores;
    }

    public void adiciona(Autor autor) {
        if(!autores.contains(autor)) {
            autores.add(autor);
        } else {
            throw new IllegalArgumentException("O email já existe na lista");
        }
    }
}