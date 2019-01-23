package com.anjubao.ceshiparentribbon.controller;

import com.anjubao.ceshiparentribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hiController(@RequestParam String name){
        return helloService.hiService(name);
    }
}
