/* NameServiceImpl.java
 * Service for the Name domain.
 * Author: Bokang Molaoa [218131097]
 * Date: 16 June 2022
 */
package za.ac.cput.group6.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.group6.service.user.INameService;
import za.ac.cput.group6.domain.user.Name;
import za.ac.cput.group6.repository.user.NameRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NameServiceImpl implements INameService {
    @Autowired
    private NameRepository repository;

    @Override
    public Name create(Name name) {
       return repository.save(name);
    }

    public Optional<Name> read(String lastName) {
        return repository.findById(lastName);
    }

    @Override
    public Name update(Name name) {
     return null;
    }

    @Override
    public void delete(Name name) {
        repository.delete(name);
    }

    @Override
    public List<Name> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Name> findByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

    @Override
    public List<Name> findByMiddleName(String middleName) {
        return repository.findByMiddleName(middleName);
    }

    @Override
    public List<Name> findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    @Override
    public Name save(Name name) {
        return null;
    }
}
