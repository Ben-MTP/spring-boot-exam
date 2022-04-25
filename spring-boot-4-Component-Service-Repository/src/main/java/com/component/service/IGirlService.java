package com.component.service;

import com.component.model.Girl;

/**
 * @author ManhKM on 3/16/2022
 * @project spring-boot-4-Component-Service-Repository
 * -----
 * Interface Service -> giải quyết các logic nghiệm vụ.
 * Lớp GirlService sẽ giao tiếp với Database thông qua GirlRepository.
 */
public interface IGirlService {
     /**
      * Random ra một cái đối tượng Girl
      * @return
      */
     Girl getRandomGirl();

     /**
      * Random là một cái tên có độ dài cho trước truyền vào.
      * @param length
      * @return
      */
     String ramdomGirlName(int length);
}
