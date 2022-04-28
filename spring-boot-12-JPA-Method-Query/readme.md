## Giới thiệu Spring JPA, Method query
    Trên thực tế, các câu lệnh sql, create, query, update, delete không chỉ có các điểu kiện basic.
    Mà nó còn nhiều các vấn đề khác như join, where nhiều điểu kiện.
    Vậy nên có một số yêu cầu nằm ngoài các method JPA hỗ trợ sẵn.
    Lúc này cần phải tự tạo ra câu lệnh query của riêng business.
    
## Query Creation
    Trong Spring JPA, có một cơ chế giúp tạo ra các câu lệnh Query mà không cần phải viết thêm code.
    Cơ chế này xây dựng Query từ tên của method.

## Quy tắc đặt trên method trong Spring JPA
    Trong Spring JPA, cơ chết xây dựng truy vấn thông qua tên của method được quy định bởi các tiền tố.
    find...By, read...By, query...By, count...By, get...By.
    Phần còn lại sẽ được parse theo tên của các thuộc tính, viết hoa chữ cái đầu.
    Nếu chúng ta có điều kiện, thì các thuộc tính có thể kết hợp với nhau bằng And hoặc Or.
    
    Nếu trong person.address.zipCode.
    findByAddressZipCode(ZipCode zipCode)
    
## @Query
    Nếu thực sự khó tiếp cận với cách thông qua tên method kiểu Spring Data JPA.
    Với cách sử dụng @Query, có thể sử dụng câu truy vấn JPQL (Hibernate) hoặc raw SQL.

    
## Tạo Database

## Cấu hình Spring

## Tạo Model và Repository

## Chạy thử chương trình

## Output chương trình

## Reference Document

