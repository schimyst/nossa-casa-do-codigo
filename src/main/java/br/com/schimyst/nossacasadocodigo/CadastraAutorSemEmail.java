package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastraAutorSemEmail {

    public static void main(String[] args) {
        List<Autor> autorList = new ArrayList<>();

        Autor autorSemEmail = new Autor("Hecarim", "", LocalDateTime.now(), "cavalao");

        autorList.add(autorSemEmail);
    }
}
