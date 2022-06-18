/* Lukhona Tetyana
 * student no: 218119321
 * 09 June 2022 ADP assessment
 * AddressService
 * Adp
 */
package za.ac.cput.group6.service.lookup;


import za.ac.cput.group6.domain.lookup.Address;
import za.ac.cput.group6.service.IService;

import java.util.List;

public interface AddressService extends IService<Address,String> {
    List<Address> findAll();

    void deleteById(String id);
    void delete(Address address);
    Address save(Address address);






}

