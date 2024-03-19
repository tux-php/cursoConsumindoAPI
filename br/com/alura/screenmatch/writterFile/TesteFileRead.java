package br.com.alura.screenmatch.writterFile;

import java.io.*;

public class TesteFileRead {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("textoBuffer2.txt");
        FileReader leitura = new FileReader(arquivo);

        BufferedReader bufferLeitura = new BufferedReader(leitura);
        String line;
        while((line = bufferLeitura.readLine()) != null){
            System.out.println(line);
        }
        //System.out.println((char)bufferLeitura.read());
        bufferLeitura.close();
    }
}
