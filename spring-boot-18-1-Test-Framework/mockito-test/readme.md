## Hướng dẫn toàn tập Mockito

## 1. Yêu cầu


## 2. Giới thiệu
    + Về cơ bản, UnitTest là phương pháp tiếp cận độc lập, tức là mỗi chức năng sẽ được đi kèm với một hoặc nhiều bài test.
    Để chắc chắn cái chức năng đó hoạt động ổn. Vậy nên Unit Test thường là đơn vị nhỏ nhất để test và các test-case cũng dễ dạng khởi tạo.

    + Bài toán mở rộng hơn, khi chúng ta phải test sự hoạt động phối hợp giữa nhiều chức năng hay thành phần với nhau.
    Hoặc muốn test một chức năng lớn thì sẽ trở nên phức tạp và khó xây dựng hơn nhiều.

    + Các kịch bản thường diễn ra:
    Chức năng A gọi tới chức năng B, tuy nhiên chức năng B chưa viết xong.
    Chức năng A gọi tới chức năng B, tuy nhiên B khởi tạo rất phức tạp(truy xuất Database, yêu cầu nhiều Paramter...).
    Muốn test chức năng A, tuy nhiên A yêu cầu nỗ lực lớn của cả hệ thống lớn (yêu cầu HTTP-Server, authorize...).

    + Nhiều kịch bản phức tạp xảy ra, mà thực tế chúng ta chỉ mong muốn confirm rằng A ổn, chứ thằng B,C,D gì đó cứ tạm coi là "đã ổn".
    Để đơn giản hóa các kịch bản test như trên, khái niệm Mock ra đời.
    
    + Tư tưởng của Mock đơn giản là muốn test (A gọi B) thì thay vì tạo ra một đối tượng B thực sự, bản tạo ra một thằng B'
    giả mạo, có đầy đủ chức năng như B thật (nhưng không phải thật).
    
    + Bản sẽ giả lập cho B' biết là khi thằng A gọi tới nó, nó cần làm gì?, trả lại gì (hardcode).
    Miễn là sao cho nó trả ra đúng cái thằng A cần đề chúng ta có thể test A thuận lợi nhất.

    + Trong Java thì Mockito chính là thư viện nổi tiếng nhất có thể làm việc này.
## 3. Cài đặt



## 4. Cách Mock


### Cách 1: Mockito.mock()


### Cách 2: Sử dụng @Mock


## 5. Cách sử dụng


## 6. Spy



## 7. Captor


## 8. Inject Mock


