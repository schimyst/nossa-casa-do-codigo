package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;
import br.com.schimyst.nossacasadocodigo.Validators.ValidaAutor;

import java.time.LocalDateTime;

public class CadastraAutor {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Zoe", "zoe@lol.com.br", LocalDateTime.now(), "bolhinhas");
        Autor autor2 = new Autor("Kai'Sa", "kaisa@lol.com.br", LocalDateTime.now(), "coisas cosmicas");
        Autor autor3 = new Autor("Vayne", "vayne@lol.com.br", LocalDateTime.now(), "braba");

        ValidaAutor validaAutor = new ValidaAutor();

        validaAutor.validaAutor(autor1);
        validaAutor.validaAutor(autor2);
        validaAutor.validaAutor(autor3);

        System.out.println("Autores cadastrados no sistema: " + validaAutor.getAutores());
    }
}
