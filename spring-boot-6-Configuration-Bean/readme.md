## Nội dung chính

## Giới thiệu chung
    1. @Configuration and @Bean là một trong những Annotation chính nằm trong chuỗi các Annotation quan trọng trong Spring Boot.
    2. Học được 2 Annotation này giúp cho việc tạo bean không chỉ phụ thuộc vào @Component nữa.
    3. Nếu việc tạo bean cần có logic và business riêng thì @Configuration là một sự lựa chọn đang hay nhất.

## Cách cài đặt
    1. Vẫn chỉ sử dụng gói thư viện spring-boot-starter_web

## @Configuration và @Bean
    1. @Annotation @Configuration chỉ ra đây là class dùng cho việc tạo các Bean.
    2. Khi Spring Context chạy -> ngoài việc load các @Component, @Service, @Repository ra thì việc load @Configuration rất quan trọng.
    3. @Configuration -> đặt trước class.
    4. @Bean -> đặt trước method -> chỉ ra đây là method tạo bean.
    5. Method -> phải có kiểu trả về các danh sách các tham số.
    6. Kiểu trả về phải là kiểu giá trị của bean.
    7. Danh sách tham số -> nến là bean thì sẽ được Spring Container tự đưa vào.

    
    
## Có ý nghĩa gì?

## Method tạo bean có tham số

## Thực tế

## Kết luận

