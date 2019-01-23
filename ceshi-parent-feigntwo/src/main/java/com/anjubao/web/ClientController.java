package com.anjubao.web;

import com.anjubao.interfaces.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    FeignService feignService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return feignService.feignClient(name);
    }
}
