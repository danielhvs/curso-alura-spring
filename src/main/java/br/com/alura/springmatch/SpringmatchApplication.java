package br.com.alura.springmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.springmatch.service.ConsumoApi;

@SpringBootApplication
public class SpringmatchApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(SpringmatchApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    var consumoApi = new ConsumoApi();
    System.out.println("gilmore: " + consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c"));
    System.out.println("cafe: " + consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json"));
    for (String string : args) {
      System.out.println("arg: " + string);
    }
  }

}