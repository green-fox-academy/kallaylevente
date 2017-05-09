package com.greenfox.Controllers;

import com.greenfox.Model.Todo;
import com.greenfox.Repos.ToDoRepository;
import com.greenfox.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  ToDoRepository toDoRepo;

  @Autowired
  ToDoService toDoService;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", toDoService.list());

    return "todolist";
  }

  @RequestMapping("/table")
  public String listTable(Model model) {
    model.addAttribute("todos", toDoRepo.findAll());
    return "table";
  }

  @RequestMapping(value = "/sort")
  public String sort(Model model,
                      @RequestParam(name = "isActive", required = false, defaultValue = "false") String description ) {
    if (description.equals("true")) {
      model.addAttribute("todos", toDoService.sort());
    } else {
      model.addAttribute("todos", toDoService.list());
    }

    return "todolist";
  }

  @RequestMapping(value = "/addTodo")
  public String addToDo(Model model) {
    return "addTodo";
  }

  @RequestMapping(value = "/addingToDo")
  public  String addingToDo(Model model, @RequestParam("newToDo") String param) {
    toDoRepo.save(new Todo(param));
    model.addAttribute("todos", toDoRepo.findAll());
    return "table";
  }


}
