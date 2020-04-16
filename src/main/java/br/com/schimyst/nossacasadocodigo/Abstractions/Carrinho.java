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
        for(Map.Entry<String, LivroParaCompra> livroParaCompra : livroParaCompraMap.entrySet()) {
            int intQuantidade = livroParaCompra.getValue().getQuantidade();
            BigDecimal bigDecimalQuantidade = BigDecimal.valueOf(intQuantidade);
            if(intQuantidade > 1) {
                total = total.add(livroParaCompra.getValue().getLivro().get().getPreco().multiply(bigDecimalQuantidade));
            } else if(intQuantidade < 1) {
                throw new IllegalArgumentException("A quantidade do livro para compra deve ser de no mínimo 1 livro!");
            }
            else {
                total = total.add(livroParaCompra.getValue().getLivro().get().getPreco());
            }
        }
        return total;
    }

    public void adicionaNoCarrinho(LivroParaCompra livroParaCompra) {
        if(livroParaCompra.getLivro().isPresent()) {
            for(Map.Entry<String, LivroParaCompra> livroParaCompraEntry : livroParaCompraMap.entrySet()) {
                if(livroParaCompraMap.containsKey(livroParaCompra.getLivro().get().getTitulo())) {
                    int quantidade = livroParaCompra.getQuantidade();
                    if(livroParaCompra.equals(livroParaCompraEntry.getValue())) {
                        int quantidadeAtualizada = livroParaCompraEntry.getValue().getQuantidade() + quantidade;
                        livroParaCompra.setQuantidade(quantidadeAtualizada);
                        livroParaCompraMap.put(livroParaCompra.getLivro().get().getTitulo(), livroParaCompra);
                    }
                }
            }
            livroParaCompraMap.put(livroParaCompra.getLivro().get().getTitulo(), livroParaCompra);
        } else {
            throw new IllegalArgumentException("Você precisa colocar um livro que exista na lista!");
        }
    }
    }