package com.testt.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testt.test.service.CustomService;

@RestController
public class CustomController {

    @Autowired
    private CustomService customService;

    @GetMapping("/{id}")
    public Object getById(@PathVariable Long id) {
        return customService.getById(id);
    }

    @PostMapping
    public Object save(@RequestBody Object object) {
        return customService.save(object);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        customService.deleteById(id);
    }

}