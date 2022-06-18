package za.ac.cput.group6.service.lookup.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.group6.domain.user.EmployeeAddress;
import za.ac.cput.group6.repository.lookup.EmployeeAddressRepository;
import za.ac.cput.group6.service.lookup.IEmployeeAddressService;

import java.util.List;
import java.util.Optional;



@Service
public class EmployeeAddressServiceImpl implements IEmployeeAddressService {

    private EmployeeAddressRepository repository;

    public EmployeeAddressServiceImpl (EmployeeAddressRepository repository) {
        this.repository = repository;
    }

    public EmployeeAddressServiceImpl() {
    }

    public EmployeeAddress save (EmployeeAddress employeeAddress) {
        return repository.save(employeeAddress);
    }

    @Override
    public EmployeeAddress create(EmployeeAddress employeeAddress) {
        return null;
    }

    public Optional<EmployeeAddress> read (String staffId) {
        return repository.findById(staffId);
    }

    @Override
    public EmployeeAddress update(EmployeeAddress employeeAddress) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    public void delete (EmployeeAddress employeeAddress) {
        repository.delete(employeeAddress);
    }

    public List<EmployeeAddress> getAll(String staffId) {
        return repository.findAll();
    }

    public void deleteById(String staffId) {
        Optional<EmployeeAddress> employeeAddress = read(staffId);
        if (employeeAddress.isPresent()) delete(employeeAddress.get());
    }

}
