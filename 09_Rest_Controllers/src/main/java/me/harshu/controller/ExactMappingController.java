package me.harshu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("exact")
public class ExactMappingController {
    @GetMapping(path = "get/cust")//handler mapping
    public String getAllItems(){
        System.out.println("Hello Items");
        return "Hello Items";
    }

    @GetMapping(path = "search")//handler mapping
    public String searchItems(){
        System.out.println("Search Items");
        return "Search Items";
    }
}
