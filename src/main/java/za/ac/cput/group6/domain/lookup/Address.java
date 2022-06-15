package za.ac.cput.group6.domain.lookup;
// Lukhona Tetyana

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Address  {
 private String unitNumber;
    private String complexName;
    @NotNull
    @Id private String streetNumber;
    private String streetName;
    private int postalCode;
//private City city;


    protected Address() {

    }

    private Address(Builder builder) {
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;
        //this.city = builder.city;
    }

    public String getComplexName() {
        return complexName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    // public City getCity() {
    //      return city;
    // }

    @Override
    public String toString() {
        return "Address{" +
                "unitNumber='" + unitNumber + '\'' +
                ", complexName='" + complexName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode=" + postalCode +
                //  ", city=" + city +
                '}';
    }

    public static class Builder {
         String unitNumber, complexName,  streetNumber, streetName;
        int postalCode;
        //City city;

        public Builder setUnitNumber(String unitNumber) {
            this.unitNumber = unitNumber;

            return this;
        }

        public Builder setComplexName(String complexName) {
            this.complexName = complexName;

            return this;

        }


        public Builder setStreetNumber(String streetNumber) {

            this.streetNumber = streetNumber;

            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;

            return this;
        }

        public Builder setPostalCode(int postalCode) {
            this.postalCode = postalCode;

            return this;
        }


        public Address build() {
            return new Address(this);
        }


        public Builder copy(Address address) {
            this.unitNumber = address.unitNumber;
            this.complexName = address.complexName;
            this.streetName = address.streetName;
            this.streetNumber = address.streetNumber;
            this.postalCode = address.postalCode;
            return this;
        }

    }

    public class streetNumber {
    }
}