package home.example.homework.employee;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    String name;
    Integer age;
    Integer salary;
}
