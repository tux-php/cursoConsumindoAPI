package br.com.alura.screenmatch.desafios.temperatura;

public class TemperaturaInvalidaException extends RuntimeException {
    private String mensagem;
    public TemperaturaInvalidaException(String novaMensagem){
        this.mensagem = novaMensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
