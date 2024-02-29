package com.example.demojpa.service.impl;

import com.example.demojpa.entity.OrderDetailsEntity;
import com.example.demojpa.entity.OrderEntity;
import com.example.demojpa.entity.ProductEntity;
import com.example.demojpa.repository.OrderDetailsRepository;
import com.example.demojpa.repository.OrderRepository;
import com.example.demojpa.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;


    @Override
    @Transactional
    public void saveOrder(OrderEntity orderEntity, OrderDetailsEntity orderDetailsEntity, ProductEntity productEntity) {
        orderEntity = orderRepository.save(orderEntity);

        orderDetailsEntity.setOrderEntity(orderEntity);
        orderDetailsEntity.setProductEntity(productEntity);
        orderDetailsRepository.save(orderDetailsEntity);
    }

    @Override
    public List<OrderEntity> findAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public OrderEntity findById(int id) {
        return orderRepository.findById(id);
    }


    @Override
    public List<OrderEntity> findOrderCurrentMonth() {
        return orderRepository.findOrderCurrentMonth();
    }

}
