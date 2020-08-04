package com.schmollgruber.algorithms.services;

import com.schmollgruber.algorithms.entities.Item;
import com.schmollgruber.algorithms.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public ItemService() {
    }

    public void createNewItem() {
        Item newItem = new Item("some Name");
        this.itemRepository.save(newItem);
        System.out.println("saved on service: " + newItem.toString());
    }

    public List<Item> fetchAllItems() {
        return this.itemRepository.findAll();
    }
}
