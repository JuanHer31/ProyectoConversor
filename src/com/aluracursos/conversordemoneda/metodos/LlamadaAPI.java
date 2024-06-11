package com.aluracursos.conversordemoneda.metodos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LlamadaAPI {
    public static Conversiones obtenerConversiones() {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/19ba42020dbb2433974051c6/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            return gson.fromJson(json, Conversiones.class);
        } catch (InterruptedException|
                 IOException e) {
            throw new RuntimeException(e);
        }

    }
}
