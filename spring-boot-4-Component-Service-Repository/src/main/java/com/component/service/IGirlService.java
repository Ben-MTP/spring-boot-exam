package com.component.service;

import com.component.entity.Girl;

/**
 * @author ManhKM on 3/16/2022
 * @project spring-boot-4-Component-Service-Repository
 */
public interface IGirlService {
     Girl getRandomGirl();
     String ramdomGirlName(int length);
}
