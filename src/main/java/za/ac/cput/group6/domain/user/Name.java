/* Name.java
Domain for the Name.
Author: Bokang Molaoa (218131097) ADP3 June Assessment.
Date: 9 June 2022
*/
package za.ac.cput.group6.domain.user;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Name implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String firstName;
    @Column
    private String middleName;
    @Column
    private String lastName;

    private Name(Builder builder){
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public Name() {}

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name{" + "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + '}';
    }

    public static class Builder {
        private String firstName, middleName, lastName;

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Name name){
            this.firstName = name.firstName;
            this.middleName = name.middleName;
            this.lastName = name.lastName;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }

    @Override
    public boolean equals(Object o){
        if(o == null || this.getClass() != o.getClass()) return false;
        if(this == o) return true;
        Name x = (Name) o;
        return this.firstName.equals(x.firstName) && this.middleName.equals(x.middleName) && this.lastName.equals(x.lastName);
    }

}
