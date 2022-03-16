package com.componentscan.others1;

import com.componentscan.Girl;
import com.componentscan.others.OtherGirl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ManhKM on 3/16/2022
 * @project spring-boot-5-ComponentScan
 * ---
 * Khi một Bean extend từ một Bean khác.
 * Để khởi tạo được cần dùng -> thì bean supper của nó cũng cần phải được khởi tạo.
 */
@Component
public class Student extends OtherGirl {

}
