package ca.srikar.lab3.repository;

import ca.srikar.lab3.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
