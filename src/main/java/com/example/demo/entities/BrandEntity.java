package com.example.demo.entities;

import javax.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Table(name="brand", schema = "hitcaseshop", catalog = "hitcaseshop")
public class BrandEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "NATIVE")
    @GenericGenerator(name = "NATIVE", strategy = "native")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "logo")
    private String logo;
}
