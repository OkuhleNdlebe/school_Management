/* Lukhona Tetyana
 * student no: 218119321
 * 09 June 2022 ADP assessment
 * AddressRepository
 * Adp
 */
package za.ac.cput.group6.repository.lookup;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group6.domain.lookup.Address;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {

    List<Address> findAll();

    Optional<Address> read(Object address);
}