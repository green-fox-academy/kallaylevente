package com.greenfox;

import com.greenfox.Model.Todo;
import com.greenfox.Repos.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

  private ToDoRepository toDoRepository;

  @Autowired
  public ToDoService(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  public Iterable<Todo> list() {
    return toDoRepository.findAll();
  }

  public Iterable<Todo> sort() {
    return toDoRepository.findAllByActiveFalse();
  }

}
