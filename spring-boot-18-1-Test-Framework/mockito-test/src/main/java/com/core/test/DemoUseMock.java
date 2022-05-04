package com.core.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

/**
 * @author ManhKM on 5/2/2022
 * @project mockito-test
 */
@RunWith(MockitoJUnitRunner.class)
public class DemoUseMock {

    @Mock
    List<String> mockedList;
}
