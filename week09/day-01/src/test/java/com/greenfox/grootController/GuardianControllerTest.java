package com.greenfox.grootController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.hamcrest.Matchers.is;

import com.greenfox.Week9day1Application;
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
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Week9day1Application.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

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
  public void testSuccesfullGetGroot() throws Exception {
    mockMvc.perform(get("/groot?message=somemessage"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("somemessage")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));




    /*.andExpect(content().contentType(contentType))
        .andExpect(content()
            .json("{\"received\": \"somemessage\", \"translated\": \"I am Groot!\"}", true));*/
  }

  @Test
  public void testGetGrootWithoutPathVariable() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().is4xxClientError())
        .andExpect(content().contentType(contentType))
        .andExpect(content()
        .json("{\"error\": \"I am Groot!\"}", true));
  }


}