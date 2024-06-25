package br.com.alura.springmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmatchApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(SpringmatchApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("run");
    for (String string : args) {
      System.out.println("arg: " + string);
    }
  }

}
