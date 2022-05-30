package com.ricardofellini.ecommerceproject.controllers;

import com.ricardofellini.ecommerceproject.model.Product;
import com.ricardofellini.ecommerceproject.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {


    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/items")
    public List<Product> getAllItems(){
        return itemRepository.findAll();
    }

    @PostMapping("/items")
    public Product addItem(@RequestBody Product product){
        return itemRepository.save(product);
    }

}
