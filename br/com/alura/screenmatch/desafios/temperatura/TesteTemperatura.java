package br.com.alura.screenmatch.desafios.temperatura;

import java.util.Scanner;

public class TesteTemperatura {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            ConversorDeTemperatura conversor = new ConversorDeTemperatura();
            System.out.println("Informe a temperatura em ºF: ");
            double tempF = scan.nextDouble();

            System.out.println("Temperatura convertida em ºC: " + conversor.converterParaCelsius(tempF));
        }catch (TemperaturaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
