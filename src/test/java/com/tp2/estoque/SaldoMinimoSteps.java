package com.tp2.estoque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaldoMinimoSteps extends SpringCucumberContextLoader {

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
	
	@When("selecionar a margem {string}")
	public void selecionar_a_margem(String margem) {
	    Select selectMargens = new Select(this.firefoxDriver.findElement(By.id("margens")));
	    selectMargens.selectByVisibleText(margem);
	}
	
	@When("selecionar o fabricante {string}")
	public void selecionar_o_fabricante(String fornecedor) {
	    Select selectFabricante = new Select(this.firefoxDriver.findElement(By.id("fabricantes")));
	    selectFabricante.selectByVisibleText(fornecedor);
	}
	
	@When("selecionar a categoria {string}")
	public void selecionar_a_categoria(String categoria) {
	    Select selectCat = new Select(this.firefoxDriver.findElement(By.id("categorias")));
	    selectCat.selectByVisibleText(categoria);
	}
	
	@When("chamar a funcionalidade de {string}")
	public void chamar_a_funcionalidade_de(String btnId) {
	   WebElement element = firefoxDriver.findElement(By.id(btnId));
	   element.click();
	}

	@Then("é retornado a listagem com os produtos com o saldo mínimo")
	public void é_retornado_a_listagem_com_os_produtos_com_o_saldo_mínimo() {
	    
	}
		
	@Then("é retornado a listagem com os produtos com o saldo mínimo que na linha {string} e coluna {string} tem {string}")
	public void é_retornado_a_listagem_com_os_produtos_com_o_saldo_mínimo_que_na_linha_e_coluna_tem(String linha, String coluna, String valor) {
		WebElement td = firefoxDriver.findElement(By.cssSelector("tbody tr:nth-of-type(" + linha + ") td:nth-of-type(" + coluna + ")"));	    
	    assertEquals(valor, td.getText());
	}
	
	@After
	public void closeDriver(){
		this.firefoxDriver.close();
	}
	
}
