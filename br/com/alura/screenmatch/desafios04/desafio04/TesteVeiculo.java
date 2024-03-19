package br.com.alura.screenmatch.desafios04.desafio04;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TesteVeiculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Veiculo> veiculos = new ArrayList<>();
        Veiculo[] veiculo = new Veiculo[10];
        String nomeV, modeloV, resposta;
        int anoFabricacao;
        boolean sair = false;

        while (!sair){
            System.out.println("--------------------------");
            System.out.println("Escolher opção:");
            System.out.println("1-Cadastrar veículo:");
            System.out.println("2-Sair:");
            System.out.println("--------------------------");
            int opcao = scan.nextInt();
            if(opcao == 1){

                for(int i = 0; i < veiculo.length; i++) {
                    Scanner objVeiculo = new Scanner(System.in);
                    System.out.println("Adicionar veículo (S/N) ?");
                    resposta = scan.next();
                    if (resposta.equalsIgnoreCase("s")) {
                        veiculo[i] = new Veiculo();

                        System.out.println("Informe o nome do veículo " + i + " : ");
                        nomeV = objVeiculo.nextLine();
                        veiculo[i].setNome(nomeV);

                        System.out.println("Informe o modelo do veículo " + i + " : ");
                        modeloV = objVeiculo.next();
                        veiculo[i].setModelo(modeloV);

                        System.out.println("Informe o ano do veículo " + i + " : ");
                        anoFabricacao = objVeiculo.nextInt();
                        veiculo[i].setAnoFabricacao(anoFabricacao);

                        veiculos.add(veiculo[i]);
                    }else{
                        break;
                    }
                }
                System.out.println("Formato Array:");
                Collections.sort(veiculos,Collections.reverseOrder());
                System.out.println(veiculos);

                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String json = gson.toJson(veiculos);
                System.out.println("Formato Json:");
                System.out.println(json);
            }else{
                sair = true;
            }

        }
    }
}
