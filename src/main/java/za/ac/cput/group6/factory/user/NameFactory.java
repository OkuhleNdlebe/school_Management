/* NameFactoryTest.java
 * Factory: NameFactory.
 * Author: Bokang Molaoa (218131097)
 * ADP3 June Assessment.
 * Date: 9 June 2022
 */
package za.ac.cput.group6.factory.user;

import za.ac.cput.group6.domain.user.Name;
import za.ac.cput.group6.util.*;

public class NameFactory {

    public static Name createName(String firstName, String middleName, String lastName) throws IllegalArgumentException{
        if(!Helper.isValidString(firstName) || !Helper.isValidString(lastName))
            throw new IllegalArgumentException("IllegalArgumentException");
        return new Name.Builder().setFirstName(firstName).setMiddleName(middleName).setLastName(lastName).build();
    }
}
