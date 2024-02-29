package com.example.demojpa.service.impl;

import com.example.demojpa.entity.CartEntity;
import com.example.demojpa.entity.OrderDetailsEntity;
import com.example.demojpa.entity.OrderEntity;
import com.example.demojpa.entity.ProductEntity;
import com.example.demojpa.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cartService")
public class CartServiceImpl implements CartService {
    @Autowired
    private CartEntity cartEntity;
    @Override
    public void addProduct(int productId) {
        cartEntity.addProduct(productId);
    }

    @Override
    public void removeProduct(int productId) {
        cartEntity.removeProduct(productId);
    }

    @Override
    public OrderEntity checkOut(String cusName, String cusAddress) {
        return cartEntity.checkOut(cusName, cusAddress);
    }

    @Override
    public List<OrderDetailsEntity> showCart() {
        return cartEntity.getOdList();
    }
}
