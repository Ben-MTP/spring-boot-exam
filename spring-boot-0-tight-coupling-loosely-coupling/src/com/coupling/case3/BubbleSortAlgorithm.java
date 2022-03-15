package com.coupling.case3;

/**
 * @author ManhKM on 3/15/2022
 * @project spring-boot-0-tight-coupling-loosely-coupling
 */
public class BubbleSortAlgorithm implements SortAlgorithm{
    @Override
    public void sort(int[] array) {
        System.out.println("Sorted by BubbleSortAlgorithm");
    }
}
