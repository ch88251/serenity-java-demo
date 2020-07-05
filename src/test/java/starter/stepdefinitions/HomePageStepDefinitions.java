package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.signin.SignIn;

public class HomePageStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} is on the home page")
    public void signIn(Actor actor) {
        actor.wasAbleTo(NavigateTo.theHomePage());
    }

    @When("{actor} signs in with valid credentials")
    public void signsInWithValidCredentials(Actor actor) {
        actor.attemptsTo(
                SignIn.withCredentials("username", "password")
        );
    }

}
