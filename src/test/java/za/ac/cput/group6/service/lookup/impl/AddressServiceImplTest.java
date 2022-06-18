/* Lukhona Tetyana
 * student no: 218119321
 * 09 June 2022 ADP assessment
 * AddressServiceImplTest
 */
package za.ac.cput.group6.service.lookup.impl;



import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.group6.domain.lookup.Address;
import za.ac.cput.group6.factory.lookup.AddressFactory;
import za.ac.cput.group6.service.lookup.AddressService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AddressServiceImplTest {

 private final Address address = AddressFactory.build("01","Saaphire",
         "08","Cravenby", 2581);

 @Autowired
    private AddressService service;

@Test
    @Order(1)
   void save(){
        Address saved = this.service.save(this.address);
        assertEquals(this.address, saved);
        System.out.println(saved);
    }

    @Test
    @Order(2)
    void read(){
        Optional<Address> read = this.service.read(address.getStreetName());
        System.out.println(read);
        assertAll(
                ()-> assertTrue(read.isPresent()),
                () -> assertSame(this.address,read.get())
        );
    }

@Test
    @Order(3)
    void findAll(){
    List<Address> addressList = this.service.findAll();
    System.out.println(addressList);
    assertEquals(1,addressList.size());
}

@Test
    @Order(4)
    void delete(){
    this.service.delete(this.address);
    List<Address> addressList = this.service.findAll();
    assertEquals(1,addressList);
}


}