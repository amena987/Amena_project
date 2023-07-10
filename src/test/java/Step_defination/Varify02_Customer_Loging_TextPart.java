package Step_defination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Varify02_Customer_Loging_TextPart extends Base{
	
	
	@Given("I am in landing page")
	public void i_am_in_landing_page_http_it_microtechlimited_com() {
		navigateURL("http://it.microtechlimited.com");
	}

	@When("I Click on Login menu")
	public void i_click_on_login_menu() {
		click( By.xpath("//a[@href='elogin.php']") );
	}

	@When("Click on Customer Login")
	public void click_on_customer_login() {
		click(By.xpath("//a[@href='clogin.php']") );
	}

	@Then("Enter User Id as {string}")
	public void enter_user_id_as(String email) {
		sendkeys(By.xpath("//input[@name='mailuid']"), email);
		
	}

	@Then("I Enter Password as {string}")
	public void i_enter_password_as(String string) throws InterruptedException {
		sendkeys(By.xpath("//input[@name='pwd']"), string);
		Thread.sleep(1000);
	}

	@Then("I Click on Login Button")
	public void i_click_on_login_button() throws InterruptedException {
		click( By.name("login-submit")  );
		Thread.sleep(1000);
	}

	@Then("Verify that I am in Home Page")
	public void verify_that_i_am_in_home_page() throws InterruptedException {
		String s = getElementText( By.xpath("//h2[2]") );
		Thread.sleep(1000);
	}

	@Then("I Click on Profile Menu")
	public void i_click_on_profile_menu() throws InterruptedException {
		click( By.linkText("My Profile") );
		Thread.sleep(1000);
	}

	@Then("I Click on Update Info")
	public void i_click_on_update_info() throws InterruptedException {
		click( By.xpath("//button[@name='send']") );
		Thread.sleep(1000);
	}

	@Then("I Replace the Contact Number to {int}")
	public void i_replace_the_contact_number_to(Integer int1) {
		clear( By.name("contact"));
		sendkeys( By.name("contact") , "662789");
		}
	@Then("I Click Submit button")
	public void i_click_submit_button() {
	    click(By.xpath("//button[text()='Submit']"));
	}
	@Then("Verify Contact Number is changed to {int}")
	public void verify_contact_number_is_changed_to(Integer int1) {
		String v = driver.findElement( By.xpath("//input[@type='number']") ).getAttribute("value");
		assertEquals("662789", v);  
	}

	
	
}