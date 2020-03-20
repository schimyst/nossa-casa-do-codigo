package br.com.schimyst.nossacasadocodigo.Model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Livro {

    private String titulo;
    private double preco;
    private String resumo;
    private String sumario;
    private Autor autor;
    private int numeroPags;
    private String isbn;
    private LocalDate dataPublicacao;
    private Categoria categoria;

    public Livro(String titulo, double preco, String resumo, String sumario, Autor autor, int numeroPags, String isbn, LocalDate dataPublicacao, Categoria categoria) {
        if (titulo.isEmpty()) {
            throw new IllegalArgumentException("O título do livro não pode ser vazio!");
        }
        else if (resumo.isEmpty() || resumo.length() > 500) {
            throw new IllegalArgumentException("O resumo do livro não pode ser vazio e deve conter no máximo 500 caracteres");
        }
        else if (preco < 20) {
            throw new IllegalArgumentException("O preço do livro é obrigatório e deve ser de no mínimo R$20!");
        }
        else if (numeroPags < 100) {
            throw new IllegalArgumentException("O número de páginas do livro é obrigatório e deve ter no mínimo 100 páginas!");
        }
        else if (isbn.isEmpty()) {
            throw new IllegalArgumentException("O ISBN do livro é obrigatório!");
        }
        else if (!validaIsbn(isbn)) {
            throw new IllegalArgumentException("O ISBN não está no padrão correto!");
        }
        else if (dataPublicacao.isBefore(LocalDate.now())) {
            throw new DateTimeException("A data de lançamento do livro deve ser no futuro!");
        }
        else if (categoria == null) {
            throw new IllegalArgumentException("A categoria do livro é obrigatória!");
        }
        else if (autor == null) {
            throw new IllegalArgumentException("O autor(a) do livro não pode ser nulo(a)!");
        }

        this.titulo = titulo;
        this.preco = preco;
        this.resumo = resumo;
        this.sumario = sumario;
        this.autor = autor;
        this.numeroPags = numeroPags;
        this.isbn = isbn;
        this.dataPublicacao = dataPublicacao;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    private boolean validaIsbn(String isbn) {
        String isbnRegex = "((978[\\--– ])?[0-9][0-9\\--– ]{10}[\\--– ][0-9xX])|((978)?[0-9]{9}[0-9Xx])";
        Pattern pattern = Pattern.compile(isbnRegex);
        Matcher matcher = pattern.matcher(isbn);

        if (!matcher.matches()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return titulo.equals(livro.titulo) ||
                isbn.equals(livro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, isbn);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", resumo='" + resumo + '\'' +
                ", sumario='" + sumario + '\'' +
                ", preco=" + preco +
                ", numeroPags=" + numeroPags +
                ", isbn='" + isbn + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                ", categoria=" + categoria +
                ", autor=" + autor +
                '}';
    }
}
