package br.com.schimyst.nossacasadocodigo.Abstractions;

import br.com.schimyst.nossacasadocodigo.Model.LivroParaCompra;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Carrinho {

    private Map<String, LivroParaCompra> livroParaCompraMap = new HashMap<>();
    private BigDecimal total = BigDecimal.ZERO;

    public Carrinho() {
    }

    public Map<String, LivroParaCompra> getLivroParaCompraMap() {
        return livroParaCompraMap;
    }

    public BigDecimal calculaTotalPagamento() {
        for(Map.Entry<String, LivroParaCompra> livroParaCompraEntry : livroParaCompraMap.entrySet()) {
            if(livroParaCompraEntry.getValue().getQuantidade() > 1) {
                BigDecimal quantidade = BigDecimal.valueOf(livroParaCompraEntry.getValue().getQuantidade());
                total = total.add(livroParaCompraEntry.getValue().getLivro().get().getPreco().multiply(quantidade));
            } else if(livroParaCompraEntry.getValue().getQuantidade() < 1) {
                throw new IllegalArgumentException("A quantidade do livro para compra deve ser de no mínimo 1 livro!");
            }
            else {
                total = total.add(livroParaCompraEntry.getValue().getLivro().get().getPreco());
            }
        }
        return total;
    }

    public void adicionaNoCarrinho(LivroParaCompra livroParaCompra) {
        livroParaCompraMap.put(livroParaCompra.getLivro().get().getTitulo(), livroParaCompra);
    }
}