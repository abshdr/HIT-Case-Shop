package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="cases")
@SecondaryTable(name="model")
public class Dimension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String manufacturer;
    private String modelname;
    private String dimensions;
@Embedded
    private Name name;

    public Dimension() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", modelname='" + modelname + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", name=" + name +
                '}';
    }
}

@Embeddable
class Name{
    @Column(name = "name", table ="model")
     String name;

    public Name() {
    }

    public Name(String name) {
        name = name;
    }

    public String getName() {
        return name;
    }

    public void Name(String name) {
        name = name;
    }

}
