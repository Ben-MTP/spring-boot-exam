//package com.configurationbean.config;
//
//import com.configurationbean.entity.SimpleBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author ManhKM on 4/25/2022
// * @project spring-boot-6-Configuration-Bean
// */
//@Configuration
//public class ConfigMetaData {
//    @Bean
//    SimpleBean simpleBeanConfigure(){
//        /**
//         * Khởi tạo một instance của SimpleBean và trả ra ngoài.
//         * Lúc này ApplicationContext lần đầu chạy sẽ quét toàn bộ project
//         *      b1: Đọc các @Component
//         *      b2: Đọc các @Configuration -> đọc @Bean -> thực hiện hàm để lấy Bean -> đưa vào ApplicationContext -> quản lý
//         *
//         *      b3: Nếu method khác -> cũng tạo Bean -> nhưng bean phức tạo tạo từ các logic khác nhau
//         *          Nó sẽ chủ động inject Bean đã có trước đó vào đầu vào cho method tạo bean phức tạp.
//         * -----
//         * Có thể đặt Bean ở một file Configuration khác.
//         *
//         */
//        return new SimpleBean("manhkm-config-meta-data");
//    }
//}
