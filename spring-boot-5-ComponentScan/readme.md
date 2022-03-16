## Default:
    Cách là Spring Boot tìm kiếm ra các Bean của nó.    
    Quét các class cùng cấp hoặc dưới cấp nó.

## ComponentScan
    Dùng với hàm main.
    Sử dụng một Annotation khác: @ComponentScan("name_package")

## Cách cài đặt
    
## Cách sử dụng @ComponentScan

## Cách sử dụng ScanBasePackages
    Sử dụng trong Annotation: @SpringBootApplication(scanBasePackage = "name_package")

## Multiple package scan


## Question:
    Câu 1: Nếu một Bean extend từ một bean mà Spring Boot không quản lý.
    Vậy khi khởi tạo nó thì có thể getBean của supper được hay không?   
        TL: Có.

