package com.jedfs.springcloud.msvcproducts.service;

import com.jedfs.springcloud.msvcproducts.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findById(Long id);
}
