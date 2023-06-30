package com.testt.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testt.test.repository.CustomRepository;

@Service
public class CustomService {

    @Autowired
    private CustomRepository customRepository;

    public Object getById(Long id) {
        return customRepository.findById(id).orElse(null);
    }

    public Object save(Object object) {
        return customRepository.save(object);
    }

    public void deleteById(Long id) {
        customRepository.deleteById(id);
    }
}