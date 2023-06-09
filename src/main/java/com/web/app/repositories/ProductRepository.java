package com.web.app.repositories;

import com.web.app.entities.Product;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
