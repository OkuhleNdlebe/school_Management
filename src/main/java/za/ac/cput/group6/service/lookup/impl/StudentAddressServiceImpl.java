package za.ac.cput.group6.service.lookup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.group6.domain.lookup.StudentAddress;
import za.ac.cput.group6.repository.lookup.StudentAddressRepository;
import za.ac.cput.group6.service.lookup.IStudentAddressService;

import java.util.List;


@Service
public class StudentAddressServiceImpl implements IStudentAddressService {

    @Autowired
    private StudentAddressRepository repository;

    @Override
    public StudentAddress create(StudentAddress studentAddress) {
        return repository.save(studentAddress);
    }

    @Override
    public StudentAddress read(String studentId) {
        return repository.findByName(studentId);
    }

    @Override
    public StudentAddress update(StudentAddress studentAddress) {
        return repository.save(studentAddress);
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void delete(StudentAddress studentAddress) {
        System.out.println(studentAddress);
        repository.delete(studentAddress);

    }
    public List<StudentAddress> getAll(){
        return repository.findAll();
    }
}

