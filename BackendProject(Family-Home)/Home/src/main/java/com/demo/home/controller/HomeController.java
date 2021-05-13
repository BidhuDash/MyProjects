package com.demo.home.controller;

import com.demo.home.entity.Home;
import com.demo.home.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    public HomeService homeService;

    @PostMapping("/")
    public Home saveHome(@RequestBody Home home){
        return homeService.saveHome(home);
    }

    @GetMapping("/{id}")
    public Home findHomeById(@PathVariable("id") Long homeId){
        return homeService.findHomeById(homeId);
    }

    @GetMapping("/testapp")
    public String test(){
        return "Home App Running";
    }


}
