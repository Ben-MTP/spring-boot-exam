## Giới thiệu
    Hiện tại xu hướng hiện nay là sẽ để các frontend framework take care nhiều thứ hơn.
    Còn ở phía server chỉ nên cung cấp API cho front-end framework là đủ.
    Spring Boot thì lại quá mạnh cho việc tạo Restful API rồi.

## @RestController
    Khác với @Controller là sẽ trả về một template dạng abc.html
    @RestController trả về dữ liệu dạng JSON.
    
    + Các đối tượng trả về dạng Object sẽ được Spring Boot chuyển thành dạng JSON.
    + Các đối tượng trả về rất đa dạng, có thể trả về List, Map... Spring Boot cũng sẽ convert chúng hết thành dạng JSON.
    mặc định sẽ dùng Jackson converter để làm điều đó.

    + Nếu muốn API tùy biến được kiểu dữ liệu trả về, sử dụng ResponseEntity của Spring cung cấp.
    Đây là đối tượng chả của mọi đối tượng và sẽ wrapper các object trả về.

## @RequestBody
    Vì giời xây dựng API, nên các thông tin từ phía Client gửi lên Server sẽ nằm trong body, và cũng ở dạng JSON luôn.
    + Spring sẽ làm giúp việc năng nhọc làm thế nào chuỗi JSON trong request thành một Object Java.
    Bạn chỉ cần cho nó biết cần chuyển JSON thành Object nào bằng cách sử dụng Annotation: @RequestBody.


## PathVariable
    RESTful API là một tiêu chuẩn dùng trong việc thiết kế các API cho các ứng dụng web để quản lý các resource.
    Và theo cách này thì sẽ có một phần thông tin quan trọng sẽ nằm ngay trong chính URL của api.
        + url tạo todo -> HTTP method POST
        + url lấy thông tin todo /12 -> HTTP method GET
        + url sửa thông tin todo /12 -> HTTP method PUT
        + URL xóa todo /12 -> HTTP method DELETE.
    Ngoài thông tin trong Body của Request.
        + Cần phải tham chiếu đến số /12...
        @PathVariable tham chiến -> lúc này mới cần đến sự hiện diện của @PatVariable.
    

## Cài đặt


## Tạo model


## Tạo RestController


## Chạy thử


## Tạo ra một đối tượng To-do


## Xem danh sách To-do


## Sửa To-do


## Lấy thông tin To-do


## Xóa To-do


## Reference document
    https://loda.netlify.app/spring-boot-14-restful-api-rest-controller-path-variable-request-body-loda1558775921707/

## Question:
    Câu 1:
    @RestController trả về mặc định kiểu JSON.
    Vậy nó có trả về được kiểu SOAP/XML hay không?
    
    Câu 2: Có thể convert cùng một model để qua cho kiểu này được hay không?
        Hay là phải tạo template request, response trước và add thêm các giá trị value vào.
        JSON, XML hay chỉ coi là nó một kiểu định dạng dữ liêu.

    Câu 3: Khi người dùng xóa, không thể xóa dễ dàng như vậy được, để xóa thì cần phải có token các thứ.
        Phần đó sẽ xử lý như nào.
        Cần xác thực cả phía người dùng nữa.