package br.com.alura.screenmatch.desafios.cpf;

public class TestarCPF {
    public static void main(String[] args) {
        try{
            ValidadorCPF num1 = new ValidadorCPF("0");
            num1.validarCPF();
            System.out.println(num1);
        }catch (CPFInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
