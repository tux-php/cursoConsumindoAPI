package br.com.alura.screenmatch.writterFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteBuffereadWritter {
    public static void main(String[] args) throws IOException {
        FileWriter arquivo = new FileWriter("textoBuffer2.txt");

        BufferedWriter escrever = new BufferedWriter(arquivo);
        System.out.println("Começando a escrita:");
        escrever.write("Olá mundo! Cheguei.");
        escrever.write("Meu nome é Fernando.");
        escrever.write("E estou começando o domínio do Java11.");
        escrever.write("Agora eu vim para ficar!");
        escrever.write("Vlw.");

        escrever.close();
        System.out.println("Ecrita efetuada com sucesso!");
    }
}
