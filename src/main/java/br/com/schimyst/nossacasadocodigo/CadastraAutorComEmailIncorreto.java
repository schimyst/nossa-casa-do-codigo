package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastraAutorComEmailIncorreto {

    public static void main(String[] args) {
        List<Autor> autorList = new ArrayList<>();

        Autor autorComEmailIncorreto = new Autor("Shaco", "shaco@ln", LocalDateTime.now(), "joker");

        autorList.add(autorComEmailIncorreto);
    }
}
