## Nội dung bài học
	1. Giới thiệu chung
	   Yêu cầu chi tiết, phải biết cơ bản về Bean và các inject nó trong Spring Boot.
	   Cách inject nó bằng @Component và @Autowired. 
	2. Cài đặt

	3. Tìm hiểu về PostConstructor
	   Nó là một Annotation để đánh dấu cho Method đó sẽ chạy trước khi sau constructor.

	4. Tìm hiểu về Predestroy
	   Nó sẽ chạy trước khi đối tượng đó bị phá hủy

	5. Tìm hiểu về BeanLifeCycle
	   

	6. Ví dụ thực tế
	   Nhiệm vụ riêng như Setting, thêm giá trị mặc định.
	   Xóa dữ liệu trước khi destroy.

	7. Ý nghĩa

	8. Kết

## PostConstructor

## PreDestroy

## Bean Life Cycle
    Constructor -> Setter method -> ...

## Example
    Tìm tiếp ứng dụng của 2 annotation:
        + PostConstructor
        + PreDestroy
    
    The init() method @PostConstruct is called.
    After the message property is set, and the cleanUp() method -> @PreDestroy is call the context.close().


## Tham khảo:
    https://loda.me/articles/sb3-spring-bean-life-cycle-postconstruct-va-predestroy

    https://www.baeldung.com/spring-postconstruct-predestroy

    https://mkyong.com/spring/spring-postconstruct-and-predestroy-example/

    https://www.journaldev.com/21206/spring-postconstruct-predestroy

    
