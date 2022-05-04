## Spring Boot 17 - Chạy nhiều môi trường với Spring Profile
    Spring Profile là một core feature trong Spring Framework, cho phép chúng ta cấu hình ứng dụng active/deactive Bean tùy theo môi trường.
    Ví dụ:
        Kịch bản thực tế
        Ví dụ có ứng dụng Spring boot dùng để đọc báo, tuy nhiên phải hosting nó lên AWS.
        Vấn đề lúc này là khi đang viết code ở local thì mình cần kết nối đến MySQL tai máy tính.
        Khi đưa lên AWS thì cần kết nối đến MySQL của AWS. Ngoài ra chưa kể muốn cấu hình các biến cục bộ khác cho phù hợp
        với môi trường Log, Redis, Secret... đặt biệt là việc một số phần trong code có thể thay đổi theo môi trường.
    
    -> Spring Profile ra đời để giải quyết vấn đề này.

## Tạo file config
    Spring Profiles đã được tích hợp sẵn trong Framework rồi nên không cần phải có thêm bất kì thư viện nào khác nữa.
    Để sử dụng -> tạo file config tại thư mục resource.
        Mặc định Spring sẽ nhận các file có tên dạng như sau:
            application.properties
            application.yml
            application-{profile-name}.yml
    Ví dụ 2 môi trường: local và aws.
        application.yml         -> là file config chính khi khai báo enviroment
        application-local.yml   -> chỉ sử dụng khi chạy dưới local
        application-aws.yml     -> chỉ sử dụng khi chạy ở AWS
        application-common.yml  -> là những config dùng chung, môi trường nào cũng cần.

    Trong file application.yml mình có khai báo 2 môi trường local và aws.
    Tại mỗi môi trường sẽ include các file config như kia. Khi kích hoạt aws chẳng hạn, Spring sẽ load tất cả các config
    có trong application-common.yml và application-aws.yml. Rất tiện lợi khi sử dụng.

## Kích hoạt file config


## Cách sử dụng @Profile


## Cài đặt


## Tạo Model


## Chạy thử



## Reference Document
    https://loda.netlify.app/spring-boot-17-chay-nhieu-moi-truong-voi-spring-profile-loda1558849286501/


## Question
    Câu 1: Nếu đặt config không trong phần resource nữa
    Mà là một thư mục config ở ngoài -> cùng cấp với thư mục src/
        Thì việc config nó như nào.

