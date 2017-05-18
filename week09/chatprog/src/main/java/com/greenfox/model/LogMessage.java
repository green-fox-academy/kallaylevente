package com.greenfox.model;

import java.time.LocalDateTime;

public class LogMessage {

  private String creationTime;
  private String path;
  private String method;
  private String logLevel;
  private String text;


  public LogMessage(String path, String method) {
    this.path = path;
    this.method = method;
    this.creationTime = LocalDateTime.now().toString();
  }

  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public void printOut() {
    String vari = System.getenv("CHAT_APP_LOGLEVEL");
    if (vari.equals("INFO")) {
      System.out
          .println(creationTime + " INFO Request " + path + " " + method + " ----------"
              + "------------------------------------------------------------------------------------------------"
              + "------------------------------------------------------------------------------------------");

    }
  }
}
