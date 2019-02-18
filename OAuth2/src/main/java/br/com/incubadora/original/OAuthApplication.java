package br.com.incubadora.original;

import br.com.incubadora.original.enconder.PasswordEncoder;
import br.com.incubadora.original.model.User;
import br.com.incubadora.original.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@SpringBootApplication
public class OAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthApplication.class, args);
	}

	@Autowired
	private void user(UserRepository repository){
		if(repository.findAll() == null) {
			repository.save(User.builder()
					.username("dcb20")
					.password(PasswordEncoder.encode("12345678"))
					.admin(true)
					.build());
		}
		System.out.println(repository.findAll().get(0).getPassword());
	}


}
