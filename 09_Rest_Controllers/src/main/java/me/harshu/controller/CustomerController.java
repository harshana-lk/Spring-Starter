package me.harshu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @GetMapping//handler methods
    public String getAllCustomers(){
        System.out.println("Hello Customers");
        return "Hello customers";
    }

//    @GetMapping//handler methods
//    public String searchCustomer(){
//        System.out.println("Search Customers");
//        return "Search customers";
//    }

    @PostMapping
    public String saveCustomer(){
        System.out.println("Customer Saved");
        return "Customer Saved";
    }

    @DeleteMapping
    public String deleteCustomer(){
        System.out.println("Customer Deleted");
        return "Customer Deleted";
    }


    @PutMapping
    public String updateCustomer(){
        System.out.println("Customer Updated");
        return "Customer Updated";
    }
}
