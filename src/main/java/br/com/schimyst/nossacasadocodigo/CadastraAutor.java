package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.util.ArrayList;
import java.util.List;

public class CadastraAutor {

    public static void main(String[] args) {
        List<Autor> autorList = new ArrayList<>();

        Autor autor1 = new Autor("Zoe", "zoe@lol.com.br", "bolhinhas");
        Autor autor2 = new Autor("Kai'Sa", "kaisa@lol.com.br", "coisas cosmicas");
        Autor autor3 = new Autor("Vayne", "vayne@lol.com.br", "braba");

        autorList.add(autor1);
        autorList.add(autor2);
        autorList.add(autor3);

        System.out.println(autorList);
    }
}
