package com.example.demojpa.controller;

import com.example.demojpa.entity.ProductEntity;
import com.example.demojpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.apache.logging.log4j.util.LambdaUtil.getAll;

@Controller
@RequestMapping("home")
public class HomeController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public String listProduct(@RequestParam(value = "limit", defaultValue = "5") int limit,
                              @RequestParam(value = "index", defaultValue = "1") int index,
                              Model model){
        int pageNum = (int) productService.pageNum(limit);
        model.addAttribute("pageNum", pageNum);
        model.addAttribute("limit", limit);
        List<ProductEntity> productList = productService.displayProducts(index, limit);
        model.addAttribute("productList", productList);
        return "Home";
    }




}
