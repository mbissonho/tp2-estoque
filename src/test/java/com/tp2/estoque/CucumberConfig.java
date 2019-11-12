package com.tp2.estoque;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = {"pretty"}, snippets = SnippetType.UNDERSCORE)
public class CucumberConfig {

}
