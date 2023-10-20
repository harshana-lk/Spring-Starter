package me.harshu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("character")
public class CharacterMappingController {

    @GetMapping(path = "item/I???")//handler mapping
    public String getAllItems(){
        System.out.println("Hello Items");
        return "Hello Items";
    }

//    @GetMapping(path = "")//handler mapping
//    public String searchItems(){
//        System.out.println("Search Items");
//        return "Search Items";
//    }
}
