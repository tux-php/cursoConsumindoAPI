package br.com.alura.screenmatch.desafios.github;

import com.google.gson.Gson;


public class Usuario {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String consultaUsuario(){
        String uri = "https://api.github.com/users/" + this.nome;

        return uri;
    }
}
