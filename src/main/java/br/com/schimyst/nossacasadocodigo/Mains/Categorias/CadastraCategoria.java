package br.com.schimyst.nossacasadocodigo.Mains.Categorias;

import br.com.schimyst.nossacasadocodigo.Abstractions.Categorias;
import br.com.schimyst.nossacasadocodigo.Model.Categoria;

public class CadastraCategoria {

    public static void main(String[] args) {
        Categoria categoria = new Categoria("Programação");
        Categoria categoria2 = new Categoria("Mobile");
        Categorias categorias = new Categorias();

        categorias.adiciona(categoria);
        categorias.adiciona(categoria2);
        System.out.println(categorias.getCategorias());
    }
}
