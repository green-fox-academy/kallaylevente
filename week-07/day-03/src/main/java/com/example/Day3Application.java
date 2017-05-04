package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day3Application implements CommandLineRunner {

  @Autowired
  HelloWorld hella;

	public static void main(String[] args) {
	  SpringApplication.run(Day3Application.class, args);
	}

 @Override
  public void run(String... args) throws Exception {
    hella.setMessage("Hello world");
    hella.getMessage();
  }
}
