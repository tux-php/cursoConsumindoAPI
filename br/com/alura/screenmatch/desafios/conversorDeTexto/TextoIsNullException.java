package br.com.alura.screenmatch.desafios.conversorDeTexto;

public class TextoIsNullException extends RuntimeException {
    private String texto;

    public TextoIsNullException(String texto){
        this.texto = texto;
    }

    @Override
    public String getMessage() {
        return texto;
    }
}
