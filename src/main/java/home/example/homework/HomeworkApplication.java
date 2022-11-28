package home.example.homework;

import home.example.homework.config.MyConfig;
import home.example.homework.service.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {

		SpringApplication.run(HomeworkApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	}
}
