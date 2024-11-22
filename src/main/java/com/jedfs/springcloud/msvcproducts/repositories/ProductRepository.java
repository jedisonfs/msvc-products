package com.jedfs.springcloud.msvcproducts.repositories;

import com.jedfs.springcloud.msvcproducts.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {


}
