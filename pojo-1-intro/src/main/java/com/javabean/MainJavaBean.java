package com.javabean;

import org.apache.commons.beanutils.PropertyUtils;

import java.beans.PropertyDescriptor;

public class MainJavaBean {
    public static void main(String[] args) {
        PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(EmployeeBean.class);
        for(PropertyDescriptor propertyDescriptor : propertyDescriptors){
            System.out.println(propertyDescriptor.getDisplayName());
        }
    }
}
