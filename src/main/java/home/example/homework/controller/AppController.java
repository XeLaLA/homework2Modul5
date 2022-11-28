package home.example.homework.controller;

import home.example.homework.dto.EmployeeDtoRq;
import home.example.homework.mapper.Mapper;
import home.example.homework.service.Service;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))

public class AppController {
    private Service employeeService;
    private Mapper employeeMapper;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test() {
        return "Ура, работает!";
    }

    @PostMapping(path = "/add")
    public void createEmployee(@RequestBody EmployeeDtoRq employeeDtoRq) {
        log.info(employeeDtoRq.toString());
        employeeService.addEmployee(employeeMapper.convertEmployeeRq(employeeDtoRq));
    }
    @PostMapping(path = "/del/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping(path = "/get/{id}")
    public String getEmployeeId(@PathVariable Integer id) {

        return employeeService.getEmployeeId(id);
    }

    @PostMapping(path = "/update/{id}")
    public void updateEmployee(@PathVariable Integer id, @RequestBody EmployeeDtoRq employeeDtoRq) {

        employeeService.updateEmployee(id, employeeMapper.convertEmployeeRq(employeeDtoRq));
    }

    @GetMapping(path = "/log")
    public String getLog() {
       return employeeService.toString();
    }
}