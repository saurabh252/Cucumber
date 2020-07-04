package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
    @Given("User is onto login page")
    public void userIsOntoLoginPage() {
        System.out.println("User is in login page");
    }

    @When("User entered the right credentials")
    public void userEnteredTheRightCredentials() {
        System.out.println("User entered the credentials");
    }

    @Then("User able to navigate to home page")
    public void userAbleToNavigateToHomePage() {
        System.out.println("User able to navigate to home page");
    }

    @When("User entered the id {string} and password {string}")
    public void userEnteredTheIdAndPassword(String arg0, String arg1) {

        System.out.println("User Id: "+arg0);
        System.out.println("Password: "+arg1);

    }

    @Then("User not able to navigate to home page")
    public void userNotAbleToNavigateToHomePage() {
        System.out.println("User not able to login with wrong credentials");
    }
}
