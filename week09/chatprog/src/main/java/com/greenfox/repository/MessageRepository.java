package com.greenfox.repository;


import com.greenfox.model.ChatMessage;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepository extends CrudRepository<ChatMessage, Long>{
  List<ChatMessage> findAllByOrderByTimestamp();
}
