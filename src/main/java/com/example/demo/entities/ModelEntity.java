package com.example.demo.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name="model", schema = "hitcaseshop", catalog = "hitcaseshop")
public class ModelEntity {

    @Id
    @GeneratedValue(generator = "NATIVE")
    @GenericGenerator(name = "NATIVE", strategy = "native")
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private BrandEntity brand;
    @Column(name = "height")
    private String height;
    @Column(name = "width")
    private String width;
    @Column(name = "img")
    private String img;
    @Column(name = "dimensions")
    private String dimensions;
}
