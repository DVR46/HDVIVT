package com.example.demojpa.repository;

import com.example.demojpa.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    OrderEntity findById(int id);
//    @Query(value = "select * from orders " +
//            "where order_date  like concat(date_format(curdate(), '%Y-%m'),'%')",
//    nativeQuery = true)
//    List<OrderEntity> findOrderCurrentMonth();

//    @Query(value = "select o from OrderEntity o " +
//            "where o.orderDate like concat(date_format(curdate(), '%Y-%m'), '%')")
//    List<OrderEntity> findOrderCurrentMonth();

    @Query(value = "select * from orders " +
            "where order_date like concat(date_format(curdate(), '%Y-%m'), '%')",
    nativeQuery = true)
    List<OrderEntity> findOrderCurrentMonth();


}
