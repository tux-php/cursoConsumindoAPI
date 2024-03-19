package br.com.alura.screenmatch.desafios04.desafio03;

public class Titulo {
    private String nome;
    private int ano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "(Nome: " + getNome() + " , Ano: " + getAno() + ")";
    }
}
