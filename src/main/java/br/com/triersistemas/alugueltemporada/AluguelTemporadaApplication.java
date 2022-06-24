package br.com.triersistemas.alugueltemporada;

import br.com.triersistemas.alugueltemporada.repository.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AluguelTemporadaApplication  {



    public static void main(String[] args) {
        SpringApplication.run(AluguelTemporadaApplication.class, args);
    }


}
