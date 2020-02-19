package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastraAutorComDescricaoGigante {

    public static void main(String[] args) {
        List<Autor> autorList = new ArrayList<>();

        Autor autorComDescricaoGigante = new Autor ("Nautilus", "nautilus@lol.com", LocalDateTime.now(), "grandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemaisgrandedemais");

        autorList.add(autorComDescricaoGigante);
    }

}
