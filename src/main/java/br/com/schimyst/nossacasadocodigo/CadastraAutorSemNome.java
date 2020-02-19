package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastraAutorSemNome {

    public static void main(String[] args) {
        List<Autor> autorList = new ArrayList<>();

        Autor autor1 = new Autor("", "zoe@lol.com.br", LocalDateTime.now(), "bolhinhas");

        autorList.add(autor1);
    }
}
