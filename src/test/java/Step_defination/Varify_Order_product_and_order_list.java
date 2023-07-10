package Step_defination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Varify_Order_product_and_order_list extends Base{
	@Given("I want to Locate navigateUrl")
	public void i_want_to_locate_navigate_url() {
	   navigateURL("http://it.microtechlimited.com");
	}

	@When("I want to click on login Menu")
	public void i_want_to_click_on_login_menu() {
		click(By.xpath("//a[@href='elogin.php']"));
	}

	@When("I want to click on  Customer Login")
	public void i_want_to_click_on_customer_login() {
		click(By.xpath("//a[@href='clogin.php']"));
	}

	@When("Enter User Id as david@gmail.com")
	public void enter_user_id_as_david_gmail_com() {
		sendkeys(By.xpath("//input[@type='text']"),"david@gmail.com");

	}

	@When("Enter Password as {int}")
	public void enter_password_as(Integer int1) {
		sendkeys(By.xpath("//input[@type='password']"),"1234");
	}

	@Then("Click Login Button")
	public void click_login_button() throws InterruptedException {
		Thread.sleep(1000);
		click(By.name("login-submit"));
	}

	@Then("I am in Home Page")
	public void i_am_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=getElementText(By.xpath("//h2[text()='Welcome David']"));
	}

	@Then("Click order product menue")
	public void click_order_product_menue() throws InterruptedException {
		Thread.sleep(1000);
		click(By.linkText("Order Product"));
	}

	@Then("Click product Name")
	public void click_product_name() throws InterruptedException {
		Thread.sleep(1000);
		click(By.name("prodId"));
		click(By.xpath("//option[text()='Pin']"));
	}

	@Then("Enter order Date")
	public void enter_order_date() throws InterruptedException {
		Thread.sleep(1000);
		sendkeys(By.name("ordDate"),"1/18/2023");
	}

	@Then("Click product button")
	public void click_product_button() throws InterruptedException {
		Thread.sleep(1000);
		click(By.xpath("//button[text()='Order Product']"));

	}

	@Then("Click Order product Confirm Link")
	public void click_order_product_confirm_link() throws InterruptedException {
		Thread.sleep(1000);
		click(By.xpath("//tbody/tr[last()]/td[7]/a"));
	}

	@Then("I want to  Confirmed")
	public void i_want_to_confirmed() throws InterruptedException {
		Thread.sleep(1000);
		String c =getElementText(By.xpath("//tbody/tr[last()]/td[6]"));
		assertEquals("Confirmed", c);

	}
	@Then("I Eventually Log Out")
	public void i_eventually_log_out() throws InterruptedException {
	Thread.sleep(1000);
	   click(By.xpath("//a[@href='clogin.php']"));
	}
	@Then("I want to click Employee Login")
	public void i_want_to_click_employee_login() throws InterruptedException {
		Thread.sleep(2000);
	    click(By.xpath("//a[@href='elogin.php']"));
	}
	

	@Then("I Enter employee email address")
	public void i_enter_employee_email_address() {
	    sendkeys(By.name("mailuid"),"testpilot@gmail.com");
	}

	@Then("I Enter password")
	public void i_enter_password() {
	    sendkeys(By.name("pwd"),"1234");
	}

	@Then("I want to  Login")
	public void i_want_to_login() {
	    click(By.name("login-submit"));
	}

	@Then("I Want to Click Welcome Test")
	public void i_want_to_click_welcome_test() {
	  click(By.xpath("//h2[2]"));
	}

	@Then("I will click My profile")
	public void i_will_click_my_profile() {

		click(By.xpath("//a[text()='My Profile']"));
	}
	@Then("I want see to Update Info")
	public void i_want_see_to_update_info() {
	    click(By.xpath("//button[text()='Update Info']"));
	}

	@Then("I Replace the Contact Number")
	public void i_replace_the_contact_number() throws InterruptedException {
		Thread.sleep(1000);
		clear(By.name("contact"));
		sendkeys(By.name("contact"),"0808");
	}

	@Then("I  Replace the Address")
	public void i_replace_the_address() throws InterruptedException {
		Thread.sleep(1000);
		clear(By.xpath("//input[@name='address']"));
		sendkeys(By.xpath("//input[@name='address']"), "CTG");
	}

	@Then("I click submit button")
	public void i_click_submit_button() {
	    click(By.xpath("//button[text()='Submit']"));
	}
	    
	
	@Then("I   want to Verify Address")
	public void i_want_to_verify_address() {
	String s=getElementText(By.xpath("//p[text()='Address']"));
	assertEquals("Address", s);
	}

}
