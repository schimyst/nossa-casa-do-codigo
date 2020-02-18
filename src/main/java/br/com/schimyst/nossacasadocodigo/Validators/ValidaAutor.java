package br.com.schimyst.nossacasadocodigo.Validators;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaAutor {

    List<Autor> autores = new ArrayList<>();

    public void verificaCamposVazios(String nome, String email, String descricao) {
        if (nome.isEmpty()) {
            throw new NullPointerException("O nome é obrigatório no cadastro do autor");
        } else if (email.isEmpty()) {
            throw new NullPointerException("O email é obrigatório no cadastro do autor");
        } else if (descricao.isEmpty()) {
            throw new NullPointerException("A descrição é obrigatória no cadastro do autor");
        }
    }

    public void limitaDescricao(String descricao) {
        if (descricao.length() > 400) {
            throw new IllegalArgumentException("A descrição deve conter no máximo 400 caracteres");
        }
    }

    public void validaEmail(String email) {
        String emailRegex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        Pattern molde = Pattern.compile(emailRegex);
        Matcher matcher = molde.matcher(email);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("O email nao está em no formato correto");
        }
    }

    public void validaAutor(Autor autor) {
        verificaCamposVazios(autor.getNome(), autor.getEmail(), autor.getDescricao());
        limitaDescricao(autor.getDescricao());
        validaEmail(autor.getEmail());

        autores.add(autor);
        System.out.println("O autor(a) " + autor.getNome() + " foi cadastrado com sucesso.");
    }

    public List<Autor> getAutores() {
        return autores;
    }
}
