package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastraAutorSemDescricao {

    public static void main(String[] args) {
        List<Autor> autorList = new ArrayList<>();

        Autor autorSemDescricao = new Autor("Lulu", "lulu@lol.com", LocalDateTime.now(), "");

        autorList.add(autorSemDescricao);
    }

}
