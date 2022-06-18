package za.ac.cput.group6.domain.user;

import za.ac.cput.group6.domain.lookup.Address;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

/**EmployeeAddress.java
 * Domain  for Employee Address
 * Author: Nkuna Justin(219319820)
 * Date: 09 June 2022
 */

@Entity
public class EmployeeAddress  implements Serializable {
    @Id

    @Column
    private String staffId;

   @OneToOne(mappedBy="address")
    private Address address;


    private EmployeeAddress(Builder builder){

        this.staffId=builder.staffId;
        this.address=builder.address;

    }

    public EmployeeAddress() {

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

        public Builder setStaffId(String staffId) {
            this.staffId = staffId;

            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;

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
