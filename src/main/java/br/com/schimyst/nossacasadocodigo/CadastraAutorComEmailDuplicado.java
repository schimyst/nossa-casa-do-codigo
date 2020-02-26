package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.util.ArrayList;
import java.util.List;

public class CadastraAutorComEmailDuplicado {

    public static void main(String[] args) {
        AutorService autorService = new AutorService();
        List<Autor> autors = new ArrayList<>();

        Autor autor1 = new Autor("Matheus", "matheus@caelum.com", "esse aqui eh brabo no front");
        Autor autor2 = new Autor("Julha", "matheus@caelum.com", "essa aqui eh braba no baile");
        Autor autor3 = new Autor("Gabriel", "gabriel@caelum.com", "esse aqui e brabo no spring");

        autorService.adiciona(autor1, autors);
        autorService.adiciona(autor2, autors);
        autorService.adiciona(autor3, autors);
    }





}
