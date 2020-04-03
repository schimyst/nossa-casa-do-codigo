package br.com.schimyst.nossacasadocodigo.Model;

public class LivroParaCompra {

    private Livro livro;
    private int quantidade;

    public LivroParaCompra(Livro livro, int quantidade) {
        if(livro == null) {
            throw new IllegalArgumentException("Você deve passar um livro para compra!");
        }
        if(quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser de no mínimo 1 livro para a compra!");
        }
        this.livro = livro;
        this.quantidade = quantidade;
    }

    public Livro getLivro() {
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
