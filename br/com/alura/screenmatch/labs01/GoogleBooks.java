package br.com.alura.screenmatch.labs01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o titulo do livro:");
        var titulo = leitura.nextLine();
        String novoTitulo = titulo.replace(" ","%20");
        String url = "https://www.googleapis.com/books/v1/volumes?q="+novoTitulo+"&key=AIzaSyDYUiMfI3SMCdysQKMba6Xy0ItqPoVevLo";
        System.out.println(url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Receives the response body as a String
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
