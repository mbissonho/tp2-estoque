package com.tp2.estoque;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
plugin = {"pretty","html:target/cucumber"}
)
public class SaldoMinimoIntegrationTest {

}
