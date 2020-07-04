package stepdefination;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SignUpStepDefination {
    @Given("User is in sign up page")
    public void userIsInSignUpPage() {
        System.out.println("User is in sign up page");
    }

    @When("User sign up with following details")
    public void userSignUpWithFollowingDetails(DataTable dataTable) {
        System.out.println("Sign up Data as list :::::::::::::::::" +dataTable.asLists());
        System.out.println("First Name: "+dataTable.asLists().get(1).get(0));
        System.out.println("Last Name: "+dataTable.asLists().get(1).get(1));
        System.out.println("Email: "+dataTable.asLists().get(1).get(2));
        System.out.println("City: "+dataTable.asLists().get(1).get(3));
        System.out.println("State: "+dataTable.asLists().get(1).get(4));
        System.out.println("Sign Up data as Map:::::::::::::::::::" +dataTable.asMaps());
        System.out.println("key | Value: "+ dataTable.asMaps().get(0).get("name"));
        System.out.println("key | Value: "+ dataTable.asMaps().get(0).get("last name"));
        System.out.println("key | Value: "+ dataTable.asMaps().get(0).get("email"));
        System.out.println("key | Value: "+ dataTable.asMaps().get(0).get("city"));
        System.out.println("key | Value: "+ dataTable.asMaps().get(0).get("state"));
    }
}
