package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.CompanyApi;
import com.example.demo.domain.Company;

@RestController
public class ApiController {

    @Autowired
    private CompanyApi companyApi;

    @RequestMapping(value = "/companyinfo")
    public ResponseEntity<?> companyInfo(){
        Company company = companyApi.companyInfo();
        System.out.println(company.getCeo());
        System.out.println(companyApi);
        return new ResponseEntity<>(company,HttpStatus.OK);

    }
}
