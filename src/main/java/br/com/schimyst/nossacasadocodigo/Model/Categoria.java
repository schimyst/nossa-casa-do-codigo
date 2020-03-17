package br.com.schimyst.nossacasadocodigo.Model;

import java.util.Objects;

public class Categoria {

    private String nome;

    public Categoria(String nome) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome da categoria não pode ser vazio!");
        }
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
