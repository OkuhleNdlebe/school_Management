package za.ac.cput.group6.factory.lookup;
/**EmployeeFactory.java
 * Factory for Employee
 * Author: Nkuna Justin(219319820)
 * Date: 09 June 2022
 */
import za.ac.cput.group6.domain.user.Employee.Employee;
import za.ac.cput.group6.domain.user.Name;
import za.ac.cput.group6.util.Helper;

public class EmployeeFactory {

    public static Employee buildEmployee(String staffId, String email, Name name){

        if(!Helper.isValidString(staffId) || !Helper.isValidString(email) || name == null)
            throw new IllegalArgumentException("IllegalArgumentException");

        return new Employee.Builder()
                .staffId(staffId)
                .email(email)
                .name(name)
                .build();

    }
}
