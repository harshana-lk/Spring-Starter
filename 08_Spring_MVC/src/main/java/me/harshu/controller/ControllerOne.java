package me.harshu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controller")
public class ControllerOne {
    @GetMapping
    public void testMethod(){
        System.out.println("Request Received");
    }

    public ControllerOne() {
        System.out.println("Controller One Object Created");
    }
}