package br.com.alura.screenmatch.desafios.Calculadora;

public class Calculadora {
    public int fazerDivisao(int num1,int num2){
        if(num2 == 0){
            throw new DivisaoPorZeroPesonalizada("Não é possível efetuar divizão por zero.");
        }
        return num1/num2;
    }

}
