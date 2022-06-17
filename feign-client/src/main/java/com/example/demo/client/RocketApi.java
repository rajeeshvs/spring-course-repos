package com.example.demo.client;

import com.example.demo.domain.Example;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "apiClient",url = "https://api.spacexdata.com/v2/launches/latest")
public interface RocketApi {

    @RequestMapping(method = RequestMethod.GET)
    Example spaceData();

}
