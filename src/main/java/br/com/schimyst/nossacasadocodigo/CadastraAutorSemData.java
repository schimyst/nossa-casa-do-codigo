package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.util.ArrayList;
import java.util.List;

public class CadastraAutorSemData {

    public static void main(String[] args) {
        List<Autor> autorList = new ArrayList<>();

        Autor autorSemData = new Autor("Shyvana", "shyvana@lol.com.br", null ,"asdsad");
        System.out.println(autorSemData);

        autorList.add(autorSemData);
    }
}
