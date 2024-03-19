package br.com.alura.screenmatch.desafios.conversorDeTexto;

public class Principal {
    public static void main(String[] args) {
        ConversorDeTexto texto = new ConversorDeTexto();
        try {
            String nome = texto.converterTextoEmMaiuscula("pequeno");
            System.out.println(nome);
        }catch (TextoIsNullException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Ocorreu algum erro.");
        }
    }
}
