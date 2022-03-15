package com.coupling.case3;

/**
 * @author ManhKM on 3/15/2022
 * @project spring-boot-0-tight-coupling-loosely-coupling
 *
 * Class VeryComplexService không cần quan tâm đến Thuật Toán nào được gọi.
 * Nó chỉ cần biết nhận vào một interface.
 * Còn việc business làm như nào sẽ là do Client quyết định.
 */
public class VeryComplexService {
    private SortAlgorithm sortAlgorithm;
    public VeryComplexService(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }

    public void complexBusiness(int[] array){
        sortAlgorithm.sort(array);
    }
}
