package projectStepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectStepDef {
	WebDriver driver=new ChromeDriver();
	
	@Given("I am in the login page of SauceDemo")
	public void i_am_in_the_login_page_of_sauce_demo() throws InterruptedException {
		 driver.get("https://www.saucedemo.com/");
		 System.out.println("WebSite launched");
		 Thread.sleep(2000);
	}

	@When("I enter the username and password")
	public void i_enter_the_username_and_password() {
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		    
	}

	@When("click the signin button")
	public void click_the_signin_button() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		System.out.println("Login Successful");
	}

	@When("I click on the {string} button for {string}")
	public void i_click_on_the_button_for(String string, String string2) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		System.out.println("Products Added to cart");
	}
	
	@When("I click on the {string} button Icon")
	public void i_click_on_the_button_icon(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
	}

	@When("I enter the firstName lastname and postalcode")
	public void i_enter_the_first_name_lastname_and_postalcode() throws InterruptedException {
		driver.findElement(By.id("first-name")).sendKeys("Samwi");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Kandi");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("412587");
		Thread.sleep(2000);
		
	}

	@When("click the Continue button")
	public void click_the_continue_button() throws InterruptedException {
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
	}

	@When("I click on Finish button")
	public void i_click_on_finish_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		Thread.sleep(2000);
		System.out.println("Product placed Successfully");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='logout_sidebar_link']")).click();
		System.out.println("Logout Successful");
		
		
		
		driver.close();
	}

}
