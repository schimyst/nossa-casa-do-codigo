package br.com.schimyst.nossacasadocodigo.Tests;

import br.com.schimyst.nossacasadocodigo.Abstractions.Livros;
import br.com.schimyst.nossacasadocodigo.Model.Autor;
import br.com.schimyst.nossacasadocodigo.Model.Categoria;
import br.com.schimyst.nossacasadocodigo.Model.Livro;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.LocalDate;

public class TestaLivro {

    private Livros livros = new Livros();
    private Categoria ux = new Categoria("UX");
    private Autor leonardo = new Autor("Leonardo", "leonardo1schimidt@gmail.com", "brabo");

    @Test
    public void deveCadastrarLivro() {
        Livro livro = new Livro("O Hobbit", new BigDecimal("29.90"), "bichao eh um monstro pequenino lek", "**sumario**", leonardo, 126, "978-1-4302-1998-9", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroSemTitulo() {
        Livro livro = new Livro("", new BigDecimal("29.90"), "bichao eh um monstro pequenino lek", "**sumario**", leonardo, 126, "978-1-4302-1998-9", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroSemResumo() {
        Livro livro = new Livro("O Hobbit", new BigDecimal("29.90"), "", "**sumario**", leonardo, 126, "978-1-4302-1998-9", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroComResumoGigante() {
        Livro livro = new Livro("O Hobbit", new BigDecimal("29.90"), "testestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestestes", "**sumario**", leonardo, 126,"978-1-4302-1998-9" ,LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroComPrecoMenorQueVinte() {
        Livro livro = new Livro("O Hobbit", new BigDecimal("19.90"), "bichao eh um monstro pequenino lek", "**sumario**", leonardo, 126,"978-1-4302-1998-9", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroComMenosDeCemPaginas() {
        Livro livro = new Livro("O Hobbit", new BigDecimal("29.90"), "bichao eh um monstro pequenino lek", "**sumario**", leonardo, 26,"978-1-4302-1998-9", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroSemIsbn() {
        Livro livro = new Livro("O Hobbit", new BigDecimal("29.90"), "bichao eh um monstro pequenino lek", "**sumario**", leonardo, 126, "", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroComIsbnNoFormatoIncorreto() {
        Livro livro = new Livro("O Hobbit", new BigDecimal("29.90"), "bichao eh um monstro pequenino lek", "**sumario**", leonardo, 165 ,"aiwdwoawdjoadj", LocalDate.parse("2020-12-03"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = DateTimeException.class)
    public void naoDeveCadastrarLivroComDataAntesDeHoje() {
        Livro livro = new Livro("O Hobbit", new BigDecimal("29.90"), "bichao eh um monstro pequenino lek", "**sumario**", leonardo, 126,"978-1-4302-1998-9" ,LocalDate.parse("2020-01-01"), ux);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCadastrarLivroComCategoriaNula() {
        Livro livro = new Livro("O Hobbit", new BigDecimal("29.90"), "bichao eh um monstro pequenino lek", "**sumario**", leonardo, 126, "978-1-4302-1998-9" , LocalDate.parse("2020-12-03"), null);
        livros.adiciona(livro);
        System.out.println(livros.getLivros());
    }
}
