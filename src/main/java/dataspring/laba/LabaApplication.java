package dataspring.laba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class LabaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabaApplication.class, args);
	}

}
