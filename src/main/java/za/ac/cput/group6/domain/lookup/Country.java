package za.ac.cput.group6.domain.lookup;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Id
    @Column
    private String id;

    @Column
    private String name;


    public Country() {
    }

    private Country(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country" + "\n" +
                "ID :" + " " +id + "\n" +
                "Name :"+" " + name ;
    }

    public static class Builder {
        private String id, name;

        public Builder setId(String id){
            this.id = id;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder copy(Country country){
            this.id = country.id;
            this.name = country.name;
            return this;
        }

        public Country build(){
            return new Country(this);
        }
    }

    @Override
    public boolean equals(Object o){
        if(o == null || this.getClass() != o.getClass()) return false;
        if(this == o) return true;
        Country x = (Country) o;
        return this.id.equals(x.id) && this.name.equals(x.name);
    }

}
