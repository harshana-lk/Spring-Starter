package me.harshu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("one")
public class ControllerOne {
    @GetMapping
    public void getController(){
        System.out.println("Hello Controller One");
    }
}
