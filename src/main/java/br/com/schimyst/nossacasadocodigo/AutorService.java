package br.com.schimyst.nossacasadocodigo;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.util.List;

public class AutorService {

    public AutorService() {
    }

    public boolean verificaEmailDuplicado(String email, List<Autor> autorList) {
        for (Autor autor: autorList) {
            if (email.equals(autor.getEmail())) {
                return false;
            }
        }
        return true;
    }

    public void adiciona(Autor autor, List<Autor> autorList) {
        if(verificaEmailDuplicado(autor.getEmail(), autorList)) {
            autorList.add(autor);
        } else {
            throw new IllegalArgumentException("O email já existe no sistema");
        }
    }
}
