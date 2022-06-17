package za.ac.cput.group6.factory.lookup;

/**EmployeeAddressFactory.java
 * Factory   for Employee
 * Author: Nkuna Justin(219319820)
 * Date: 10 June 2022
 */


import za.ac.cput.group6.domain.user.Employee.EmployeeAddress;
import za.ac.cput.group6.domain.lookup.Address;
import za.ac.cput.group6.util.Helper;

public class EmployeeAddressFactory {

    public static EmployeeAddress build(String staffId, Address address){

        if(!Helper.isValidString(staffId) )
            throw new IllegalArgumentException("IllegalArgumentException");


        if (address==null)
            throw new IllegalArgumentException("Address is required!");


        return new EmployeeAddress.Builder().staffId(staffId).address(address).build();


    }

}
