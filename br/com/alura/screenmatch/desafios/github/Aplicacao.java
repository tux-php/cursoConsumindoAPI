package br.com.alura.screenmatch.desafios.github;


import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        Usuario usuario = new Usuario();
        System.out.println("Informe o nome do usuário:");
        String nomeUsuario = scan.nextLine();
        usuario.setNome(nomeUsuario);

        try {
            String uri = usuario.consultaUsuario();

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado!");
            }
            String json = response.body();
            System.out.println(json);
            Gson gson = new Gson();

            UsuarioRcd objUsuario = gson.fromJson(json, UsuarioRcd.class);
            System.out.println("Objeto Usuario: " + objUsuario);

        }catch(IOException | InterruptedException e){
            System.out.println("Opss...Houve um erro durante a consulta a API do GitHub.");
        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }
    }
}
