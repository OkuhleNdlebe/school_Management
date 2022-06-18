package za.ac.cput.group6.service.lookup;

import za.ac.cput.group6.domain.lookup.StudentAddress;
import za.ac.cput.group6.service.IService;

import java.util.List;

public interface IStudentAddressService extends IService<StudentAddress, String> {
    void delete(StudentAddress studentAddress);
}
