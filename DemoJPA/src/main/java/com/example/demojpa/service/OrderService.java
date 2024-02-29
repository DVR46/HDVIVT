package com.example.demojpa.service;

import com.example.demojpa.entity.OrderDetailsEntity;
import com.example.demojpa.entity.OrderEntity;
import com.example.demojpa.entity.ProductEntity;

import java.util.List;

public interface OrderService {
    void saveOrder(OrderEntity orderEntity, OrderDetailsEntity orderDetailsEntity, ProductEntity productEntity);

    List<OrderEntity> findAllOrder();

    OrderEntity findById(int id);

    List<OrderEntity> findOrderCurrentMonth();

}
