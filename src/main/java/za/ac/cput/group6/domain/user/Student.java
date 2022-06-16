package za.ac.cput.group6.domain.user;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Student")
public class Student implements Serializable {
   @NotNull
   @Id
   @Column
   private String studentId;
   @Column
    private String email;



   private Student(Builder builder){
       this.studentId = builder.studentId;
       this.email = builder.email;
   }
    protected Student(){

    }

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder{
      private String studentId;
      private String email;

      public Builder setstudentId(String studentId){
          this.studentId = studentId;
          return this;
      }
      public Builder setemail(String email){
          this.email = email;
          return this;
      }

      public Builder copy(Student student) {
          this.studentId = student.studentId;
          this.email = student.email;
          return this;
      }
      public Student build(){
          return new Student(this);
      }
    }
    @Override
    public boolean equals(Object o){
       if (o == null || this.getClass() != o.getClass()) return false;
       if (this == o) return true;
       Student x = (Student) o;

    return this.studentId.equals(x.studentId) && this.email.equals(x.email);
}

}
