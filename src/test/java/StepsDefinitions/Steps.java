package StepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Data;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.model.DataTable;
import questions.ValidateUser;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class Steps {


    @Given("that Fredy wants to access the page")
    public void that_fredy_wants_to_access_the_page() {
        theActorCalled("actor").wasAbleTo(OpenPage.utest());
    }

    @When("enter the form")
    public void enter_the_form(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(FillOut.form(data));
    }

    @When("look for my location")
    public void look_for_my_location()  {
        theActorInTheSpotlight().attemptsTo(Location.form());
    }

    @When("Diligence characteristics of my PC")
    public void diligence_characteristics_of_my_pc() {
        theActorInTheSpotlight().attemptsTo(Devices.form());
    }

    @When("I fill out my password")
    public void i_fill_out_my_password() {
        theActorInTheSpotlight().attemptsTo(PassForm.final2());
    }

    @Then("I validate the user creation")
    public void i_validate_the_user_creation() {
        theActorInTheSpotlight().should(seeThat(ValidateUser.create()));
    }


}