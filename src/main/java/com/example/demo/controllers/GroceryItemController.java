package com.example.demo.controllers;

import com.example.grocery.entity.GroceryItem;
import com.example.grocery.service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class GroceryItemController {
    @Autowired
    private GroceryItemService groceryItemService;

    @GetMapping
    public List<GroceryItem> getAllItems() {
        return groceryItemService.getAllItems();
    }

    @GetMapping("/{id}")
    public GroceryItem getItemById(@PathVariable Long id) {
        return groceryItemService.getItemById(id);
    }

    @PostMapping
    public GroceryItem saveItem(@RequestBody GroceryItem item) {
        return groceryItemService.saveItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        groceryItemService.deleteItem(id);
    }
}

