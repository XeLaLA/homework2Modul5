package home.example.homework.mapper;

import home.example.homework.dto.EmployeeDtoRq;
import home.example.homework.employee.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Mapper {
    public Employee convertEmployeeRq(EmployeeDtoRq employeeDtoRq) {
            Employee employee = new Employee(employeeDtoRq.getName(),employeeDtoRq.getAge(), employeeDtoRq.getSalary());
            return employee;
        }
}
