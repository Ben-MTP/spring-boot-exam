package com.coupling.case1;

/**
 * @author ManhKM on 3/15/2022
 * @project spring-boot-0-tight-coupling-loosely-coupling
 */
public class MainCase1 {
    public static void main(String[] args) {
        VeryComplexService veryComplexService = new VeryComplexService();
        int[] array = {12, 13, 14};
        veryComplexService.complexBusiness(array);
    }
}
