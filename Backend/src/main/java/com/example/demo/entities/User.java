package com.example.demo.entities;

import javax.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Table(name="user", schema = "hitcaseshop", catalog = "hitcaseshop")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "NATIVE")
    @GenericGenerator(name = "NATIVE", strategy = "native")
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
}
