package StepDefination;

import io.cucumber.java.en.Given;
public class Login {
	
	@Given("^User navigate to PHP page$")
	public void User_Navigate() {
		System.out.println("User has launched the website");
	}
	
	
	@Given("^ User enters username in username field$")
	public void User_username() {
		System.out.println("User has entered username");
	}
	
	@Given("^  User enters pass in password field$")
	public void User_password() {
		System.out.println("User has entered password");
	}
	
	

}
