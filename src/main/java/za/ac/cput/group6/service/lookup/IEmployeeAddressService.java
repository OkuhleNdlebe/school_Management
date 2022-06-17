package za.ac.cput.group6.service.lookup;

import za.ac.cput.group6.domain.user.EmployeeAddress;
import za.ac.cput.group6.service.IService;

import java.util.List;

public interface IEmployeeAddressService extends IService<EmployeeAddress, String> {

    List<EmployeeAddress> getAll(String staffId);


}
