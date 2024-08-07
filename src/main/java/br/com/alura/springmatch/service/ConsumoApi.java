package br.com.alura.springmatch.service;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

  public String obterDados(String endereco) {
    ProxySelector proxy = ProxySelector.of(new InetSocketAddress("localhost", 3128));
    HttpClient client = HttpClient.newBuilder().proxy(proxy).build();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(endereco))
        .build();
    HttpResponse<String> response = null;
    try {
      response = client
          .send(request, HttpResponse.BodyHandlers.ofString());
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    String json = response.body();
    return json;
  }
}
