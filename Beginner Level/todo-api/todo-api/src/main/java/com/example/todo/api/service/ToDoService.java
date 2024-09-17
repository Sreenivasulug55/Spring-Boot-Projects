package com.example.todo.api.service;

import com.example.todo.api.entities.Todo;
import com.example.todo.api.repo.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ToDoService {
    @Autowired
    private ToDoRepo toDoRepo;

    public List<Todo> getAllToDos() {
        return toDoRepo.findAll();
    }

    public Todo addTask(Todo todo) {
        return toDoRepo.save(todo);
    }

    public String updateTask(Todo todo) {
        Optional<Todo> optionalTodoToDo = toDoRepo.findById(todo.getId());
        if (optionalTodoToDo.isPresent()) {
            var existingToDo = optionalTodoToDo.get();
            existingToDo.setId(todo.getId());
            existingToDo.setDiscription(todo.getDiscription());
            existingToDo.setDueDate(todo.getDueDate());
            existingToDo.setStatus(todo.isStatus());
            existingToDo.setPriority(todo.getPriority());
            toDoRepo.save(existingToDo);
            return "Task Update";

        } else {
            return "Task Not Found With Task With ID";
        }

    }

    public void deleteById(long id) {
        toDoRepo.deleteById(id);
    }


}
