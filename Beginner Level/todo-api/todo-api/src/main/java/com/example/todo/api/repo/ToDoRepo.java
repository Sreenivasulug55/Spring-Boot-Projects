package com.example.todo.api.repo;

import com.example.todo.api.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepo extends JpaRepository<Todo, Long> {
}
