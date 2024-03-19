package br.com.alura.screenmatch.desafios.temperatura;

public class ConversorDeTemperatura {
    private double temperaturaF;
    public double converterParaCelsius(double novaTempF){
        if(novaTempF < -459.67){
            throw new TemperaturaInvalidaException("Temperatura absoluta zero");
        }
        double Temperaturacelcius = (novaTempF - 32)/1.8;
        return Temperaturacelcius;
    }
}
