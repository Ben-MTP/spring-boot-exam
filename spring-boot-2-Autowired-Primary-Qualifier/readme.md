## Spring Boot Autowired - Primary - Quantity

## Dependency in file pom.xml

## Flow of Inject Bean in Spring
    + Annotation Autowired đánh dấu cho Spring biết rằng sẽ tự động inject bean tương ứng vào vị trí được đánh dấu.
    + Khi một class đánh dấu là: Component -> thì quá trình Inject Bean được tiến hành như sau
        B1: Nếu Class không có hàm Constructor hay Setter -> thì sẽ sử dụng Java Reflection.
        B2: Nếu có hàm Contructor thì sẽ Inject Bean vào bởi tham số của hàm.
        B3: Nếu có hàm Setter thì sẽ Inject Bean vào bởi tham số của hàm.

## Autowired

## Primary

## Qualifier
    + Chưa sử dụng được @Qualifier để đánh giá ưu tiên Component nào hơn.

## Example:
    1. Tìm kiếm ví dụ liên quan đến 2 Annotation: Autowired and Primary, Qualifier


## Reference Document
    https://loda.netlify.app/spring-boot-2-autowired-primary-qualifier-loda1557561089057/

