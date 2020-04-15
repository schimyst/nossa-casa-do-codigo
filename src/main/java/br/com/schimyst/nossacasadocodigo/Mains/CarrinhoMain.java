package br.com.schimyst.nossacasadocodigo.Mains;

import br.com.schimyst.nossacasadocodigo.Abstractions.Carrinho;
import br.com.schimyst.nossacasadocodigo.Abstractions.Livros;
import br.com.schimyst.nossacasadocodigo.LivroRepository;
import br.com.schimyst.nossacasadocodigo.Model.Autor;
import br.com.schimyst.nossacasadocodigo.Model.Categoria;
import br.com.schimyst.nossacasadocodigo.Model.Livro;
import br.com.schimyst.nossacasadocodigo.Model.LivroParaCompra;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarrinhoMain {

    public static void main(String[] args) {
        List<LivroParaCompra> livrosParaComprar = new ArrayList<>();
        Carrinho carrinho = new Carrinho(livrosParaComprar);
        Livros livros = new Livros();
        LivroRepository livroRepository = new LivroRepository(livros);

        Autor fernando = new Autor("Fernando Boaglio", "fernandoboaglio@caelum.com.br", "Fernando Boaglio, formado pela UNESP em BCC, foi instrutor oficial da Sun Microsystems e da Oracle Education. Atualmente, contribui para alguns projetos open source, como KDE, Jenkins, entre outros. Mantém seu blog em boaglio.com.");
        Autor leonardo = new Autor("Leonardo", "leonardo1schimidt@gmail.com", "hobbit");
        Livro springboot = new Livro("Spring Boot - Acelere o desenvolvimento de microsserviços", new BigDecimal("29.90"), "Spring Boot é uma maneira eficiente e eficaz de criar uma aplicação em Spring e facilmente colocá-la no ar, funcionando sem depender de um servidor de aplicação.", "1 Tendências do mercado\n" +
                "1.1 A evolução dos serviços\n", fernando, 159, "978-85-94120-00-7", LocalDate.parse("2020-12-03"), new Categoria("Programação"));

        Livro hobbit = new Livro("O Hobbit", new BigDecimal("50"), "bichao eh um monstro pequenino lek", "**sumario**", leonardo, 126,"978-1-4302-1998-9", LocalDate.parse("2020-12-03"), new Categoria("Aventura"));

        livros.adiciona(springboot);
        livros.adiciona(hobbit);

        Optional<Livro> o_hobbit = livroRepository.getLivroByTitulo("O Hobbit");
        Optional<Livro> spring_boot = livroRepository.getLivroByTitulo("Spring Boot - Acelere o desenvolvimento de microsserviços");

        LivroParaCompra livroParaCompra1 = new LivroParaCompra(spring_boot, 1);
        LivroParaCompra livroParaCompra2 = new LivroParaCompra(o_hobbit, 10);
        LivroParaCompra livroParaCompra3 = new LivroParaCompra(o_hobbit, 7);

        carrinho.adicionaNoCarrinho(livroParaCompra1);
        carrinho.adicionaNoCarrinho(livroParaCompra2);
        carrinho.adicionaNoCarrinho(livroParaCompra3);

        System.out.println(carrinho.getLivrosParaCompra());
        System.out.println(carrinho.calculaTotalPagamento(livrosParaComprar));
    }
}
