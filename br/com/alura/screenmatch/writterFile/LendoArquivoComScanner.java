package br.com.alura.screenmatch.writterFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LendoArquivoComScanner {
    public static void main(String[] args) {
        try{
            File arquivo = new File("textoBuffer2.txt");
            Scanner scan = new Scanner(arquivo);

            while(scan.hasNextLine()){
                String linha = scan.nextLine();
                System.out.println(linha);
            }
            scan.close();
        }catch(FileNotFoundException e){
            System.out.println("Arquivo inexistente.");
        }

    }
}
