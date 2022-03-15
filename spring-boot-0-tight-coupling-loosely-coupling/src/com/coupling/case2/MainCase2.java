package com.coupling.case2;

/**
 * @author ManhKM on 3/15/2022
 * @project spring-boot-0-tight-coupling-loosely-coupling
 */
public class MainCase2 {
    public static void main(String[] args) {
        VeryComplexService veryComplexService = new VeryComplexService();
        int[] arr = {12, 13, 14};
        veryComplexService.complexBusiness(arr);
    }
}
