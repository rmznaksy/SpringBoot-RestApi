package com.spring.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "KULLANICILAR")
@Data
public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="ADI", length = 50)
    private String firstName;
    @Column(name="SOYADI", length = 50)
    private String lastName;
}
