package com.demo.family.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String familyName;
    private String familyAddress;
    private Long familyHome;
}
