package za.ac.cput.group6.factory.lookup;
/**EmployeeFactory.java
 * Domain  for EmployeeFactory
 * Author: Nkuna Justin(219319820)
 * Date: 09 June 2022
 */
import za.ac.cput.group6.domain.Employee.Employee;

public class EmployeeFactory {

    public static Employee buildEmployee(String staffId,String email,String name){

        return new Employee.Builder()
                .staffId(staffId)
                .email(email)
                .name(name)
                .build();

    }
}
