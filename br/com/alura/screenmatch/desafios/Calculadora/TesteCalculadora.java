package br.com.alura.screenmatch.desafios.Calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        try{
            System.out.println("Resultado: " + calc.fazerDivisao(10,0));
        }catch (DivisaoPorZeroPesonalizada e){
            System.out.println(e.getMessage());
        }
    }
}
