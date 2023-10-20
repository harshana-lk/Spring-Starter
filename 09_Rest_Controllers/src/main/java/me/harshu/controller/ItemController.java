package me.harshu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item")
public class ItemController {
    @GetMapping//handler mapping
    public String getAllItems(){
        System.out.println("Hello Items");
        return "Hello Items";
    }

    @GetMapping(path = "search")//handler mapping
    public String searchItems(){
        System.out.println("Search Items");
        return "Search Items";
    }

    @PostMapping
    public String saveItem(){
        System.out.println("Item Saved");
        return "Item Saved";
    }

    @DeleteMapping
    public String deleteItem(){
        System.out.println("Item Deleted");
        return "Item Deleted";
    }


    @PutMapping
    public String updateItem(){
        System.out.println("Item Updated");
        return "Item Updated";
    }
}
