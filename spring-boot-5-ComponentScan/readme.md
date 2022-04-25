## Default:
    Cách là Spring Boot tìm kiếm ra các Bean của nó như thế nào.    
    Quét các class cùng cấp hoặc dưới cấp nó.

## ComponentScan
    Trong hàm main.
        Sử dụng một Annotation khác: @ComponentScan("name_package")

## Cách cài đặt
    
## Cách sử dụng @ComponentScan

## Cách sử dụng ScanBasePackages
    Sử dụng trong Annotation: @SpringBootApplication(scanBasePackage = "name_package")

## Multiple package scan
    Làm thế nào để quyest nhiều package cùng một lúc, chứ không phải chỉ 1 package thôi.
    @ComponentScan({"me.loda.spring.componentscan.others2","me.loda.spring.componentscan.others"})
    Hoặc:
    @SpringBootApplication(scanBasePackages = {"me.loda.spring.componentscan.others", "me.loda.spring.componentscan.others2"})


## Question:
    Câu 1: Nếu một Bean extend từ một bean mà Spring Boot không quản lý.
    Vậy khi khởi tạo nó thì có thể getBean của supper được hay không?   
        TL: Có.

    Câu 2: Có bao nhiêu cách quản lý Bean?
    Java Code, xml code.
    
    Câu 3: Đánh dấu class là một Component
                -> Định nghĩa là một Bean và cần ApplicationContext quản lý ngay.
                -> Bean -> vòng đời của Bean.
                -> Vòng đời của một Bean từ khi khởi tạo đến khi kết thúc.
           Đánh dấu class đó là một Configuration
                -> định nghĩa ra các Bean bên trong
            