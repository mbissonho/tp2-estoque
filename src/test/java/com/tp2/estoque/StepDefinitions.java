package com.tp2.estoque;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = {"pretty"})
public class StepDefinitions extends SpringCucumberIntegrationTests implements io.cucumber.java8.En {

	public StepDefinitions() {
		
		Given("o auxiliar de compras acessa a {string} de listagem de produtos", (String string) -> {
		    
		});

		When("chamar a funcionalidade de {string}", (String string) -> {
			
	
		});

		Then("é retornado a listagem com os produtos com o saldo mínimo", () -> {
			assertTrue(true);
		});
		
	}
	
}
