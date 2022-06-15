package za.ac.cput.group6.factory.lookup;

/**EmployeeAddressFactory.java
 * Domain  for Employee
 * Author: Nkuna Justin(219319820)
 * Date: 10 June 2022
 */

import org.apache.tomcat.jni.Address;
import za.ac.cput.group6.domain.Employee.EmployeeAddress;

public class EmployeeAddressFactory {

    public static EmployeeAddress build(String staffId, Address address){

        return new EmployeeAddress.Builder().staffId(staffId).address(address).build();


    }

}
