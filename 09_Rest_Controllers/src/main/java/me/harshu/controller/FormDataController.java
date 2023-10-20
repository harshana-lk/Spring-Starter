package me.harshu.controller;

import me.harshu.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")
public class FormDataController {
    @PostMapping
    public String testform01(@ModelAttribute CustomerDTO customerDTO){
        System.out.println("Request Received -> "+customerDTO.toString() );
        return "Request Received -> "+customerDTO.toString();
    }
}
