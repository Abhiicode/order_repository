package com.example.demo.repositories;

import com.example.grocery.entity.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}
