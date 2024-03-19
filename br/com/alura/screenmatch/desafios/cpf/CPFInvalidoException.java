package br.com.alura.screenmatch.desafios.cpf;

public class CPFInvalidoException extends RuntimeException {
    private String msg;
    public CPFInvalidoException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
