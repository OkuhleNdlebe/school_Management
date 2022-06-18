package za.ac.cput.group6.service.lookup;

import za.ac.cput.group6.domain.user.Employee;
import za.ac.cput.group6.service.IService;

import java.util.List;

public interface IEmployeeService extends IService<Employee, String> {

    List<Employee> getAll(String staffId);
void deleteById(String staffId);

    Employee save(Employee employee);


    boolean isValidEmail(String email);
}
