package com.sergiokubo.dscommerce.repositories;

import com.sergiokubo.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
