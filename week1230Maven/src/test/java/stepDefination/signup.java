package stepDefination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup {
	WebDriver driver;

/*@Given("user is at signuppage")
public void user_is_at_signuppage() {
	 driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://automationexercise.com/login");

    
}

@When("user  enter the name and email")
public void user_enter_the_name_and_email() {
    driver.findElement(By.name("name")).sendKeys("harry");
	  driver.findElement(By.name("email")).sendKeys("harry@gmail.com");
}

    


@When("click on signup Button")
public void click_on_signup_button() {
	 driver.findElement(By.xpath("//button[.='Signup']")).click();
  
}

@Then("user navigate to the information page")
public void user_navigate_to_the_information_page() {
	String act = driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
	String exp="ENTER ACCOUNT INFORMATION";
   assertEquals(act, exp);
   

    
}


}*/
//Scenario outline
@Given("user naviagte to the signup page")
public void user_naviagte_to_the_signup_page() {
	  driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://automationexercise.com/login");
}


@When("user input the (.)and(.)$")
public void user_input_the_fullname_and_emailid(String name,String mail) {
	driver.findElement(By.name("name")).sendKeys(name);
	  driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys(mail);
}

@And("click on button")
public void click_on_button() {
	driver.findElement(By.xpath("//button[.='Signup']")).click();
}

@Then("user should naviagte to the information page with valid data")
public void user_should_naviagte_to_the_information_page_with_valid_data() {
 
	String act = driver.findElement(By.xpath("//b[.='Enter Account Information']")).getText();
	String exp="ENTER ACCOUNT INFORMATION";
assertEquals(act, exp);
}
}
