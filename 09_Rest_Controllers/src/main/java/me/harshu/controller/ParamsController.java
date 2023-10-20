package me.harshu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {

    @GetMapping(params = {"id","name"})//handler mapping
    public String test01(String id,String name) {
        System.out.println("Hello Param 01 : "+id+" "+name);
        return "Hello Param 01 : "+id+" "+name;
    }

    @GetMapping()//handler mapping
    public String test02() {
        System.out.println("Hello Param 02");
        return "Hello Param 02";
    }

    @GetMapping(params = {"name","salary"})//handler mapping
    public String test03(@RequestParam("name") String myName,@RequestParam("salary") double mySalary) {
        System.out.println("Hello Param 03 : "+myName+" "+mySalary);
        return "Hello Param 03 : "+myName+" "+mySalary;
    }

    @GetMapping(path = "one",params = {"id"})//handler mapping
    public String test04(String id) {
        System.out.println("Hello Param 04 : "+id);
        return "Hello Param 04 : "+id;
    }
}
