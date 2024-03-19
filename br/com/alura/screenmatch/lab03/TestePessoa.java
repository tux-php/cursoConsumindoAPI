package br.com.alura.screenmatch.lab03;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestePessoa {
    public static void main(String[] args) {
        String json = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setLenient().create();
        //Pessoa pessoa1 = gson.fromJson(json,Pessoa.class);
        Pessoa pessoa1 = gson.fromJson(json, Pessoa.class);
        System.out.println("Objeto Pessoa: " + pessoa1);
    }
}
