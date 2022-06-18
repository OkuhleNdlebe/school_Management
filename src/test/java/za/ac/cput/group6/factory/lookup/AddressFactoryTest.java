/* Lukhona Tetyana
 * student no: 218119321
 * 09 June 2022 ADP assessment
 * AddressFactoryTest
 * Adp
 */
package za.ac.cput.group6.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.domain.lookup.Address;
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
        Address address = AddressFactory.build("45", "Seth", null,
                "Hezelby", 1265);
        System.out.println("Street number required!");
        assertNotNull(address);




    }
}