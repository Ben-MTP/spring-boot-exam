package com.core.test.services;

import com.core.test.model.Todo;
import com.core.test.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ManhKM on 5/4/2022
 * @project spring-boot-18-Test-Spring-Boot
 */
@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    /**
     * Trả về danh sách hiện có.
     */
    public int countTodo(){
        return todoRepository.findAll().size();
    }

    /**
     * Trả về một đối tượng Todo theo id tương ứng.
     */
    public Todo getTodo(int id){
        return todoRepository.findById(id);
    }

    /**
     * Trả về tất cả danh sách đang có trong Repository
     */
    public List<Todo> getAll(){
        return todoRepository.findAll();
    }
}
