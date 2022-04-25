//package com.configurationbean.config;
//
//import com.configurationbean.entity.SimpleBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
///**
// * @author ManhKM on 11/27/2021
// * @project spring-boot-exam
// * ---
// * Thực hiện cho việc Config với Các Bean cơ bản.
// */
//@Configuration
//public class AppConfig {
//
//    /**
//     * Khởi tạo một Bean -> SimpleBean.
//     * Ở đâu khi một Instance được tạo ra mới và được đánh
//     * là Bean + đặt tên và gọi cho IoC để quản lý nó.
//     * @return Object SimpleBean
//     * -----
//     * Nếu có quá nhiều Bean có cùng một Kiểu (| xuất phát từ một Object Java thì sẽ cần một @primary)
//     *      + but 2 were found: efined by method x 2...
//     */
//    @Bean("manhkm")
//    @Primary
//    SimpleBean simpleBeanConfigure(){
//        return new SimpleBean("manhkm-config-bean");
//    }
//
//    @Bean("ngocTrinh")
//    SimpleBean getNgocTrinh(){
//        return new SimpleBean("ngocTrinh");
//    }
//}
