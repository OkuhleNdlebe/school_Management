package za.ac.cput.group6.service.user;
import za.ac.cput.group6.domain.user.Name;

import java.util.List;
import java.util.Optional;

public interface INameService {

    Name create(Name name);

    Name update(Name name);

    void delete(Name name);

    List<Name> getAll();
    List<Name> findByFirstName(String firstName);

    List<Name> findByMiddleName(String middleName);

    List<Name> findByLastName(String lastName);

    Name save(Name name);

}
