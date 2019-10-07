package com.om.controller;

import com.om.mappers.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String index() {
        findAllTests();
        return "Greetings from Spring Boot!";
    }

    @Autowired
    @Qualifier("testMapper")
    private TestMapper testMapper;

    public void findAllTests() {
        System.out.println("Size ="+testMapper.findAllTest().size());
        System.out.println("testMapper ="+testMapper);
    }
}
