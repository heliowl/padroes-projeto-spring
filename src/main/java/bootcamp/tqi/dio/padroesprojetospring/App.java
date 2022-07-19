package bootcamp.tqi.dio.padroesprojetospring;

import bootcamp.tqi.dio.padroesprojetospring.model.Cliente;
import bootcamp.tqi.dio.padroesprojetospring.model.Endereco;
import bootcamp.tqi.dio.padroesprojetospring.service.ClienteService;
import bootcamp.tqi.dio.padroesprojetospring.service.implement.ClienteServiceImplement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class App {

	public static void main(String[] args) {

		{SpringApplication.run(App.class, args);}


	}

}
