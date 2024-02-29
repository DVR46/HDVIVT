package com.example.demojpa.repository;

import com.example.demojpa.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    ProductEntity findById(int id);
    @Query(value = "select * from product " +
            "limit ?1 offset ?2", nativeQuery = true)
    List<ProductEntity> displayProductByPageNo(int limit, int offset);

    @Query(value = "select count(p.id) from ProductEntity p ")
    double countProduct();

    @Query(value = "select p from ProductEntity p " +
            "order by p.name desc ")
    List<ProductEntity> sortByName();
    @Query(value = "select p from ProductEntity p " +
            "where p.catalog like ?1")
    List<ProductEntity> searchByCatalog(String catalog);
}
