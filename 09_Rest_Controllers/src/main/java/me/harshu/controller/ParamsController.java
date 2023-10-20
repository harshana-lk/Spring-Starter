package me.harshu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {

    @GetMapping(params = {"param01","param02"})//handler mapping
    public String test01() {
        System.out.println("Hello Param 01");
        return "Hello Param 01";
    }

    @GetMapping()//handler mapping
    public String test02() {
        System.out.println("Hello Param 02");
        return "Hello Param 02";
    }
}
