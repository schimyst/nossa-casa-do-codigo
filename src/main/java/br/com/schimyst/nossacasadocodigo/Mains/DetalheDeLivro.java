package br.com.schimyst.nossacasadocodigo.Mains;

import br.com.schimyst.nossacasadocodigo.Abstractions.Livros;
import br.com.schimyst.nossacasadocodigo.LivroRepository;
import br.com.schimyst.nossacasadocodigo.Model.Autor;
import br.com.schimyst.nossacasadocodigo.Model.Categoria;
import br.com.schimyst.nossacasadocodigo.Model.Livro;

import java.time.LocalDate;

public class DetalheDeLivro {

    public static void main(String[] args) {
        Livros livros = new Livros();
        Autor fernando = new Autor("Fernando Boaglio", "fernandoboaglio@caelum.com.br", "Fernando Boaglio, formado pela UNESP em BCC, foi instrutor oficial da Sun Microsystems e da Oracle Education. Atualmente, contribui para alguns projetos open source, como KDE, Jenkins, entre outros. Mantém seu blog em boaglio.com.");
        Livro springBoot = new Livro("Spring Boot - Acelere o desenvolvimento de microsserviços", 29.90, "Spring Boot é uma maneira eficiente e eficaz de criar uma aplicação em Spring e facilmente colocá-la no ar, funcionando sem depender de um servidor de aplicação. Não se trata de um simples framework, mas de um conceito totalmente novo de criar aplicações web. Além de impulsionar o desenvolvimento para microsserviços, o Spring Boot ajuda na configuração importando e configurando automaticamente todas as dependências.", "1 Tendências do mercado\n" +
                "1.1 A evolução dos serviços\n" +
                "1.2 Como surgiu o Spring Boot\n" +
                "2 Conhecendo o Spring Boot\n" +
                "2.1 Sua arquitetura\n" +
                "2.2 Nossa ferramenta\n" +
                "2.3 Nosso primeiro programa\n" +
                "2.4 Ajustando os parafusos\n" +
                "2.5 Próximos passos", fernando, 159, "978-85-94120-00-7", LocalDate.parse("2020-12-03"), new Categoria("Programação"));

        LivroRepository livroRepository = new LivroRepository(livros);
        livros.adiciona(springBoot);
        System.out.println(livroRepository.getLivroByTitulo("Spring Boot - Acelere o desenvolvimento de microsserviços"));
    }
}