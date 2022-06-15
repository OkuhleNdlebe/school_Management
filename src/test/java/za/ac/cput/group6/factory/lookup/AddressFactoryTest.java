package za.ac.cput.group6.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.domain.lookup.Address;
// Lukhona Tetyana

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    @Test
    public void buildThatRuns() {
        Address address = AddressFactory.build("01", "Sapphire mews", "85",
                "Cravenby", 5857);
        System.out.println(address);
        assertNotNull(address);
    }

    @Test
    public void buildWithError() {

        Address address = AddressFactory.build("", "", "",
                "", 5857);
        System.out.println("Please fill in the blanks");
        assertNotNull(address);


    }
}