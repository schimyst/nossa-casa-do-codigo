package br.com.schimyst.nossacasadocodigo.Tests;

import br.com.schimyst.nossacasadocodigo.Abstractions.Categorias;
import br.com.schimyst.nossacasadocodigo.Model.Categoria;
import org.junit.Test;

public class TestaCategoria {

    private Categorias categorias = new Categorias();

    @Test
    public void deveAceitarCategoria() {
        Categoria categoria = new Categoria("Front-end");
        categorias.adiciona(categoria);
        System.out.println(categorias.getCategorias());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarCategoriaComNomeDuplicado() {
        Categoria categoria = new Categoria("Data Science");
        Categoria categoria2 = new Categoria("Data Science");

        categorias.adiciona(categoria);
        categorias.adiciona(categoria2);
        System.out.println(categorias.getCategorias());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarCategoriaSemNome() {
        Categoria categoria = new Categoria("");
        categorias.adiciona(categoria);
        System.out.println(categorias.getCategorias());
    }
}
