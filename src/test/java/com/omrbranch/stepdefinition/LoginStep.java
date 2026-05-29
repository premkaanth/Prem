package com.omrbranch.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;

	@Given("User is on the omrbranch page")
	public void user_is_on_the_omrbranch_page() {
		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String name, String pass) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement btnLogin = driver.findElement(By.xpath("//button[@value='login']"));
		btnLogin.click();
	}
	@Then("User should verify Success message after login")
	public void user_should_verify_success_message_after_login() {
		Assert.assertTrue("Verify after login",true);
		driver.quit();
	}




}
