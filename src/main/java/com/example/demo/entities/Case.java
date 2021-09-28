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

    public Case() {
    }

    public Case(long id, String manufacturer, String modelname) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.modelname = modelname;
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

    @Override
    public String toString() {
        return "Case{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", modelname='" + modelname + '\'' +
                '}';
    }
}
