package com.demo.family.service;

import com.demo.family.dto.FamilyResponse;
import com.demo.family.entity.Family;
import com.demo.family.entity.Home;
import com.demo.family.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FamilyService {
    @Autowired
    FamilyRepository familyRepository;
    @Autowired
    RestTemplate restTemplate;

    public Family saveFamily(Family family){
        return familyRepository.save(family);
    }

    public FamilyResponse findFamilyById(Long id){
        Family family = familyRepository.findFamilyById(id);
        Home home = restTemplate.getForObject("http://HOME-SERVICE/home/"+
                family.getFamilyHome(),Home.class);

        FamilyResponse familyResponse = new FamilyResponse();
        familyResponse.setFamily(family);
        familyResponse.setHome(home);
        return familyResponse;

    }
}
