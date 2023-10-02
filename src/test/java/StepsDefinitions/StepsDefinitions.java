package StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Data;
import questions.ValidateUser;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StepsDefinitions {
    @Given("that Fredy wants to access the page")
    public void that_fredy_wants_to_access_the_page() {
        theActorCalled("actor").wasAbleTo(OpenPageTask.utest());
    }

    @When("enter the form")
    public void enter_the_form(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(FillOutPage.form(data));
    }

    @When("look for my location")
    public void look_for_my_location(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(LocationTask.form(data));
    }

    @When("Diligence characteristics of my PC")
    public void diligence_characteristics_of_my_pc(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(DevicesPage.form(data));
    }

    @When("I fill out my password")
    public void i_fill_out_my_password(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(PassFormTask.final2(data));
    }

    @Then("I validate the user creation")
    public void i_validate_the_user_creation() {
        theActorInTheSpotlight().should(seeThat(ValidateUser.create()));
    }


}