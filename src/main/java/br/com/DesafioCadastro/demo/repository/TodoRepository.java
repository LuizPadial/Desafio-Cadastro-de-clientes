package br.com.DesafioCadastro.demo.repository;
import br.com.DesafioCadastro.demo.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
