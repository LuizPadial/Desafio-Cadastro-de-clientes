package br.com.DesafioCadastro.demo.services;
import br.com.DesafioCadastro.demo.entities.Todo;
import br.com.DesafioCadastro.demo.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> list() {
       Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
        todoRepository.findAll(sort);
        return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
       return list();
    }

    // Método para buscar por ID
    public Todo findById(Long id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo não encontrado com o ID: " + id));
    }


}
