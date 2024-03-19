package br.com.alura.screenmatch.desafios04.desafio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulandoArquivo {
    public static void main(String[] args) throws IOException {
        System.out.println("Iniciando a escrita!");
        String msg = "Conteúdo a ser gravado no arquivo.";
        File arquivo = new File("arquivo.txt");
        FileWriter frase = new FileWriter(arquivo);
        frase.write(msg);
        frase.close();
        System.out.println("Finalizando a escrita!");
    }
}
