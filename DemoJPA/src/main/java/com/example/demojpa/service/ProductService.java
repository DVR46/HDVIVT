package com.example.demojpa.service;

import com.example.demojpa.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void createProduct(ProductEntity productEntity);

    List<ProductEntity> getAll();

    ProductEntity findById(int id);

    List<ProductEntity> displayProducts(int pageNo, int displayQuantity);
    double pageNum(int displayQuantity);
    List<ProductEntity> searchByCatalog(String catalog);

    List<ProductEntity> sortByName();
}
