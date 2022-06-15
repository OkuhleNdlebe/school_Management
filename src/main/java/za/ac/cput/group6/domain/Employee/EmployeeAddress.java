package za.ac.cput.group6.domain.Employee;
/**EmployeeAddress.java
 * Domain  for Employee Address
 * Author: Nkuna Justin(219319820)
 * Date: 09 June 2022
 */
import org.apache.tomcat.jni.Address;

public class EmployeeAddress {

    private String staffId;
    private Address address;


    private EmployeeAddress(Builder builder){

        this.staffId=builder.staffId;
        this.address=builder.address;

    }

    public String getStaffId() {
        return staffId;
    }

    public Address getAddress() {
        return address;
    }
    public static class Builder {

        private String staffId;
        private Address address;

        public Builder staffId(String staffId){

            this.staffId=staffId;
            return this;
        }

        public Builder address(Address address){
            this.address=address;
            return this;



        }
        public Builder copy(EmployeeAddress address){

            this.staffId=address.staffId;
            this.address=address.address;
            return this;

        }

        public EmployeeAddress build(){


            return  new EmployeeAddress(this);
        }


    }
}
