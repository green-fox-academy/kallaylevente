package com.greenfox.controller;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.greenfox.Chat3rdtimeApplication;
import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Chat3rdtimeApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class MainRestControllerTest {

  private String requestString = "{\n"
      + "  \"message\": {\n"
      + "    \"id\": 7655482,\n"
      + "    \"username\": \"EggDice\",\n"
      + "    \"text\": \"How you doin'?\",\n"
      + "    \"timestamp\": 1322018752992\n"
      + "  },\n"
      + "  \"client\": {\n"
      + "    \"id\": \"EggDice\"\n"
      + "  }\n"
      + "}";

  private String requestIsOkString = "{\n"
      + "  \"status\": \"ok\"\n"
      + "}";

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testSucsessfullReceiveMessage() throws Exception{
    mockMvc.perform(post("/api/message/receive")
        .contentType(MediaType.APPLICATION_JSON)
    .content(requestString))
    .andExpect(status().isOk())
    .andExpect(content().json(requestIsOkString));
  }

  @Test
  public void testMissingBodyParameterOnGettingMessage() throws Exception {
    mockMvc.perform(post("/api/message/receive")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\n"
            + "  \"message\": {\n"
            + "    \"id\": 7655482,\n"
            + "    \"text\": \"How you doin'?\",\n"
            + "    \"timestamp\": 1322018752992\n"
            + "  },\n"
            + "  \"client\": {\n"
            + "    \"id\": \"EggDice\"\n"
            + "  }\n"
            + "}"))
        .andExpect(status().is4xxClientError())
        .andExpect(content().json("{\n"
            + "  \"status\": \"error\",\n"
            + "  \"message\": \"Missing field(s): message.chatUserName, \"\n"
            + "}"));
  }

}
