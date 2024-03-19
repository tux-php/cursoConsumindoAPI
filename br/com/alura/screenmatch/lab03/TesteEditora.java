package br.com.alura.screenmatch.lab03;

import com.google.gson.Gson;

public class TesteEditora {
    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\"," +
                "\"autor\":\"Akemi\"," +
                "\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro editora = gson.fromJson(jsonLivro,Livro.class);
        System.out.println("Objeto Livro: " + editora);
    }
}
