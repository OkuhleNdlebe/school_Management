package za.ac.cput.group6.service.lookup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.group6.domain.lookup.Student;
import za.ac.cput.group6.repository.lookup.StudentRepository;
import za.ac.cput.group6.service.lookup.IStudentService;

import java.util.List;
import java.util.Optional;
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student create(Student student) {
        return repository.save(student);
    }

    @Override
    public Optional<Student> read(String a) {
        return repository.findById(a);
    }

    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void delete(Student student) {
        System.out.println(student);
        repository.delete(student);

    }
    public List<Student> getAll(){
        return repository.findAll();
    }
}
