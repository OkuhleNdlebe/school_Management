package za.ac.cput.group6.controller.lookup;

/**EmployeeAddressController.java
 * Controller  for Employee Address
 * Author: Nkuna Justin(219319820)
 * Date: 17 June 2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import za.ac.cput.group6.domain.user.EmployeeAddress;
import za.ac.cput.group6.service.lookup.IEmployeeAddressService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employee/")

public class EmployeeAddressController {


    private final IEmployeeAddressService employeeAddressService;

    @Autowired
    public EmployeeAddressController(IEmployeeAddressService employeeAddressService) {
        this.employeeAddressService = employeeAddressService;
    }


    @PostMapping("save")
    public EmployeeAddress save(EmployeeAddress employeeAddress) {

        return employeeAddressService.save(employeeAddress);


    }

    private Optional<EmployeeAddress> getById(String staffId) {
        return this.employeeAddressService.read(staffId);
    }

    @GetMapping("read/{staffId}")
    public Optional<EmployeeAddress> read(String staffId) {

        return this.employeeAddressService.read(staffId);
    }


    @DeleteMapping("delete")
    public void delete(String staffId) {

        this.employeeAddressService.delete(staffId);
    }

    @GetMapping("all")
    public List<EmployeeAddress> getAll(String staffId) {
        return this.employeeAddressService.getAll(staffId);


    }
}