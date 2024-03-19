package br.com.alura.screenmatch.desafios04.desafio2;

import com.google.gson.Gson;

public class Teste {
    public static void main(String[] args) {
        Titulo titulo = new Titulo();
        titulo.setNome("Engenharia de Software");
        titulo.setAno(1996);
        Gson json = new Gson();
        System.out.println(titulo);
        String textoJson = json.toJson(titulo);
        System.out.println(textoJson);

    }
}
