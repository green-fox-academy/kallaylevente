package com.greenfox.Controllers;

import com.greenfox.Model.Todo;
import com.greenfox.Repos.ToDoRepository;
import com.greenfox.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  ToDoRepository toDoRepo;

  @Autowired
  ToDoService toDoService;

  @RequestMapping(value = {"", "/list"})
  public String list(Model model) {
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

  @PostMapping(value = "/addingToDo")
  public  String addingToDo(Model model, @RequestParam("newToDo") String param) {
    toDoRepo.save(new Todo(param));
    model.addAttribute("todos", toDoRepo.findAll());
    return "table";
  }

  @RequestMapping(value = "/delete/{id}")
  public String delete(Model model,
                      @PathVariable("id") String id ){
    long longDeletID = Long.parseLong(id);
    toDoRepo.delete(longDeletID);
    model.addAttribute("todos", toDoRepo.findAll());
    return "redirect:/todo/list";
  }

  @RequestMapping(value = "/edit/{id}")
  public String edit(Model model,
                          @PathVariable("id") String id ) {
    long longID = Long.parseLong(id);
    model.addAttribute("todos", toDoRepo.findOne(longID));
    return "edit";
  }

  @RequestMapping(value = "/editToDo/{id}")
  public String editToDo(Model model,
                          @RequestParam("newTitle") String title,
                          @RequestParam(name = "active", required = false) String active,
                          @RequestParam(name = "urgent", required = false) String urgent,
                          @PathVariable("id") String id) {
    long longID = Long.parseLong(id);
    toDoRepo.findOne(longID).setTitle(title);
    System.out.println(title);
    model.addAttribute("todos", toDoRepo.findAll());
    return "table";
  }

}
