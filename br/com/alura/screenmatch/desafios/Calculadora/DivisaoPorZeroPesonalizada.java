package br.com.alura.screenmatch.desafios.Calculadora;

public class DivisaoPorZeroPesonalizada extends RuntimeException {
    private String mensagem;
    public DivisaoPorZeroPesonalizada(String mensagem) {
        this.mensagem = mensagem;
    }
    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
