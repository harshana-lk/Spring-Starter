package me.harshu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("two")
public class ControllerTwo {
    @GetMapping
    public String getController(){
        return "Hello Controller Two";
    }
}
