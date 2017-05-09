package com.greenfox;

import com.greenfox.Model.Todo;
import com.greenfox.Repos.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlExerciseApplication implements CommandLineRunner {

	@Autowired
	ToDoRepository toDoRepo;

	public static void main(String[] args) {
		SpringApplication.run(SqlExerciseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*toDoRepo.save(new Todo("I have to learn Object Relational Mapping"));
		toDoRepo.save(new Todo("I have to learn MySQL"));
		toDoRepo.save(new Todo("I have to learn CrudeRepo"));
		toDoRepo.save(new Todo("I have to learn to learn"));*/
	}
}
