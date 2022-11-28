package home.example.homework.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EmployeeDtoRq {
    String name;
    Integer age;
    Integer salary;
}
