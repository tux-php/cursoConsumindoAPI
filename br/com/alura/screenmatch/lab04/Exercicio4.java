package br.com.alura.screenmatch.lab04;

public class Exercicio4 {

        public static void main(String[] args) {
            try {
                int[] array = new int[5];
                System.out.println(array[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Índice fora do limite do array!");
            } catch (Exception e) {
                System.out.println("Erro: Ocorreu uma exceção!");
            }
        }
}
