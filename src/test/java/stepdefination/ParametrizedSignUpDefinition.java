package stepdefination;

import io.cucumber.java.en.When;

public class ParametrizedSignUpDefinition {

    @When("^User sign up with (.+) and (.+)$")
    public void user_sign_up_with_and(String username, String password)  {
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
    }
}
