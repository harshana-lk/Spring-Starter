package me.harshu.controller;

import me.harshu.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("json")
public class JsonController {

    @PostMapping
    public String getJsonRequest(CustomerDTO customerDTO) {
        return "Hello Json : "+customerDTO.toString();
    }
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO sendBackJson() {
        return new CustomerDTO("I001","Harshana","Badulla",150000.00);
    }

}
