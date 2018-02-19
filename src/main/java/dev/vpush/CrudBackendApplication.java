package dev.vpush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.vpush.entities.User;
import dev.vpush.repositories.UserRepository;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	public static void main (String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(new User("one","Vasya"));
		userRepository.save(new User("two","Petya"));
	}
}
