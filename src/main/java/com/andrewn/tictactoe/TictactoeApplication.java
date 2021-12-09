package com.andrewn.tictactoe;

import com.andrewn.tictactoe.domain.Player;
import com.andrewn.tictactoe.repository.PlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class TictactoeApplication {

	private static Logger logger = LoggerFactory.getLogger(TictactoeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TictactoeApplication.class, args);
	}

	@Bean
	public CommandLineRunner addBaseUsers(PlayerRepository repository) {
		return (args) -> {
			logger.info("New base player" + String.valueOf(repository.save(
					new Player("ala", "ala@mail.ru", new BCryptPasswordEncoder().encode("ala")))
			));
			logger.info("New base player" + String.valueOf(repository.save(
					new Player("mary", "mary@mail.ru", new BCryptPasswordEncoder().encode("mary"))
			)));
		};
	}

}
