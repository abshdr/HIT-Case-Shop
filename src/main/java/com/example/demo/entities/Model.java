package com.example.demo.entities;
import com.example.demo.repositories.CaseRepo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="model")
public class Model {
    @Id
    private String name;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long brandid;
    private String height;
    private String width;
    private String img;

    public Model() {
    }

    public Model(long id, String name, long brandid, String height, String width, String img) {
        this.id = id;
        this.name = name;
        this.brandid = brandid;
        this.height = height;
        this.width = width;
        this.img = img;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBrandid() {
        return brandid;
    }

    public void setBrandid(long brandid) {
        this.brandid = brandid;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }



    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brandid=" + brandid +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
