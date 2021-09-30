package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="cases")

public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String manufacturer;
    private String modelname;
    private String dimensions;

    public Case() {
    }

    public Case(long id, String manufacturer, String modelname, String dimensions) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.modelname = modelname;
        this.dimensions = dimensions;
    }

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

    @Override
    public String toString() {
        return "Case{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", modelname='" + modelname + '\'' +
                ", dimensions='" + dimensions + '\'' +
                '}';
    }
}
