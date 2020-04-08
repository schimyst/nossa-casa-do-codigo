package br.com.schimyst.nossacasadocodigo.Abstractions;

import br.com.schimyst.nossacasadocodigo.Model.LivroParaCompra;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<LivroParaCompra> livrosParaCompra;
    private BigDecimal total = BigDecimal.ZERO;

    public Carrinho(List<LivroParaCompra> livrosParaCompra) {
        this.livrosParaCompra = new ArrayList<>();
        this.livrosParaCompra = livrosParaCompra;
    }

    public List<LivroParaCompra> getLivrosParaCompra() {
        return livrosParaCompra;
    }

    public BigDecimal calculaTotalPagamento(List<LivroParaCompra> livrosParaCompra) {
        livrosParaCompra.forEach(livroParaCompra -> {
            if(livroParaCompra.getQuantidade() > 1) {
                BigDecimal quantidade = BigDecimal.valueOf(livroParaCompra.getQuantidade());
                total = total.add(livroParaCompra.getLivro().get().getPreco().multiply(quantidade));
            } else if(livroParaCompra.getQuantidade() < 1) {
                throw new IllegalArgumentException("A quantidade do livro para compra deve ser de no mínimo 1 livro!");
            }
            else {
                total = total.add(livroParaCompra.getLivro().get().getPreco());
            }
        });
        return total;
    }

    public void adicionaNoCarrinho(LivroParaCompra livro) {
        livrosParaCompra.add(livro);
    }
}