package com.example.demo.entities;

import org.hibernate.annotations.GenericGenerator;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name="case", schema = "hitcaseshop", catalog = "hitcaseshop")
public class CaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "NATIVE")
    @GenericGenerator(name = "NATIVE", strategy = "native")
    private long id;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "model_id")
    private long model_id;
    @Column(name = "brand_id")
    private long brand_id;
    @Column(name = "model_name")
    private String modelName;
    @Column(name = "dimensions")
    private String dimensions;
}
