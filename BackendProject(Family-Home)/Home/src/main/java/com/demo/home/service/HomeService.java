package com.demo.home.service;

import com.demo.home.entity.Home;
import com.demo.home.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    public HomeRepository homeRepository;

    public Home saveHome(Home home){
        return homeRepository.save(home);
    }
    
    public Home findHomeById(Long homeId){
        return homeRepository.findHomeById(homeId);
    }
}
