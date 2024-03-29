package fr.cailliaud.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class VoitureIT {

  @Autowired MockMvc mockMvc;

  @Test
  void test() throws Exception {
    mockMvc
        .perform(get("/api/voitures/iefhoazehzpo/disponiblite"))
        .andExpect(status().isNotFound());
  }
}
