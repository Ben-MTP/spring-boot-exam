package com.manhkm.service;

import com.manhkm.model.Todo;
import com.manhkm.model.TodoValidator;
import com.manhkm.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 * -----
 * Tầng Service, chịu trách nhiệm thực hiện các xử lý logic, business, hỗ trợ cho tầng Controller.
 */
@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private TodoValidator validator;

    /**
     * Thực hiện logic lấy ra danh sách List Todo.
     * limit -> Giới hạn số lượng lấy ra.
     * Trả về List Todo -> danh sách theo limit.
     *      Nếu limit == null -> findAll.
     */
    public List<Todo> findAll(Integer limit) {
        return Optional.ofNullable(limit)
                .map(value -> todoRepository.findAll(PageRequest.of(0, value)).getContent())
                .orElseGet(() -> todoRepository.findAll());
    }

    /**
     * Thêm một Todo mới vào danh sách công việc cần làm.
     * Trả về đối tượng Todo sau khi lưu vào Database.
     * Và trả về null nếu không thành công.
     */
    public Todo add(Todo todo) {
        if (validator.isValid(todo)) {
            return todoRepository.save(todo);
        }
        return null;
    }
}
