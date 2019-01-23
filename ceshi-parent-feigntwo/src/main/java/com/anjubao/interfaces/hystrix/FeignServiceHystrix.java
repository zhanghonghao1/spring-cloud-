package com.anjubao.interfaces.hystrix;

import com.anjubao.interfaces.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystrix implements FeignService {
    @Override
    public String feignClient(String name) {
        return "熔断器2启动了"+name;
    }
}
