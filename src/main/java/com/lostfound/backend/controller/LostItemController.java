

package com.lostfound.backend.controller;

import com.lostfound.backend.model.LostItem;
import com.lostfound.backend.repository.LostItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/items")
public class LostItemController {

    @Autowired
    private LostItemRepository lostItemRepository;


    @PostMapping("/add")
    public LostItem addItem(@RequestBody LostItem item) {
        return lostItemRepository.save(item);
    }


    @GetMapping("/all")
    public List<LostItem> getAllItems() {
        return lostItemRepository.findAll();
    }


    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable Long id) {
        lostItemRepository.deleteById(id);
    }
}
