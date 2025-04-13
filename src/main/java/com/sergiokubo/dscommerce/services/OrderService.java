package com.sergiokubo.dscommerce.services;

import com.sergiokubo.dscommerce.dto.OrderDTO;
import com.sergiokubo.dscommerce.entities.Order;
import com.sergiokubo.dscommerce.repositories.OrderRepository;
import com.sergiokubo.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        OrderDTO dto = new OrderDTO(order);
        return dto;
    }
}
