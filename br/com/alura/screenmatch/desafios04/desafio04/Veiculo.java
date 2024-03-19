package br.com.alura.screenmatch.desafios04.desafio04;

public class Veiculo implements Comparable<Veiculo> {
    private String nome;
    private String modelo;
    private int AnoFabricacao;

    public int getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setNome(String nomeNovo) {
        this.nome = nomeNovo;
    }

    public void setModelo(String modeloNovo) {
        this.modelo = modeloNovo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        AnoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "(Veiculo " +
                "nome = " + nome +
                ", modelo = " + modelo +
                ", AnoFabricacao = " + AnoFabricacao +
                ')';
    }

    @Override
    public int compareTo(Veiculo outro) {
        if(this.AnoFabricacao < outro.getAnoFabricacao()){
            return -1;
        }
        if(this.AnoFabricacao > outro.getAnoFabricacao()){
            return 1;
        }
        return 0;
    }
}
