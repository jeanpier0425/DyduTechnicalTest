package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interactions.OpenBrowser;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Match;
import task.Configure;
import task.Create;
import task.Login;
import task.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateKnowledgeStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) opens the website$")
    public void theUserOpensTheWebsite(String nameActor) {
        theActorCalled(nameActor).wasAbleTo(OpenBrowser.withSpecificUrl());
    }

    @When("^The user logs in with user (.*) and with password (.*)$")
    public void theUserLogsInUserQaDyduCAiAndPasswordQMsPNp(String user, String pass) {
        theActorInTheSpotlight().attemptsTo(Login.inThePage(user, pass));
    }

    @When("^It creates bot with name (.*) and language (.*)$")
    public void itCreatesBotWithNameAndLanguage(String nameBot, String language) {
        theActorInTheSpotlight().attemptsTo(Create.aNewBot(nameBot, language));
    }

    @When("^It creates new knowledge with the request (.*) and answer (.*)$")
    public void itCreatesNewKnowledgeWithRequestAndAnswer(String request, String answer) {
        theActorInTheSpotlight().attemptsTo(Configure.aNewKnowledge(request, answer));
    }

    @When("^The user tests the bot with the request (.*)$")
    public void theUserTestsTheBotWithTheRequest(String request) {
        theActorInTheSpotlight().attemptsTo(Test.theBot(request));
    }

    @Then("^The bot response must match the saved response (.*)$")
    public void theBotResponseMustMatchTheSavedResponse(String answer) {
        theActorInTheSpotlight().should(seeThat(Match.theTexts(answer)));
    }
}