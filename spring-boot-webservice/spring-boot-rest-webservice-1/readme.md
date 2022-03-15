## Nội dung bài học

## Làm việc với Controller
    1. Phân biệt khái niệm giữa Controller và RestController

    2. RestController là cái sinh ra sau -> kế thừa lại những cái từ Controller.
    @RestController = @Controller + @ResponseBody
    @PostMapping = @RequestMapping + Method Post

    3. Trả về dữ liệu kiểu JSON

    4. Trả về dữ liệu kiểu XML

## Làm việc với MySQL
    1. Cách kết nối đến Database MySQL
        Version MySQL: 8
    

    2. config ddl-auto:
        spring.jpa.hibernate.ddl-auto = create

    
    3. tạo bảng từ Entity

# Phần 1: Hướng dẫn cơ bản

## Bài 1: Hướng dẫn tạo project Spring Boot viết webservice api
    OK


## Bài 2: Restful Api Web Service trong Spring phần 1
    OK


## Bài 3: Restful Api Web Service trogn Spring phần 2
    OK


# Phần 2: Hướng dẫn Spring Data JPA trong SPRING BOOT

## Bài 1: Spring data jpa trong spring boot phần 1
    OK


## Bài 2: Spring data jpa trong spring boot phần 2
    OK

## Bài 3: Spring data jpa trong spring boot phần 3
    OK

# Phần 3: Hướng dẫn CRUD trong Spring Boot sử dụng Restful Web Service và Spring Data JPA

## Bài 1: Một số lưu ý trước khi học


## Bài 2: Hướng dẫn thêm dữ liệu trong Spring Boot sử dụng Spring Data JPA và Restful Web Service phần 1
    1. SWAGGER Spring Boot
        Mô tả các API
    2. AJAX call API

    3. Kiến trúc 3 layer -> kiến trúc 3 tầng
        Presentation Layer 
        -> Business Logic Layer(Tầng Service) 
        -> Data Access Layer
    4. Package repository ~ dao (tầng Data Access Object -> tương tác với CSDL)
        Sử dụng JPARepository -> sử dụng thư viện của người khác.
            Kiểu class đang dùng + kiểu của khóa chính.
            Nó viết sẵn hết rồi -> học cách sử dụng.
        Custom lại JPA Repository
        
        Sử dụng từ khóa @Autowire
        
        Cơ chế Dependency Injection -> nhúng những thứ cần thiết.
        
    

## Bài 3: Hướng dẫn thêm dữ liệu trong Spring Boot sử dụng Spring Data JPA và Restful Web Service phần 2
    Thêm dữ liệu trong Spring Boot + Rest Service API

    Đằng sau của @Autowired là gồm những gì?

    


## Bài 4: Hướng dẫn thêm dữ liệu trong Spring Boot sử dụng Spring Data JPA và Restful Web Service phần 1


## Bài 5: Hướng dẫn thêm dữ liệu trong Spring Boot sử dụng Spring Data JPA và Restful Web Service phần 2


## Bài 6: Hướng dẫn xóa dữ liệu trong Spring Boot sử dụng Spring Data JPA và Restful Web Service


## Bài 7: Hướng dẫn hiển thị và phân trang trong Spring Boot sử dụng Restful Web Service với Spring Data JPA phần 1


## Bài 8: Hướng dẫn hiển thị và phân trang trong Spring Boot sử dụng Restful Web Service với Spring Data JPA phần 2


## Bài 9: Hỏi đáp Required và DefaultValue trong @RequestParam Spring Boot


## Bài 10: Tổng kết khóa học và kế hoạch tiếp














