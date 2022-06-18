package za.ac.cput.group6.controller.lookup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.group6.domain.user.Employee;
import za.ac.cput.group6.service.lookup.IEmployeeService;
import za.ac.cput.group6.service.lookup.impl.EmployeeServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employee/")

public class EmployeeController {


    private final IEmployeeService employeeService;

    @Autowired public EmployeeController (IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

@PostMapping("save")
    public Employee save(Employee employee){

return employeeService.save(employee);



}

    private Optional<Employee> getById(String staffId) {
        return this.employeeService.read(staffId);
    }
@GetMapping("read/{staffId}")
    public Optional<Employee> read(String staffId){

        return this.employeeService.read(staffId);
}


    @DeleteMapping("delete")
    public void delete(String staffId){

       this.employeeService.delete(staffId);
    }
    @GetMapping("all")
    public List<Employee> getAll(String staffId){
        return this.employeeService.getAll(staffId);


    }


}