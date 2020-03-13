package br.com.schimyst.nossacasadocodigo.Mains.Autores;

import br.com.schimyst.nossacasadocodigo.Abstractions.Autores;
import br.com.schimyst.nossacasadocodigo.Model.Autor;

public class CadastraAutorComEmailDuplicado {

    public static void main(String[] args) {
        Autores autores = new Autores();
        Autor autor1 = new Autor("Matheus", "matheus@caelum.com", "esse aqui eh brabo no front");
        Autor autor2 = new Autor("Julha", "gabriel@caelum.com", "essa aqui eh braba no baile");
        Autor autor3 = new Autor("Gabriel", "gabriel@caelum.com", "esse aqui e brabo no spring");

        autores.adiciona(autor1);
        autores.adiciona(autor2);
        autores.adiciona(autor3);

        System.out.println(autores.getAutores());
    }





}
