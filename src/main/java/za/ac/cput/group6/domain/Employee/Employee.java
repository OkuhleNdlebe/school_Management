package za.ac.cput.group6.domain.Employee;
/**Employee.java
 * Domain  for Employee
 * Author: Nkuna Justin(219319820)
 * Date: 09 June 2022
 */
import java.util.Objects;
public class Employee {

    private String staffId,email,name;

private Employee(){}

    public Employee(Builder builder){

    this.staffId=builder.staffId;
    this.email=builder.email;
    this.name=builder.name;



    }

    public String getStaffId() {
        return staffId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }



    public static class Builder {
private String staffId,email,name;


        public Builder staffId(String staffId) {
            this.staffId = staffId;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Employee employee) {
            this.staffId = employee.staffId;

            this.email = employee.email;

            this.name = employee.name;

            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
    @Override
    public boolean equals(Object o){

    if(this==o)return true;
    if(o== null || getClass() != o.getClass() )return false;
    Employee employee=(Employee) o;
    return staffId.equals(employee.staffId);



    }
    @Override
    public int hashCode(){

    return Objects.hash(staffId);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
