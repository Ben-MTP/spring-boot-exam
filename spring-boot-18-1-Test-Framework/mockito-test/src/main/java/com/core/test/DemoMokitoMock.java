package com.core.test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

/**
 * @author ManhKM on 5/2/2022
 * @project mockito-test
 * -----
 * Thực hành cách sử dụng Mockito.mock().
 * Làm sao để tạo ra một đối tượng
 */
public class DemoMokitoMock {

    @Test
    public void testUserMockFuntion(){
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.size()).thenReturn(2);

        Assert.assertEquals(2, mockList.size());
    }
}
