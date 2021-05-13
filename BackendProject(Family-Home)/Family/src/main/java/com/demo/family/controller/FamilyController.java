package com.demo.family.controller;

import com.demo.family.dto.FamilyResponse;
import com.demo.family.entity.Family;
import com.demo.family.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/family")
public class FamilyController {

    @Autowired
    FamilyService familyService;

    @PostMapping("/")
    public Family saveFamily(@RequestBody Family family){
        return familyService.saveFamily(family);
    }

    @GetMapping("{id}")
    public FamilyResponse findFamilyById(@PathVariable("id") Long id){
        return familyService.findFamilyById(id);
    }

    @GetMapping("/testapp")
    public String test(){
        return "Family App Working";
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}

