package com.demo.family.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Home {

    private Long id;
    private String homeName;
    private Integer homeNumber;
}
