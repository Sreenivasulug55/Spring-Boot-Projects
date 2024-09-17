package com.example.todo.api.controllers;

import com.example.todo.api.entities.Todo;
import com.example.todo.api.service.ToDoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoCotroller {

    @Autowired
    private ToDoService toDoService;

    // GET Methods {'http://localhost:8080/todo-list'}
    @GetMapping("todo-list")
    public List<Todo> getToDoList() {
        return toDoService.getAllToDos();
    }
    

    // POST Methods  {'http://localhost:8080/add-task'}
     /*
      * {
        "id": 7,
        "discription": "Complete ToDo Mini RestAPI Project",
        "dueDate": "2024-09-17",
        "status": true,
        "priority": "High"
    }
      */
    @PostMapping("add-task")
    public Todo addTask(@RequestBody Todo todo) {
        return toDoService.addTask(todo);
    }

    //PUT Methods   {'http://localhost:8080/update-task'}
    /*
     * {
        "id": 5,
        "discription": "Update project timeline",
        "dueDate": "2024-09-17",
        "status": true,
        "priority": "Medium"
    }
     */
    @PutMapping("update-task") 
    public String updateTask(@RequestBody Todo todo) {
        return toDoService.updateTask(todo);
    }

    // DELETE Method  {'http://localhost:8080/delete-task/1'}
    @DeleteMapping("delete-task/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable long id) {
        toDoService.deleteById(id);
        return ResponseEntity.ok("delete");
    }

}
