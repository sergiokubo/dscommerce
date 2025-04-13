package com.sergiokubo.dscommerce.dto;

import com.sergiokubo.dscommerce.entities.OrderItem;

public class OrderItemDTO {

    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;

    public OrderItemDTO(){
    }

    public OrderItemDTO(Long productId, String name, Double price, Integer quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public OrderItemDTO(OrderItem entity) {
        productId = entity.getProduct().getId();
        name = entity.getProduct().getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Long getProductId() {
        return productId;
    }

    public  Double getSubTotal(){
        return price * quantity;
    }
}
