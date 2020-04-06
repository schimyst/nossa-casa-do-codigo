package br.com.schimyst.nossacasadocodigo.Abstractions;

import br.com.schimyst.nossacasadocodigo.Model.LivroParaCompra;

import java.math.BigDecimal;
import java.util.List;

public class Carrinho {

    private List<LivroParaCompra> livrosParaCompra;
    private BigDecimal total = BigDecimal.ZERO;

    public Carrinho(List<LivroParaCompra> livrosParaCompra) {
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
            } else {
                total = total.add(livroParaCompra.getLivro().get().getPreco());
            }
        });
        return total;
    }

    public void adicionaNoCarrinho(LivroParaCompra livro) {
        livrosParaCompra.add(livro);
    }
}