package com.anjubao.interfaces;

import com.anjubao.interfaces.hystrix.FeignServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ceshi-parent-client",fallback = FeignServiceHystrix.class)
public interface FeignService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String feignClient(@RequestParam(value = "name") String name);
}
