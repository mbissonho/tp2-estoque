package com.tp2.estoque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends SpringCucumberIntegrationTests {

	private WebDriver firefoxDriver;
	
	@Before
	public void setUp() {
		BeforeSetupHelper.setUpFirefoxDriver();
		this.firefoxDriver = BeforeSetupHelper.getFirefoxWebdriver();
	}
	
	@Given("o auxiliar de compras acessa a {string} de listagem de produtos")
	public void o_auxiliar_de_compras_acessa_a_de_listagem_de_produtos(String url) {
	    this.firefoxDriver.get(url);
	}

	@When("chamar a funcionalidade de {string}")
	public void chamar_a_funcionalidade_de(String btnId) {
	   WebElement element = firefoxDriver.findElement(By.id(btnId));
	   element.click();
	}

	@Then("é retornado a listagem com os produtos com o saldo mínimo")
	public void é_retornado_a_listagem_com_os_produtos_com_o_saldo_mínimo() {
	    WebElement idTd = firefoxDriver.findElement(By.cssSelector("tbody tr td:first-of-type"));
	    assertEquals("3", idTd.getText());
	}
	
	@After
	public void closeDriver(){
		this.firefoxDriver.close();
	}
	
}
