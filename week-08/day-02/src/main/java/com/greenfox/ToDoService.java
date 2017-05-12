package com.greenfox;

import com.greenfox.Model.Todo;
import com.greenfox.Repos.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

  @Autowired
  ToDoRepository toDoRepository;


  public ToDoService(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  public Iterable<Todo> list() {
    return toDoRepository.findAll();
  }

  public Iterable<Todo> sort() {
    return toDoRepository.findAllByActiveTrue();
  }

  public Iterable<Todo> sortByUrgent() {
    return toDoRepository.findAllByUrgentTrue();
  }

  public Iterable<Todo> sortByUrgentAndActive() {
    return toDoRepository.findAllByActiveTrueAndUrgentTrue();
  }

}
