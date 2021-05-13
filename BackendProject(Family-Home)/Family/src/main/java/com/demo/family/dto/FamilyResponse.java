package com.demo.family.dto;

import com.demo.family.entity.Family;
import com.demo.family.entity.Home;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FamilyResponse {

    private Family family;
    private Home home;
}
