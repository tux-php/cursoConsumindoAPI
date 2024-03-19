package br.com.alura.screenmatch.desafios.conversorDeTexto;

public class ConversorDeTexto {
    public String converterTextoEmMaiuscula(String texto){
        if(texto == null){
            throw new TextoIsNullException("Dados passados estão null's ou vazios.");
        }
        return texto.toUpperCase();
    }
}
