package com.spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GeneratedColumn;

@Entity
@Table(name = "KULLANICILAR")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="ADI", length = 50)
    private String firstName;
    @Column(name="SOYADI", length = 50)
    private String lastName;
}
