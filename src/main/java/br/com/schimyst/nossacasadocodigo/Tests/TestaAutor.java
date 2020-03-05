package br.com.schimyst.nossacasadocodigo.Tests;

import br.com.schimyst.nossacasadocodigo.Autores;
import br.com.schimyst.nossacasadocodigo.Model.Autor;
import org.junit.Test;

public class TestaAutor {

    @Test
    public void deveAceitarAutor() {
        Autor autorCertinho = new Autor("Certinho", "certinho@gmail.com", "descricao");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutorSemNome() {
        Autor autorSemNome = new Autor("", "autorsemnome@gmail.com", "descricao");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutorSemEmail() {
        Autor autorSemEmail = new Autor("Sem Email", "", "descricao");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutorSemDescricao() {
        Autor autorSemDescricao = new Autor("Sem Descricao", "semdescricao@gmail.com", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutorComEmailForaDoPadrao() {
        Autor autorComEmailZuado = new Autor("Email Zuado", "emailzuado@", "descricao");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutoresComEmailDuplicado() {
        Autor autorComEmailIgual = new Autor("Email Igual", "igual@gmail.com", "descricao");
        Autor autorComEmailIgual2 = new Autor("Email Igual", "igual@gmail.com", "descricao");

        Autores autores = new Autores();
        autores.adiciona(autorComEmailIgual);
        autores.adiciona(autorComEmailIgual2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutorComDescricaoGigante() {
        Autor autorComDescricaoGigante = new Autor("Descricao Gigante", "descricaogigante@gmail.com", "gigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantesco");
    }
}
