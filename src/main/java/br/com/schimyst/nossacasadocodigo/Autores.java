package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.util.HashSet;
import java.util.Set;

public class Autores {

    private Set<Autor> autores = new HashSet<>();

    public Set<Autor> getAutores() {
        return autores;
    }

    private boolean verificaEmailDuplicado(Autor novoAutor) {
        if(autores.contains(novoAutor)) {
            return false;
        }
        return true;
    }

    public void adiciona(Autor autor) {
        if(verificaEmailDuplicado(autor)) {
            autores.add(autor);
        } else {
            throw new IllegalArgumentException("O email já existe na lista");
        }
    }
}