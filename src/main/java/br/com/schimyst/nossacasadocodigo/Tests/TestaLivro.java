package br.com.schimyst.nossacasadocodigo.Tests;

import br.com.schimyst.nossacasadocodigo.Abstractions.Livros;
import br.com.schimyst.nossacasadocodigo.Model.Categoria;
import br.com.schimyst.nossacasadocodigo.Model.Livro;
import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalDate;

public class TestaLivro {

    private Livros livros = new Livros();
    private Categoria ux = new Categoria("UX");

    @Test
    public void deveCadastrarLivro() {
        Livro livro = new Livro("O Hobbit", "bichao eh um monstro pequenino lek", "**sumario**", 29.90, 126, "978-1-4302-1998-9", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroSemTitulo() {
        Livro livro = new Livro("", "bichao eh um monstro pequenino lek", "**sumario**", 29.90, 126, "978-1-4302-1998-9", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroSemResumo() {
        Livro livro = new Livro("O Hobbit", "", "**sumario**", 29.90, 126, "978-1-4302-1998-9", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroComResumoGigante() {
        Livro livro = new Livro("O Hobbit", "testestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestes", "**sumario**", 29.90, 126, "978-1-4302-1998-9", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroComPrecoMenorQueVinte() {
        Livro livro = new Livro("O Hobbit", "bichao eh um monstro pequenino lek", "**sumario**", 19.90, 126, "978-1-4302-1998-9", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroComMenosDeCemPaginas() {
        Livro livro = new Livro("O Hobbit", "bichao eh um monstro pequenino lek", "**sumario**", 29.90, 95, "978-1-4302-1998-9", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroSemIsbn() {
        Livro livro = new Livro("O Hobbit", "bichao eh um monstro pequenino lek", "**sumario**", 29.90, 105, "", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroComIsbnNoFormatoIncorreto() {
        Livro livro = new Livro("O Hobbit", "bichao eh um monstro pequenino lek", "**sumario**", 29.90, 105, "aiwdwoawdjoadj", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = DateTimeException.class)
    public void naoDeveCadastrarLivroComDataAntesDeHoje() {
        Livro livro = new Livro("O Hobbit", "bichao eh um monstro pequenino lek", "**sumario**", 29.90, 105, "978-1-4302-1998-9", LocalDate.parse("2020-01-01"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroComCategoriaNula() {
        Livro livro = new Livro("O Hobbit", "bichao eh um monstro pequenino lek", "**sumario**", 29.90, 105, "978-1-4302-1998-9", LocalDate.parse("2020-12-03"), null);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }
}
