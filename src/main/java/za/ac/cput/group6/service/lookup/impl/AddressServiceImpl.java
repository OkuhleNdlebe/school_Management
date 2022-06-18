/* Lukhona Tetyana
 * student no: 218119321
 * 09 June 2022 ADP assessment
 * AddressServiceImpl
 */
package za.ac.cput.group6.service.lookup.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.group6.domain.lookup.Address;
import za.ac.cput.group6.repository.lookup.AddressRepository;
import za.ac.cput.group6.service.lookup.AddressService;
import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository repository;

    @Autowired
    public AddressServiceImpl(AddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public Address save(Address address){
        return this.repository.save(address);
    }

    @Override
    public Optional<Address> read(String a){
        return this.repository.findById(a);
    }


    @Override
    public void delete(Address address) {
    this.repository.delete(address);
    }

    @Override
    public List<Address> findAll() {
        return this.repository.findAll();
    }

    @Override
    public void deleteById(String id) {
  Optional <Address>address = read(id);
  if(address.isPresent()) delete(address.get());

}
    @Override
    public Address update(Address address) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Address create(Address address) {
        return null;
    }

}
