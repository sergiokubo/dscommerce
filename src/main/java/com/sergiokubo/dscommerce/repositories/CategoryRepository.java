package com.sergiokubo.dscommerce.repositories;

import com.sergiokubo.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
