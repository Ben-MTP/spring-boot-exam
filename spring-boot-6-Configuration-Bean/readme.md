## Nội dung chính
    @Controller
    @Component
    @Service + @Repository
    @Configuration + @Bean
## Giới thiệu chung
    1. @Configuration and @Bean là một trong những Annotation chính nằm trong chuỗi các Annotation quan trọng trong Spring Boot.
    2. Học được 2 Annotation này giúp cho việc tạo bean không chỉ phụ thuộc vào @Component nữa.
    3. Nếu việc tạo bean cần có logic và business riêng thì @Configuration là một sự lựa chọn đang hay nhất.

## Cách cài đặt
    1. Vẫn chỉ sử dụng gói thư viện spring-boot-starter_web
    2. Class App triển khai sẽ được đặt ở phần Test
        Nếu nó là lib-project thì chỉ cần xóa package: test là ok.

## @Configuration và @Bean
    1. @Annotation @Configuration chỉ ra đây là class dùng cho việc tạo/định nghĩa ra các Bean.
    2. Khi Spring Context chạy -> ngoài việc load các @Component, @Service, @Repository ra thì việc load @Configuration rất quan trọng.
        Configuration sẽ được loading đầu tiên khi project chạy.

    3. @Configuration -> đặt trước class.
        Cho phép SpringBoot biết được đây là nơi định nghĩa ra các Bean.

    4. @Bean -> đặt trước method -> chỉ ra đây là method tạo bean.
        Cho phép SpringBoot biết được đây là Bean và sẽ thực hiện đưa bean này vào trong ApplicationContext để quản lý.
        Sẽ nằm trong các class có đánh dấu là @Configuration

    5. Method -> phải có kiểu trả về các danh sách các tham số.
    6. Kiểu trả về phải là kiểu giá trị của bean.
    7. Danh sách tham số -> nến là bean thì sẽ được Spring Container tự đưa vào.

## In Background
    Khi SpringBoot khởi chạy lần đầu, ngoài việc tìm các @Component thì nó còn nhiệm vụ là tìm các @Configuration.
        B1: Đi time class có đánh dấu là @Configuration
        B2: Tạo ra đối tượng từ class có đánh dấu: Configuration
        B3: Tìm các method có đánh dấu @Bean trong đối tượng vừa tạo.
        B4: Thực hiện gọi method có đánh dấu @Bean -> để lấy ra các Bean đưa vào ApplicationContext.

    
## Có ý nghĩa gì?
    @Configuration và @Bean có ý nghĩa gì khi đã có @Component.
    Sao không đánh dấu SimpleBean là @Component luôn cho nhanh?

    + Việc sử dụng @Component hoàn toàn ổn.
    + Thực tế: Nếu một Bean có quá nhiều logic để khởi tạo và cấu hình, thì sử dụng @Configuration và @Bean để tự tay tạo ra Bean.
        Việc tự tay tạo ra Bean như này có thể hiểu là phần nào đó config cho chương trình.


## Method tạo bean có tham số
    + Method được đánh dấu bởi @Bean có tham số truyền vào.
    SpringBoot tự inject các Bean đã có trong ApplicationContext vào làm tham số.
    
    + Bean làm đầu vào | Bean phức tạp dùng từ Bean khác.
        có thể đặt trong cùng một file.
        có thể đặt trong nhiều file.
        có thể đặt không theo thứ tự đầu được.
        Nó sẽ quét hết ra và quản lý tất cả chúng.


## Thực tế
    + B1: cấu hình Bean -> java code, xml file.
        VD:  beans.xml -> cấu hình các Bean -> Khai báo thread pool -> ThreadPoolTaskExecutor
        gọi Bean đó ra thông qua id.
        
    + B2: Import Resource:
        @ImportResource({ "file:config/beans.xml", "file:config/schedule-conf.xml" })
        Sẽ đọc cấu hình trong xml -> khởi tạo Bean -> đưa vào trong ApplicationContext quản lý.

## Kết luận
    + Cấu hình các Bean thông qua Configuration mang lại nhiều ưu điểm.
    + Hỗ trợ cấu hình các Bean phức tạp.
        Có tính logic.
    + Tách biệt rõ ràng các phần configuration + cũng như logic sử dụng.



## Reference Document
    [1] Spring-boot-6 @Configuration - @Bean
        https://loda.netlify.app/spring-boot-6-configuration-va-bean-loda1557885506910/


## Câu hỏi:
    Câu 1: Việc thực hiện call các method có trong class được đánh dấu: @Configuration
        -> call method đánh dấu là Bean -> lấy ra các bean -> đưa vào ApplicationContext.
        Công việc này được thực hiện như nào?
        + Các giá trị Bean được đánh dấu là Object hay là gì?
            Vì: Component, Service, Repository đều là các class -> đại diện cho Object.
        
        
    Câu 2: Cách sử dụng các Bean trong file configuration này như nào?
        Cách 1: Nếu đơn giản -> thông qua việc getBean.
        Cách 2: Nếu phức tạp
            Autowire(Inject) trong quá trình sử dụng Bean trong logic business.