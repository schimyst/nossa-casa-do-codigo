package br.com.schimyst.nossacasadocodigo.Model;

import java.util.Optional;

public class LivroParaCompra {

    private Optional<Livro> livro;
    private int quantidade;

    public LivroParaCompra(Optional<Livro> livro, int quantidade) {
        if(!livro.isPresent()) {
            throw new IllegalArgumentException("O livro que você passou não existe na lista");
        }
        if(quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser de no mínimo 1 livro para a compra!");
        }
        this.livro = livro;
        this.quantidade = quantidade;
    }

    public Optional<Livro> getLivro() {
        return livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "LivroParaCompra{" +
                "livro=" + livro +
                ", quantidade=" + quantidade +
                '}';
    }
}