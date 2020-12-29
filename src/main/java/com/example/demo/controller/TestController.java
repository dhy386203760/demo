package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @GetMapping("/get")
    public  String get(){
        //测试dev
        return new Date().toString();
        //测试dev1
        //dev-test1
        //dev-test3
        //dev-test2
    }
}
