package com.pojo;

import org.apache.commons.beanutils.PropertyUtils;

import java.beans.PropertyDescriptor;

public class MainPojo {
    public static void main(String[] args) {
        System.out.println("Exam Class Pojo v1.0");

        PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(EmployeePojo.class);
        for(PropertyDescriptor propertyDescriptor : propertyDescriptors){
            System.out.println(propertyDescriptor.getDisplayName());
        }
    }
}
