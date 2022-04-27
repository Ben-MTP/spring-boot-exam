## Spring Boot 10 - RequestMapping + PostMapping + ModelAttribute + RequestParam + WebTo-Do Thymeleaf
    Cách handle request POST của Spring Boot.
    
## Giới thiệu PostMapping
    Mục đích: Đánh dấu hàm xử lý POST request trong Controller.
    GET/POST/DELETE/PUT
    + method có chung đường dẫn path -> nhưng khác nhau về method thì sẽ khác nhau.


## Giới thiệu RequestMapping
    Mục đích: Trong trường hợp muốn tất cả các method đều dùng chung một cách xử lý thì có thể sử dụng RequestMapping.

    @RequestMapping là một annotation có ý nghĩa và mục đích sử dụng rộng hơn các loại: @GetMapping, @PostMapping...
    @RequestMapping -> sẽ có 2 thuộc tính: value | method
        Nếu không chỉ định rõ method cho @RequestMapping thì nó sẽ nhận toàn bộ các method.
        

## Website to-do
    Build WebApp quản lý công việc -> hiểu cách gửi dữ liệu lên Server thông qua 2 method GET, POST.

## Cài đặt


## Tạo model
    Chính là tạo Todo -> một Java Object đại diện cho công việc cần làm.

## GET /listTodo -> lấy danh sách các việc cần làm
    Việc lấy ra -> sử dụng method Get.
    Trả về đối tượng todoList
    Nếu người dùng gửi param limit thì trả về sublist của todoList.
        subList(0,limit) -> một tập con của List bắt đầu từ 0 đến limit.

## GET /addTodo -> Trang thêm công việc


## POST /addTodo -> Thêm công việc vào list


## Chạy chương trình.
    Note: Trong Themeleaf nó là một Java Template.
        Nên vẫn hoàn toàn có thể dùng các method để thay thế cho thuộc tính
        dùng: setter/getter để thay thế cho các giá trị file trong Object.