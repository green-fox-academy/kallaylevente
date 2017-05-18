package com.greenfox.repository;


import com.greenfox.model.ChatUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ChatUser, Integer> {



}
