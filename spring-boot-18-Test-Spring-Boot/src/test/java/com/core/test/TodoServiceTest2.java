package com.core.test;

import com.core.test.model.Todo;
import com.core.test.repository.TodoRepository;
import com.core.test.services.TodoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author ManhKM on 5/4/2022
 * @project spring-boot-18-Test-Spring-Boot
 */
@RunWith(SpringRunner.class)
public class TodoServiceTest2 {

    @TestConfiguration
    public static class TodoServiceTest2Configuration{

        @Bean
        TodoService todoService(){
            return new TodoService();
        }
    }

    @MockBean
    TodoRepository todoRepository;

    @Autowired
    private TodoService todoService;

    @Before
    public void setUp(){
        Mockito.when(todoRepository.findAll()).thenReturn(IntStream.range(0, 10)
                .mapToObj(i -> new Todo(i, "title-"+i, "detail-"+i))
                .collect(Collectors.toList()));
    }

    @Test
    public void testCount(){
        Assert.assertEquals(10, todoService.countTodo());
    }
}
