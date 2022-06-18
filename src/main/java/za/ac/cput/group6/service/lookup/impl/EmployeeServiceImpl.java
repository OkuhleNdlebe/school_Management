package za.ac.cput.group6.service.lookup.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.group6.domain.user.Employee;
import za.ac.cput.group6.repository.lookup.EmployeeRepository;
import za.ac.cput.group6.service.lookup.IEmployeeService;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    public EmployeeServiceImpl() {
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee create(Employee employee) {
        return null;
    }

    public Optional<Employee> read(String staffId) {

        return repository.findById(staffId);
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    public void delete(Employee employee) {

        repository.delete(employee);
    }

    @Override
    public List<Employee> getAll(String staffId) {

        return repository.findAll();
    }

    public void deleteById(String staffId) {
        Optional<Employee> employee = read(staffId);
        if (employee.isPresent()) delete(employee.get());
    }

    public boolean isValidEmail(String email) {

        String emailFormat = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPattern = Pattern.compile(emailFormat);


        if(email== null){

            return false;
        }
              return emailPattern.matcher(email).matches();
    }
}