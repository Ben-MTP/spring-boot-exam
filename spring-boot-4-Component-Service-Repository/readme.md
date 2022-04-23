## Nếu không có @Service -> GirlService
    Cũng chỉ là một class Java bình thường.
    No qualifying bean of type 'com.component.service.impl.GirlService' available


## Nếu không có @Autowired in GirlService.java
    Thì sẽ không thể inject một Repository vào trong Service.

	@Service -> gắn cho các Bean đảm bảo nhiệm vụ logic.
	@Repository -> gắn cho các Bean đảm bảo nhiệm vụ giao tiếp với Database.
	@Component -> gắn cho các Bean khác -> đảm bảo nhiệm vụ logic khác.

## Reference Document

	
	