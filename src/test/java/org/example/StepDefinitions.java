package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {


    @Given("today is Sunday")
    public void today_is_sunday() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("today_is_sunday");
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("I ask whether it's Friday yet");
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("I should be told");
    }
}
