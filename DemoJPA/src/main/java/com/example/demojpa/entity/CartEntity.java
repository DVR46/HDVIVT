package com.example.demojpa.entity;

import com.example.demojpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Scope(scopeName = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CartEntity {
    @Autowired
    ProductRepository productRepository;
    private Map<Integer, Integer> productEntityMap = new HashMap<>();

    public Map<Integer, Integer> getProductEntityMap() {
        return productEntityMap;
    }

    public void setProductEntityMap(Map<Integer, Integer> productEntityMap) {
        this.productEntityMap = productEntityMap;
    }

    public void addProduct(int productId){
        if(!productEntityMap.containsKey(productId)){
            productEntityMap.put(productId, 1);
            return;
        }
        productEntityMap.put(productId, productEntityMap.get(productId) + 1);
    }

    public void removeProduct(int productId){
        productEntityMap.put(productId, productEntityMap.get(productId) - 1);
        if(productEntityMap.get(productId) == 0){
            productEntityMap.remove(productId);
        }

    }

    public OrderEntity checkOut(String cusName, String cusAddress){
        OrderEntity or = new OrderEntity();
        or.setCustomerName(cusName);
        or.setCustomerAddress(cusAddress);
        or.setOrderDate(LocalDateTime.now());

        List<OrderDetailsEntity> details = new ArrayList<>();
        for(Map.Entry<Integer, Integer> prd: productEntityMap.entrySet()){
            OrderDetailsEntity od = new OrderDetailsEntity();
            od.setProductEntity(productRepository.findById(prd.getKey()));
            od.setQuantity(prd.getValue());
            od.setOrderEntity(or);
            details.add(od);
        }
        or.setOrderDetailsEntity(details);

        return or;
    }

    public List<OrderDetailsEntity> getOdList(){
        List<OrderDetailsEntity> details = new ArrayList<>();
        for(Map.Entry<Integer, Integer> prd: productEntityMap.entrySet()){
            OrderDetailsEntity od = new OrderDetailsEntity();
            od.setProductEntity(productRepository.findById(prd.getKey()));
            od.setQuantity(prd.getValue());
            details.add(od);
        }
        return details;
    }


}
