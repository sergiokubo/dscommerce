package com.sergiokubo.dscommerce.repositories;

import com.sergiokubo.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
