package com.example.demojpa.service.impl;

import com.example.demojpa.entity.ProductEntity;
import com.example.demojpa.repository.ProductRepository;
import com.example.demojpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void createProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }

    @Override
    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    public ProductEntity findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public List<ProductEntity> displayProducts(int pageNo, int displayQuantity) {
        int limit = displayQuantity;
        int offset = displayQuantity*(pageNo -1);
        return productRepository.displayProductByPageNo(limit, offset);
    }

    @Override
    public double pageNum(int displayQuantity) {
        return Math.ceil(productRepository.countProduct() /displayQuantity);
    }

    @Override
    public List<ProductEntity> searchByCatalog(String catalog) {
        return productRepository.searchByCatalog(catalog);
    }

    @Override
    public List<ProductEntity> sortByName() {
        return productRepository.sortByName();
    }


}
