package br.com.schimyst.nossacasadocodigo.Model;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autor {

    private String nome;
    private String email;
    private LocalDateTime horaRegistro = LocalDateTime.now();
    private String descricao;

    public Autor(String nome, String email, String descricao) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do autor não pode ser vazio!");
        }
        else if (email.isEmpty()) {
           throw new IllegalArgumentException("O email do autor não pode ser vazio!");
        }
        else if (validaFormatoEmail(email) == false) {
            throw new IllegalArgumentException("O email não está no formato correto!");
        }
        else if (descricao.isEmpty()) {
            throw new IllegalArgumentException("A descrição do autor é obrigatória!");
        }
        else if (descricao.length() > 400) {
            throw new IllegalArgumentException("A descrição do autor deve conter no máximo 400 caracteres!");
        }

        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    private boolean validaFormatoEmail(String email) {
        String emailRegex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        Pattern molde = Pattern.compile(emailRegex);
        Matcher matcher = molde.matcher(email);

        if (!matcher.matches()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return email.equals(autor.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", horaRegistro=" + horaRegistro +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
