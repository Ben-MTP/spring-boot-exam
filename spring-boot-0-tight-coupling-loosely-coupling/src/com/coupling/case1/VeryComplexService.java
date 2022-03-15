package com.coupling.case1;

/**
 * @author ManhKM on 3/15/2022
 * @project spring-boot-0-tight-coupling-loosely-coupling
 * Nhưng nếu có yêu cầu thay đổi code, chỉnh sửa nghiệp vụ logic.
 * Thì phải sửa cả 2 class -> bất tiện.
 *
 * 1. BuubbleSortAlgorithm chỉ tồn tại khi VeryComplexService tồn tại.
 * 2. Hay nói cách khác: Sự sống/chết của BublleSortAlgorithm sẽ so VeryComplexService thực hiện.
 */
public class VeryComplexService {
    private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

    public VeryComplexService(){

    }

    public void complexBusiness(int[] array){
        System.out.println("Sort in VeryComplexService");
        bubbleSortAlgorithm.sort(array);
    }
}
