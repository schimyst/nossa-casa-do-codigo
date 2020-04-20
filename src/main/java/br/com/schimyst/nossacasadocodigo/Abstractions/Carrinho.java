package br.com.schimyst.nossacasadocodigo.Abstractions;

import br.com.schimyst.nossacasadocodigo.Model.LivroParaCompra;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Carrinho {

    private Map<String, LivroParaCompra> livroParaCompraMap = new HashMap<>();
    private BigDecimal total = BigDecimal.ZERO;

    public Map<String, LivroParaCompra> getLivroParaCompraMap() {
        return livroParaCompraMap;
    }

    public BigDecimal calculaTotalPagamento() {
        for(Map.Entry<String, LivroParaCompra> livroParaCompra : livroParaCompraMap.entrySet()) {
            int intQuantidade = livroParaCompra.getValue().getQuantidade();
            BigDecimal bigDecimalQuantidade = BigDecimal.valueOf(intQuantidade);
            BigDecimal precoLivroParaCompra = livroParaCompra.getValue().getLivro().get().getPreco();
            if(intQuantidade < 1) {
                throw new IllegalArgumentException("A quantidade do livro para compra deve ser de no mínimo 1 livro!");
            } else if(intQuantidade > 1) {
                total = total.add(precoLivroParaCompra.multiply(bigDecimalQuantidade));
            }
            else {
                total = total.add(precoLivroParaCompra);
            }
        }
        return total;
    }

    public void adicionaNoCarrinho(LivroParaCompra livroParaCompra) {
        if(livroParaCompra.getLivro().isEmpty()) {
            throw new IllegalArgumentException("Você precisa colocar um livro que exista na lista!");
        }
        else {
            String tituloLivro = livroParaCompra.getLivro().get().getTitulo();
            for(Map.Entry<String, LivroParaCompra> livroParaCompraEntry : livroParaCompraMap.entrySet()) {
                if(livroParaCompraMap.containsKey(tituloLivro)) {
                    int quantidade = livroParaCompra.getQuantidade();
                    if(livroParaCompra.equals(livroParaCompraEntry.getValue())) {
                        int quantidadeAtualizada = livroParaCompraEntry.getValue().getQuantidade() + quantidade;
                        livroParaCompra.setQuantidade(quantidadeAtualizada);
                        livroParaCompraMap.put(tituloLivro, livroParaCompra);
                    }
                }
            }
            livroParaCompraMap.put(tituloLivro, livroParaCompra);
        }
    }
}