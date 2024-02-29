package com.example.demojpa.service;

import com.example.demojpa.entity.OrderDetailsEntity;
import com.example.demojpa.entity.OrderEntity;
import com.example.demojpa.entity.ProductEntity;

import java.util.List;

public interface CartService {
    void addProduct(int productId);
    void removeProduct(int productId);
    OrderEntity checkOut(String cusName, String cusAddress);

    List<OrderDetailsEntity> showCart();

}
