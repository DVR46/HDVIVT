package com.example.demojpa.controller;

import com.example.demojpa.entity.OrderDetailsEntity;
import com.example.demojpa.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("cart")
public class CartController {
    @Autowired
    CartService cartService;

    @GetMapping
    public String showCart(Model model){
        List<OrderDetailsEntity> odList = cartService.showCart();
        model.addAttribute("odList", odList);
        return "Cart";
    }
    @GetMapping("add-to-cart")
    public RedirectView addToCart(@RequestParam(value = "productId" ) int productId){
        cartService.addProduct(productId);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/home");
        return redirectView;
    }

    @GetMapping("remove-product")
    public RedirectView removeProduct(@RequestParam(value = "productId" ) int productId){
        cartService.removeProduct(productId);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/cart");
        return redirectView;
    }
}
