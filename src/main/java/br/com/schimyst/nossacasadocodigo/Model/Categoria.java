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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return nome.equals(categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
