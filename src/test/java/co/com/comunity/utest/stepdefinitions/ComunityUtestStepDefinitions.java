package co.com.comunity.utest.stepdefinitions;

import co.com.comunity.utest.model.DataFormRegister;
import co.com.comunity.utest.questions.TheTitle;
import co.com.comunity.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComunityUtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^john clicks the button join today$")
    public void johnClicksTheButtonJoinToday() {
        OnStage.theActorCalled("Edinson").wasAbleTo(OpenUp.thePage(),Join.onThePage());

    }

    @When("^he begins to fill out the registration form$")
    public void heBeginsToFillOutTheRegistrationForm(List<DataFormRegister> data) {
        theActorInTheSpotlight().attemptsTo(FirstStep.fillForm(data));
        theActorInTheSpotlight().attemptsTo(SecondStep.fillForm(data));
        theActorInTheSpotlight().attemptsTo(ThirdStep.fillForm(data));
        theActorInTheSpotlight().attemptsTo(FourthStep.fillForm(data));

    }

    @Then("^He finally makes his registration on the utest\\.com platform$")
    public void heFinallyMakesHisRegistrationOnTheUtestComPlatform(List<DataFormRegister> data) {
     //   theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheTitle.is(data.get(0).getTextCompleteRegister())));
    }

}
