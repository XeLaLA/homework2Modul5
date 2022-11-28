package home.example.homework.service;

import home.example.homework.dao.EmployeeDao;
import home.example.homework.employee.Employee;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@org.springframework.stereotype.Service
@ToString
public class Service {
    private EmployeeDao employeeDao;

    @Autowired
    public Service (EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void addEmployee(Employee employee)
    {
        employeeDao.addEmployeeDao(employee);
    }
    public void deleteEmployee(Integer id)
    {
        employeeDao.delEmployeeDao(id);
    }
    public String getEmployeeId(Integer id){
        if (employeeDao.getEmployeeDaoId(id) != null) {
            return employeeDao.getEmployeeDaoId(id).toString();
        }
        return  "Не найден!!!";
    }

    public void updateEmployee(Integer id, Employee employee) {
        employeeDao.updateEmployeeDaoId(id, employee);
    }
}
