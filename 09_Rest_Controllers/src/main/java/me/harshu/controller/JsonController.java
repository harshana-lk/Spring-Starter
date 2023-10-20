package me.harshu.controller;

import me.harshu.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JsonController {

    @PostMapping
    public String getJsonRequest(@RequestBody CustomerDTO customerDTO) {
        return "Hello Json : "+customerDTO.toString();
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO sendBackJson() {
        return new CustomerDTO("I001","Harshana","Badulla",150000.00);
    }

    @GetMapping(path = "array",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<CustomerDTO> sendBackJsonArray() {
        ArrayList<CustomerDTO> arrayList = new ArrayList<>();
        arrayList.add(new CustomerDTO("I001","Harshana","Badulla",150000.00));
        arrayList.add(new CustomerDTO("I001","Harshana","Badulla",150000.00));
        arrayList.add(new CustomerDTO("I001","Harshana","Badulla",150000.00));
        return arrayList ;
    }

}
