package spring.cloud.contract;

import application.Application;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = Application.class)
public abstract class ContractVerifierBase {

  @Autowired
  protected WebApplicationContext webApplicationContext;

  @Before
  public void setup() {
    RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
  }
}
