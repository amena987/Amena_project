package Step_defination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Varify_Apply_Leave01_Text extends Base{
	
	@Given("I want to Verify Navigate Url")
	public void i_want_to_verify_navigate_url() {
	    navigateURL("http://it.microtechlimited.com/index.html");
	}

	@Given("I want to go Loging mene")
	public void i_want_to_go_loging_mene() throws InterruptedException {
		Thread.sleep(1000);
		click(By.xpath("//a[text()='LOG IN']"));
	    
	}

	@When("Click on Employee Login")
	public void click_on_employee_login() throws InterruptedException {
		Thread.sleep(3000);
	   click(By.xpath("//a[@href='elogin.php']"));
	}

	@When("Enter User Id as testpilot@gmail.com")
	public void enter_user_id_as_testpilot_gmail_com() {
	sendkeys(By.xpath("//input[@name='mailuid']"), "testpilot@gmail.com");
	}

	@When("Enter Password as {string}")
	public void enter_password_as(String string) {
	   
		 sendkeys(By.xpath("//input[@name='pwd']"),string);
	}

	@Then("Click Login button")
	public void click_login_button() {
	    click(By.xpath("//input[@type='submit']"));
	}

	@Then("Verify I am in Home Page")
	public void verify_i_am_in_home_page() throws InterruptedException {
		String a = getElementText(By.xpath("//h2[2]"));	
		Thread.sleep(1000);

	}

	@When("I Click apply leave menue")
	public void i_click_apply_leave_menue() throws InterruptedException {
		Thread.sleep(3000);
		 click(By.xpath("//a[text()='Apply Leave']"));
	}
	@Then("Enter Reason")
	public void enter_reason() throws InterruptedException {
		Thread.sleep(3000);
		sendkeys(By.xpath("//input[@name='reason']"), "For study abroad");

	}


	@Then("I Enter Start Date")
	public void i_enter_start_date() {
		sendkeys(By.name("start"), "01-27-2023");
	}

	@Then("I Enter End Date")
	public void i_enter_end_date() {
		sendkeys(By.name("end"), "02-23-2023");
	}

	@Then("I Click submit button")
	public void i_click_submit_button() {
		click(By.xpath("//button[text()='Submit']"));
	}
	@Then("Verify Confirmed")
	public void verify_confirmed() throws InterruptedException {
		Thread.sleep(3000);
		String v = getElementText(By.xpath("//tbody/tr[last()]/td[4]"));
		assertEquals("For study abroad", v);

	}


}
