package br.com.schimyst.nossacasadocodigo.Model;

import java.util.Objects;
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

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivroParaCompra that = (LivroParaCompra) o;
        return livro.equals(that.livro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livro);
    }

    @Override
    public String toString() {
        return "LivroParaCompra{" +
                "livro=" + livro +
                ", quantidade=" + quantidade +
                '}';
    }
}