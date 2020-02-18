package br.com.schimyst.nossacasadocodigo.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Autor {

    private String nome;
    private String email;
    private LocalDateTime horaRegistro;
    private String descricao;

    public Autor(String nome, String email, LocalDateTime horaRegistro, String descricao) {
        this.nome = nome;
        this.email = email;
        this.horaRegistro = horaRegistro;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getHoraRegistro() {
        return horaRegistro;
    }

    public String getDescricao() {
        return descricao;
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
