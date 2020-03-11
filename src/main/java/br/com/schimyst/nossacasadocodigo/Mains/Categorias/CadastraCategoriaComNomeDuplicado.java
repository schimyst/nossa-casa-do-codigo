package br.com.schimyst.nossacasadocodigo.Mains.Categorias;

import br.com.schimyst.nossacasadocodigo.Abstractions.Categorias;
import br.com.schimyst.nossacasadocodigo.Model.Categoria;

public class CadastraCategoriaComNomeDuplicado {

    public static void main(String[] args) {
        Categoria categoria = new Categoria("Mobile");
        Categoria categoria2 = new Categoria("Mobile");
        Categorias categorias = new Categorias();

        categorias.adiciona(categoria);
        categorias.adiciona(categoria2);
        System.out.println(categorias.getCategorias());
    }
}
