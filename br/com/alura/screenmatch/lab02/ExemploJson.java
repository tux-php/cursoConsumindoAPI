package br.com.alura.screenmatch.lab02;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ExemploJson {
    public static void main(String[] args) {
        String json = """
            {
                "nome": "Maria",
                "idade": 25,
                "endereco": {
                    "rua": "Rua das Flores",
                    "numero": 123,
                    "cidade": "São Paulo"
                },
                "telefones": [
                    "111111111",
                    "222222222",
                    "333333333"
                ]
            }
        """;

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

        // Agora você pode acessar os valores do JSON utilizando o objeto JsonObject
        String nome = jsonObject.get("nome").getAsString();
        int idade = jsonObject.get("idade").getAsInt();
        JsonObject endereco = jsonObject.getAsJsonObject("endereco");
        String rua = endereco.get("rua").getAsString();
        int numero = endereco.get("numero").getAsInt();
        String cidade = endereco.get("cidade").getAsString();
        String[] telefones = gson.fromJson(jsonObject.getAsJsonArray("telefones"), String[].class);

        // Imprimindo os valores no console
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + rua + ", " + numero + ", " + cidade);
        System.out.println("Telefones: " + String.join(", ", telefones));
    }
}