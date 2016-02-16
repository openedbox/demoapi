package demoapi.module.order;

import demoapi.AbstractWebIntegrationTest;
import org.junit.Test;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class ControllerTest extends AbstractWebIntegrationTest {

    @Test
    public void gettingGreetingMessageCorrectly() throws Exception {
        mvc.perform(get("/orders")).
                andDo(MockMvcResultHandlers.print()).
                andExpect(status().isOk()).
                andExpect(jsonPath("$").isArray());
    }
}