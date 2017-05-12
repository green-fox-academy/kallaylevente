package com.greenfox.logentrie;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long iD;

  private LocalDateTime createdAt ;
  private String endpoint;
  private String data;

}
