package com.testt.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomRepository extends JpaRepository<Object, Long> {
    //Add required methods here
}