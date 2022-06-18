/* INameRepository.java
 * Interface Repository for the Name domain.
 * Author: Bokang Molaoa [218131097]
 * Date: 9 June 2022
 */

package za.ac.cput.group6.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group6.domain.user.Name;

import java.util.List;

@Repository
public interface NameRepository extends JpaRepository<Name, String> {
    List<Name> findByFirstName(String firstName);
    List<Name> findByMiddleName(String middleName);
    List<Name> findByLastName(String lastName);
    List<Name> findAll();
}
