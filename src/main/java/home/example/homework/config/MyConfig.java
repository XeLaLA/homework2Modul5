package home.example.homework.config;

import home.example.homework.dao.EmployeeDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("home.example.homework")
public class MyConfig {
    @Bean
    public EmployeeDao employeeDao()
    {
        return new EmployeeDao();
    }

}
