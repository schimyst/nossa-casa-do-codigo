package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.util.ArrayList;
import java.util.List;

public class Autores {

    private List<Autor> autores = new ArrayList<>();

    public List<Autor> getAutores() {
        return autores;
    }

    public Autores() {
    }

    private boolean verificaEmailDuplicado(String email) {
        for (Autor autor: autores) {
            if (autor.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public void adiciona(Autor autor) {
        if(verificaEmailDuplicado(autor.getEmail())) {
            autores.add(autor);
        } else {
            throw new IllegalArgumentException("O email já existe na lista");
        }
    }
}