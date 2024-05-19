package com.vcdstore.main.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcdstore.main.models.productData;

public interface databaseRepository extends JpaRepository<productData, Integer>{
    
}
