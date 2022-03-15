package com.coupling.case2;

/**
 * @author ManhKM on 3/15/2022
 * @project spring-boot-0-tight-coupling-loosely-coupling
 *
 * VeryComplexService chỉ quan hệ với SortAlgorithm.
 * Quan hệ với Interface.
 * Nhưng vẫn không tránh được việc khởi tạo vẫn là BubbleSort...
 */
public class VeryComplexService {
    private SortAlgorithm sortAlgorithm;

    /**
     * Khi khởi tạo sortAlgorithm sẽ mặc định
     * Khởi tạo 1 bubbleSortAlgorithm.
     */
    public VeryComplexService(){
        System.out.println("Khởi tạo đối tượng bubbleSortAl... trong khởi tạo VeryComplexService");
        sortAlgorithm = new BubbleSortAlgorithm();
    }

    /**
     * Khi đã có bubbleSortAl -> call method sort của nó.
     * @param array
     */
    public void complexBusiness(int array[]){
        System.out.println("Thực hiện call method sort khi ... đã có instance bubbleSortAl...");
        sortAlgorithm.sort(array);
    }
}
