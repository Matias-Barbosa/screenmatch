package br.com.screenmatch;

import br.com.screenmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner { //Commandlinerunner gera uma nova funçao para substituir o main principal e fazer um run no spring

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception { //Função gerada pelo CommandLineRunner
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
