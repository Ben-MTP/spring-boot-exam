## Spring Boot 18 - Hướng dẫn chi tiết Test Spring Boot


## Vấn đề Test + Spring
    Spring Boot sẽ phải tạo ra Context và tìm các bean và nhét vào đó.
    Sau tất cả các bước config, khởi tạo thì chúng ta sử dụng @Autowired để lấy đối tượng ra để sử dụng.
    Vấn đề đầu tiên khi viết Test là sẽ làm sao @Autowired bean vào class Test được, và làm sao cho JUnit hiểu @Autowired là gì?

## @RunWith (SpringRunner.class)
    + Spring Boot thiết kế ra lớp SpringRunner -> tích hợp Spring + JUnit.
    + @RunWith(SpringRunner.class)
    + Khi chạy TodoServiceTest nó sẽ tạo ra một Context riêng để chứa Bean trong đó. 
        Lúc này có thể @Autowired thoái mái trong hàm class này.
    -> Vấn đề làm sao để đưa Bean vào trong Context.
    
    Cách 1: Sử dụng @SpringBootTest
        Giống SpringBootApplication -> tạo ra quá nhiều Bean không dùng đến.
    Cách 2: Sử dụng @TestConfiguration.
        Giống với @Configuration -> chúng tự định nghĩa ra các Bean.
        Các Bean được tạo bởi TestConfiguration chỉ tồn tại trong môi trường Test, rất phù hợp khi viết UnitTest.
        Class Test nào, cần Bean gì thì tự tạo ra trong @TestConfiguration.


## @MockBean
    Spring hỗ trợ mock với Annotation @MockBean.
    chúng ta có thể moc lấy ra Bean giả mà không cần để ý đến Bean thật.
    Kể cả thằng Thật có ở trong Context đi nữa, cũng không cần quan tâm.


## Demo

### Cài đặt


### Tạo model, Service, Repository


### Test bằng @SpringBootTest


### Test bằng @TestConfiguration


## Vấn đề Test + Spring 2


## Annotation @WebMvc Test
    

## Demo 2


### Tạo controller


### Tạo Test Controller



## Reference Document


## Question


