package br.com.schimyst.nossacasadocodigo.Tests;

import br.com.schimyst.nossacasadocodigo.Autores;
import br.com.schimyst.nossacasadocodigo.Model.Autor;
import org.junit.Test;

public class TestaAutor {

    Autores autores = new Autores();

    @Test
    public void deveAceitarAutor() {
        Autor autorCertinho = new Autor("Certinho", "certinho@gmail.com", "descricao");
        autores.adiciona(autorCertinho);
        System.out.println(autores.getAutores());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutorSemNome() {
        Autor autorSemNome = new Autor("", "autorsemnome@gmail.com", "descricao");
        autores.adiciona(autorSemNome);
        System.out.println(autores.getAutores());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutorSemEmail() {
        Autor autorSemEmail = new Autor("Sem Email", "", "descricao");
        autores.adiciona(autorSemEmail);
        System.out.println(autores.getAutores());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutorSemDescricao() {
        Autor autorSemDescricao = new Autor("Sem Descricao", "semdescricao@gmail.com", "");
        autores.adiciona(autorSemDescricao);
        System.out.println(autores.getAutores());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutorComEmailForaDoPadrao() {
        Autor autorComEmailZuado = new Autor("Email Zuado", "emailzuado@", "descricao");
        autores.adiciona(autorComEmailZuado);
        System.out.println(autores.getAutores());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutoresComEmailDuplicado() {
        Autor autorComEmailIgual = new Autor("Email Igual", "igual@gmail.com", "descricao");
        Autor autorComEmailIgual2 = new Autor("Email Igual", "igual@gmail.com", "descricao");

        autores.adiciona(autorComEmailIgual);
        autores.adiciona(autorComEmailIgual2);
        System.out.println(autores.getAutores());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarAutorComDescricaoGigante() {
        Autor autorComDescricaoGigante = new Autor("Descricao Gigante", "descricaogigante@gmail.com", "gigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantescogigantesco");
        autores.adiciona(autorComDescricaoGigante);
        System.out.println(autores.getAutores());
    }
}
