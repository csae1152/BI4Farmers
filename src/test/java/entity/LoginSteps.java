/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Helmut
 */

public class LoginSteps 
{
	private static final Logger LOGGER = Logger.getLogger(LoginSteps.class.getName());
	
	@Given("^I navigate to the mock application$")
	public void given_I_navigate_to_the_mock_application(){
		LOGGER.info("Entering: I navigate to the mock application");
	}
	
	@When("^I try to login with '(.+)' credentials$")
	public void when_I_try_to_login(String credentialsType){
		LOGGER.log(Level.INFO, "Entering: I try to login with {0} credentials", credentialsType);
	}
	
	@Then("^I should see that I logged in '(.+)'$")
	public void then_I_login(String outcome){
		LOGGER.log(Level.INFO, "Entering: I should see that I logged in {0}", outcome);
	}
}