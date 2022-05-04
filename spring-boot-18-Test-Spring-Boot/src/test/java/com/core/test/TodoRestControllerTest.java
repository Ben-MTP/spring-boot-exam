package com.core.test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.core.test.controller.TodoRestController;
import com.core.test.model.Todo;
import com.core.test.services.TodoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author ManhKM on 5/4/2022
 * @project spring-boot-18-Test-Spring-Boot
 */
@RunWith(SpringRunner.class)
@WebMvcTest(TodoRestController.class)
public class TodoRestControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private TodoService todoService;

    @Test
    public void testFindAll() throws Exception {
        // Tạo ra một List<Todo> 10 phần tử
        List<Todo> allTodos = IntStream.range(0, 10)
                .mapToObj(i -> new Todo(i, "title-" + i, "detail-" + i))
                .collect(Collectors.toList());

        // giả lập todoService trả về List mong muốn
        given(todoService.getAll()).willReturn(allTodos);

        mvc.perform(get("/api/v1/todo").contentType(MediaType.APPLICATION_JSON)) // Thực hiện GET REQUEST
                .andExpect(status().isOk()) // Mong muốn Server trả về status 200
                .andExpect(jsonPath("$", hasSize(10))) // Hi vọng server trả về List độ dài 10
                .andExpect(jsonPath("$[0].id", is(0))) // Hi vọng phần tử trả về đầu tiên có id = 0
                .andExpect(jsonPath("$[0].title", is("title-0"))) // Hi vọng phần tử trả về đầu tiên có title = "title-0"
                .andExpect(jsonPath("$[0].detail", is("detail-0")));
    }
}
