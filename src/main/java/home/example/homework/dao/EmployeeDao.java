package home.example.homework.dao;


import home.example.homework.employee.Employee;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.List;

@Slf4j
@NoArgsConstructor
@ToString
public class EmployeeDao {
    private static Integer id=0;
    HashMap<Integer, Employee> employeeList= new HashMap<>();

    public void addEmployeeDao(Employee employee) {
        id++;
        employeeList.put(id, employee);
    }
    public void delEmployeeDao(Integer id) {
        if(employeeList.containsKey(id))
        {
            employeeList.remove(id);
        }
    }
    public Employee getEmployeeDaoId(Integer id){
        if(employeeList.containsKey(id)){
            return employeeList.get(id);
        }
        return null;
    }
    public void updateEmployeeDaoId(Integer id, Employee employee) {
        if(employeeList.containsKey(id))
        {
            employeeList.replace(id,employee);
        }
    }
}
