package me.harshu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("variable")
public class PathVariableController {

//    When Path Variable name and the Parameter name are same
    @GetMapping(path = "{itemCode:[a-z]{4}}")//handler mapping
    public String save(@PathVariable String itemCode){
        System.out.println("Hello Items");
        return "Item Code : "+itemCode ;
    }

//    When Path Variable name and the Parameter name are not same
    @GetMapping(path = "{code}/{name}")//handler mapping
    public String getAllItems(@PathVariable("code") String itemCode,@PathVariable("name") String itemName){
        System.out.println("Hello Items");
        return "Item Code : "+itemCode +"\n" + "Item Name : "+itemName;
    }
}
