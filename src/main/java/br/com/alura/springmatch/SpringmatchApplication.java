package br.com.alura.springmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.springmatch.model.DadosSerie;
import br.com.alura.springmatch.service.ConsumoApi;
import br.com.alura.springmatch.service.ConverteDados;

@SpringBootApplication
public class SpringmatchApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(SpringmatchApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    var consumoApi = new ConsumoApi();
    String json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
    ConverteDados conversor = new ConverteDados();
    DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
    System.out.println("dados: " + dados);
  }

}
