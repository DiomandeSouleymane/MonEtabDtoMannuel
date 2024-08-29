package com.digitalacademy.monetab.models;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "adresse")
public class Adresse extends AbstractAuditing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @Transient
    private User user;


}
