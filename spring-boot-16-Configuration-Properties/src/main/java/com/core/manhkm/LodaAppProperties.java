package com.core.manhkm;

import com.core.manhkm.entity.Person;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author ManhKM on 4/29/2022
 * @project spring-boot-16-Configuration-Properties
 * -----
 * Khởi tạo Object để lấy các thông tin từ file application.yml
 * + Sử dụng @Component để Spring biết đây là một bean và khởi tạo nó -> ApplicationContext quản lý nó.
 * + Sử dụng @PropertySource để định nghĩa tên của file config.
 *      Nếu không có annotation này thì Spring sẽ sử dụng file mặc định
 *          classpath:application.yml trong thư mục /resource
 * + Sử dụng @ConfigurationProperties đánh dấu class bên dưới nó là properties.
 *      các thuộc tính sẽ được tự động nạp vào khi Spring khởi tạo.
 *      Spring sẽ tự tìm các hàm setter để set giá trị cho các thuộc tính này.
 *      Nên quan trọng là bạn phải tạo ra các setter method -> điều này do lombok đảm nhiệm.
 * + Ngoài ra, để chạy được tính năng này, cần kích hoạt nó bằng cách gắn
 * @EnableConfigurationProperties lên một configuration nào đó.
 *      Ở đây để cho tiện lợi thì sẽ gắn vào hàm main.
 * + Tóm lại: Khi Spring sẽ tự động bind toàn bộ giá trị từ file application.yml vào bean LodaAppProperties cho developer.
 */
@Data
@Component
/**
 * @PropertySource("classpath:loda.yml")
 * Đánh dấu để lấy config từ trong file loda.yml
 */
@ConfigurationProperties(prefix = "loda")   // Chỉ lấy các config có tiền tố là "loda"
public class LodaAppProperties {
    private String email;
    private String googleAnalyticsId;

    private List<String> authors;
    private Map<String, String> exampleMap;
    private List<Person> personList;
}
