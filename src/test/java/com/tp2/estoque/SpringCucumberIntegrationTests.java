package com.tp2.estoque;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Ignore
public class SpringCucumberIntegrationTests {

	protected RestTemplate restTemplate = new RestTemplate();

    protected final String DEFAULT_URL = "http://localhost:8080/";
	
}
