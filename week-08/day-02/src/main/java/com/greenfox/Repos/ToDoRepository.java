package com.greenfox.Repos;


import com.greenfox.Model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;



public interface ToDoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByTitle(String title);

  List<Todo> findAllByActiveTrue();

  List<Todo> findAllByUrgentTrue();

  List<Todo> findAllByActiveTrueAndUrgentTrue();






}
