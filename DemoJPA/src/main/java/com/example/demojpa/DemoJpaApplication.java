package com.example.demojpa;

import com.example.demojpa.config.Config;
import com.example.demojpa.entity.OrderDetailsEntity;
import com.example.demojpa.entity.OrderEntity;
import com.example.demojpa.entity.ProductEntity;
import com.example.demojpa.service.CartService;
import com.example.demojpa.service.OrderService;
import com.example.demojpa.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class DemoJpaApplication {

    public static void main(String[] args) throws Exception{
//        SpringApplication.run(DemoJpaApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        Scanner sc = new Scanner(System.in);
        ProductService productService = context.getBean("productService", ProductService.class);

//        for(int i = 1; i <= 10; i++){
//            ProductEntity p = new ProductEntity();
//            p.setName("product " + i);
//            p.setPrice(100*i);
//            if(i%2 == 0){
//                p.setCatalog("catalog 1");
//            } else{
//                p.setCatalog("catalog 2");
//            }
//            productService.createProduct(p);
//        }
//
//        for(ProductEntity p: productService.getAll()){
//            System.out.println(p.getId());
//            System.out.println(p.getName());
//            System.out.println(p.getPrice());
//            System.out.println(p.getCatalog());
//        }
//        System.out.println("==============");

//        System.out.print("Enter product id: ");
//        ProductEntity p = productService.findById(sc.nextInt());
//        sc.nextLine();
//        System.out.println(p.getId());
//        System.out.println(p.getName());
//        System.out.println(p.getPrice());
//        System.out.println(p.getCatalog());



//        OrderService orderService = context.getBean("orderService", OrderService.class);


//        OrderEntity order = new OrderEntity();
//        System.out.print("Customer name: ");
//        order.setCustomerName(sc.nextLine());
//        System.out.print("Address: ");
//        order.setCustomerAddress(sc.nextLine());
//        order.setOrderDate(LocalDateTime.now());
//
//        OrderDetailsEntity orderDetails = new OrderDetailsEntity();
//        System.out.print("Quantity: ");
//        orderDetails.setQuantity(sc.nextInt());
//        sc.nextLine();
//
//        System.out.print("Product id: ");
//        ProductEntity prd = productService.findById(sc.nextInt());
//        sc.nextLine();
//
//        orderService.saveOrder(order, orderDetails, prd);

//        for(OrderEntity o: orderService.findAllOrder()){
//            System.out.println(o.getId());
//            System.out.println(o.getCustomerName());
//            System.out.println(o.getCustomerAddress());
//            System.out.println(o.getOrderDate());
//            for(OrderDetailsEntity od: o.getOrderDetailsEntity()){
//                System.out.println(od.getId());
//                System.out.println(od.getQuantity());
//                Optional<ProductEntity> prd = productService.findById(od.getProductEntity().getId());
//                prd.ifPresent(productEntity -> {
//                    System.out.println(productEntity.getId());
//                    System.out.println(productEntity.getName());
//                    System.out.println(productEntity.getPrice());
//                        }
//                );
//
//            }
//        }
//
//        OrderEntity o1 = orderService.findById(2);
//            System.out.println(o1.getId());
//            System.out.println(o1.getCustomerName());
//            System.out.println(o1.getCustomerAddress());
//            System.out.println(o1.getOrderDate());

//        CartService cartService = context.getBean("cartService", CartService.class);

//        cartService.addProduct(1);
//        cartService.addProduct(1);
//        cartService.addProduct(1);
//        cartService.addProduct(2);
//        cartService.addProduct(2);
//
//        cartService.removeProduct(1);
//        cartService.removeProduct(2);
//        cartService.removeProduct(2);
//
//
//        System.out.print("Enter customer name: ");
//        String cusName = sc.nextLine();
//        System.out.print("Enter customer address: ");
//        String cusAddress = sc.nextLine();
//        System.out.println("==============");
//        OrderEntity or = cartService.checkOut(cusName, cusAddress);
////      System.out.println(or.getId());
//        System.out.println("Customer name: " + or.getCustomerName());
//        System.out.println("Customer address: " + or.getCustomerAddress());
//        System.out.println("Order date: " + or.getOrderDate());
//        for(OrderDetailsEntity od: or.getOrderDetailsEntity()){
////              System.out.println(od.getId());
//                ProductEntity prd = productService.findById(Math.toIntExact(od.getProductEntity().getId()));
//                System.out.println("Product id: " + prd.getId());
//                System.out.println("Name: " + prd.getName());
//                System.out.println("Price: " + prd.getPrice());
//                System.out.println("Quantity: " + od.getQuantity());
//        }
//
//        System.out.print("Enter product display quantity: " );
//        int displayQuantity = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Page : " );
//        for(int i = 1; i <= productService.pageNum(displayQuantity); i++){
//            System.out.print(i + " ");
//        }
//
//        System.out.print("Select page: " );
//        int pageNo = sc.nextInt();
//        sc.nextLine();
//        for(ProductEntity p: productService.displayProducts(pageNo, displayQuantity)){
//            System.out.println(p.getId());
//            System.out.println(p.getName());
//            System.out.println(p.getPrice());
//        }

////        System.out.print("Catalog: " );
////        String catalog = sc.nextLine();
//        for(ProductEntity p: productService.searchByCatalog("catalog 1")){
//            System.out.println(p.getId());
//            System.out.println(p.getName());
//            System.out.println(p.getPrice());
//        }
//
//        for(ProductEntity p: productService.sortByName()){
//            System.out.println(p.getId());
//            System.out.println(p.getName());
//            System.out.println(p.getPrice());
//        }



    }
}

