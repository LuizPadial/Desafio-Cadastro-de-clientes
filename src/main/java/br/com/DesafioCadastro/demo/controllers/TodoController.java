package br.com.DesafioCadastro.demo.controllers;

import br.com.DesafioCadastro.demo.entities.Todo;
import br.com.DesafioCadastro.demo.services.TodoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo){
       return todoService.create(todo);
    }
    @GetMapping
    List<Todo> list() {
        return todoService.list();

    }
    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);

    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);

    }

    // Endpoint para buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Long id) {
        Todo todo = todoService.findById(id);
        return ResponseEntity.ok(todo);
    }

}
