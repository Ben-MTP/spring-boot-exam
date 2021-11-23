package com.javabean;

import org.apache.commons.beanutils.PropertyUtils;

import java.beans.PropertyDescriptor;

public class MainJavaBean {
    /***
     * Method lấy ra các thuộc tính của một POJO EmployeeBean.class
     * @param args
     */
    public static void main(String[] args) {
        PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(EmployeeBean.class);
        System.out.println("Danh sách các thuộc tính có trong EmployeeBean: ");
        for(PropertyDescriptor propertyDescriptor : propertyDescriptors){
            System.out.println(propertyDescriptor.getDisplayName());
        }
    }
}
