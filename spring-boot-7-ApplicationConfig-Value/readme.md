## Nội dung
    - Không phải bao giờ thông tin kết nối cũng ở trong code.
    - Nếu được thì tốt hơn là đặt chúng ở ngoài
    - Vì nếu thay đổi môi trường, hoặc muốn đổi lại giá trị của chúng.
        Thì không phải tìm đọc trong code nữa.
    - File cấu hình mục đích là để làm vậy.

## Cài đặt
    - Vẫn sử dụng phiên bản Springboot + java 8

## application.properties
    - Đây có thẻ coi là file lưu các tham số cấu hình cho hệ thống.
    - Nếu khác tên nhưng cùng loại ".properties" thì sẽ ra sao.
    - Để gọi giá trị ngày thì có nhiều cách, có thể là nó tự load trong cấu hình.
    - Hoặc sử dụng Annotation Value để load giá trị lên.


## @Value
    - Sử dụng đối với lúc khai báo biến -> đặt với giá trị key-value trong file properties.

## Ví dụ
    - Update lại ví dụ sử dụng DatabaseConnector.

## Kết luận
    - Có thể lấy giá trị từ cấu hình để load các thứ khác.
    - Làm thế nào get giá trị từ các file properties khác.

