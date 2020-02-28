package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.util.ArrayList;
import java.util.List;

public class Autores {

    private List<Autor> autores = new ArrayList<>();

    public List<Autor> getAutores() {
        return autores;
    }

    private boolean verificaEmailDuplicado(Autor novoAutor) {
        for (Autor autor: autores) {
            if (novoAutor.equals(autor)) {
                return false;
            }
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