package com.ricardofellini.ecommerceproject.controllers;

import com.ricardofellini.ecommerceproject.model.Item;
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
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }

    @PostMapping("/items")
    public Item addItem(@RequestBody Item item){
        return itemRepository.save(item);
    }

}
