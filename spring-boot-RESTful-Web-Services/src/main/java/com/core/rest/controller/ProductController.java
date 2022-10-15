package com.core.rest.controller;

import com.core.rest.api.ApiResponse;
import com.core.rest.entity.Product;
import com.core.rest.service.ProductService;
import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ManhKM on 10/15/2022
 * @project spring-boot-RESTful-Web-Services
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public ApiResponse getProduct(){
        return productService.listAll();
    }

    @GetMapping("/product/{id}")
    public ApiResponse listItemById(@PathVariable int id){
        return productService.listItemById(id);
    }

    @PutMapping(value = "/product")
    public ApiResponse updateItem(@RequestBody Product product){
        return productService.updateItem(product);
    }

    @PostMapping("/product/{id}")
    public ApiResponse addProduct(@RequestBody Product product){
        return productService.addItem(product);
    }

    @DeleteMapping("/product/{id}")
    public ApiResponse deleteProduct(@PathVariable int id){
        return productService.deleteItem(id);
    }

    @PostMapping("/product-delete")
    public ApiResponse deleteMultiple(@RequestBody List<Integer> ids){
        return productService.deleteMultiple(ids);
    }

}
