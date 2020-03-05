package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.util.Set;

public interface LogicaAutor {

    Set<Autor> getAutores();

    void adiciona(Autor autor);
}