package com.coupling.case3;

/**
 * @author ManhKM on 3/15/2022
 * @project spring-boot-0-tight-coupling-loosely-coupling
 */
public class MainCase3 {
    public static void main(String[] args) {
        SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        SortAlgorithm quickSortAlgorithm = new QuicksortAlgorithm();

        int[] arr = {12, 13, 14};
        VeryComplexService business1 = new VeryComplexService(bubbleSortAlgorithm);
        business1.complexBusiness(arr);
        VeryComplexService business2 = new VeryComplexService(quickSortAlgorithm);
        business2.complexBusiness(arr);
    }
}
