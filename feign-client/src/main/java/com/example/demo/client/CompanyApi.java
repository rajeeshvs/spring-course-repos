package com.example.demo.client;

import com.example.demo.domain.Company;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url = "https://api.spacexdata.com/v2/info", name ="CompanyInfo")
public interface CompanyApi {
    @RequestMapping(method = RequestMethod.GET)
    Company companyInfo();
    
    @RequestMapping(method=RequestMethod.POST)
    void addCompany(Company company);
}
