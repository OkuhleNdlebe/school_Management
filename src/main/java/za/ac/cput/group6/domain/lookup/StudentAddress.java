package za.ac.cput.group6.domain.lookup;

import javax.persistence.*;

@Entity
@Table(name = "studentAddress")
public class StudentAddress {

    @Id
    @Column
    private String studentId;
    @Column
    private Address address;

    private StudentAddress(Builder builder) {
        this.studentId = builder.studentId;

    }

    public StudentAddress() {

    }

    public String getStudentId() {
        return studentId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "studentId='" + studentId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        private String studentId;
        private String address;

        public Builder setstudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setaddress(String address) {
            this.address = address;
            return this;
        }

        public Builder copy(StudentAddress studentAddress) {
            this.studentId = studentAddress.studentId;

            return this;
        }

        public StudentAddress build() {
            return new StudentAddress(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (this == o) return true;
        StudentAddress x = (StudentAddress) o;
        return this.studentId.equals(x.studentId) && this.address.equals(x.address);
    }
}