package com.core.rest.repository;

import com.core.rest.entity.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * @author ManhKM on 10/15/2022
 * @project spring-boot-RESTful-Web-Services
 */
@Repository
public class ProductRepository {

    public static List<Product> listProduct = new ArrayList<>();
    static {
        listProduct.add(new Product(1, "Java Tutorial", 100.01f));
        listProduct.add(new Product(2, "Hibernate Tutorial", 100.01f));
        listProduct.add(new Product(3, "Spring Boot Tutorial", 100.01f));
        listProduct.add(new Product(4, "Oracle Database Tutorial", 100.01f));
        listProduct.add(new Product(5, "MySQl Tutorial", 100.01f));
        listProduct.add(new Product(6, "HTML Tutorial", 100.01f));
        listProduct.add(new Product(7, "JavaScript Tutorial", 100.01f));
        listProduct.add(new Product(8, "TypeScript Tutorial", 100.01f));
    }

    /**
     * Liệt kê toàn bộ danh sách Product hiện có trong trong Store
     * @return
     */
    public List<Product> listAll(){
        List<Product> productList = new ArrayList<>();
        for (Product item: listProduct) {
            productList.add(item);
        }
        return productList;
    }

    /**
     * Tìm danh sách theo Id của sản phẩm
     * Nếu không tìm được sản phẩm thì báo là sản phẩm không tồn tại
     * @param id
     * @return
     */
    public Product listItemById(int id){
        Product result = new Product();
        for (Product item: listProduct) {
            if(item.getId() == id){
                result = item;
                break;
            } else{
                result.setId(0);
            }
        }
        return result;
    }

    /**
     * Chỉnh sửa thông tin sản phẩm
     * @param itemForm
     * @return
     */
    public Product updateItem(Product itemForm){
        for (Product item: listProduct) {
            if(item.getId() == itemForm.getId()){
                item.setName(itemForm.getName());
                item.setPrice(itemForm.getPrice());
            }
        }
        return itemForm;
    }

    /**
     * Thêm sản phẩm vào danh sách
     * @param itemForm
     * @return
     */
    public Product addItem(Product itemForm){
        listProduct.add(itemForm);
        return itemForm;
    }

    /**
     * Xóa sản phẩm theo id
     * @param id
     * @return
     */
    public List<Product> deleteItem(int id){
        for (Product item: listProduct) {
            if(item.getId() == id){
                listProduct.remove(listItemById(id));
                break;
            }
        }
        return listProduct;
    }

    public List<Product> deleteMultiple(List<Integer> ids){
        for (Product item: listProduct) {
            for (int idx: ids){
                if(idx == item.getId()){
                    listProduct.remove(listItemById(idx));
                }
            }
        }
        return listProduct;
    }

    /**
     * Kiểm tra thông tin của sản phẩm
     * @param id - id của sản phẩm
     * @return
     */
    public boolean checkId(int id){
        return false;
    }


}
