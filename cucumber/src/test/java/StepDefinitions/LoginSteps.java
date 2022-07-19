package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Given");
	}
	@When("user enters username and password")
	public void testWhen() {
		System.out.println("When");
	}
	@And("clicks on login button")
	public void testAnd() {
		System.out.println("And");
	}
	@Then("user is navigated to the home page")
	public void testThen() {
		System.out.println("Then");
	}
}
