package com.schmollgruber.algorithms.controller;

import com.schmollgruber.algorithms.entities.Item;
import com.schmollgruber.algorithms.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/saveItem")
    public void saveItem(){
        this.itemService.createNewItem();
    }

    @GetMapping("/fetchAll")
    public List<Item> fetchAll(){
        return this.itemService.fetchAllItems();
    }


}
