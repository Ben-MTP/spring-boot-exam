package com.core.rest.service;

import com.core.rest.api.ApiResponse;
import com.core.rest.entity.Product;
import com.core.rest.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ManhKM on 10/15/2022
 * @project spring-boot-RESTful-Web-Services
 */
@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public ApiResponse listAll(){
    List<Product> productList = productRepository.listAll();
    return new ApiResponse(productList);
  }

  public ApiResponse listItemById(int id){
    if(productRepository.listItemById(id).getId() == 0){
      return new ApiResponse("ERROR_01", "Does not exist");
    }
    return new ApiResponse(productRepository.listItemById(id));
  }

  public ApiResponse updateItem(Product itemForm){
    return new ApiResponse(productRepository.updateItem(itemForm));
  }

  public ApiResponse addItem(Product itemForm){
    return new ApiResponse(productRepository.addItem(itemForm));
  }

  public ApiResponse deleteItem(int id){
    return new ApiResponse(productRepository.deleteItem(id));
  }

  public ApiResponse deleteMultiple(List<Integer> ids){
    return new ApiResponse(productRepository.deleteMultiple(ids));
  }

}
