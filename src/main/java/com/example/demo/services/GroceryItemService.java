package com.example.demo.services;

import com.example.grocery.entity.GroceryItem;
import com.example.grocery.repository.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryItemService {
    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public List<GroceryItem> getAllItems() {
        return groceryItemRepository.findAll();
    }

    public GroceryItem getItemById(Long id) {
        return groceryItemRepository.findById(id).orElse(null);
    }

    public GroceryItem saveItem(GroceryItem item) {
        return groceryItemRepository.save(item);
    }

    public void deleteItem(Long id) {
        groceryItemRepository.deleteById(id);
    }
}
