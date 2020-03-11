package br.com.schimyst.nossacasadocodigo.Mains;

import br.com.schimyst.nossacasadocodigo.Model.Autor;

public class CadastraAutorSemData {

    public static void main(String[] args) {
        Autor autorSemData = new Autor("Shyvana", "shyvana@lol.com.br","asdsad");

        // AQUI FUNCIONA PQ A DATA NUNCA VIRÁ COMO NULL, JÁ QUE ELA ESTÁ SENDO INICIALIZADA DIRETAMENTE NO ATRIBUTO
    }
}
