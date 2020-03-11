package br.com.schimyst.nossacasadocodigo.Abstractions;

import br.com.schimyst.nossacasadocodigo.Model.Categoria;

import java.util.HashSet;
import java.util.Set;

public class Categorias {

    private Set<Categoria> categorias = new HashSet<>();

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void adiciona(Categoria categoria) {
        if(!categorias.contains(categoria)) {
            categorias.add(categoria);
        } else {
            throw new IllegalArgumentException("O nome já existe na lista de categorias!");
        }
    }
}
