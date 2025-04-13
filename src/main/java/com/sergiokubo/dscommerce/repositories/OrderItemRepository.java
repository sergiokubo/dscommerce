package com.sergiokubo.dscommerce.repositories;

import com.sergiokubo.dscommerce.entities.OrderItem;
import com.sergiokubo.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
