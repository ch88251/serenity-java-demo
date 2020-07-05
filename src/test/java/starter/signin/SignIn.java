package starter.signin;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SignIn {
    public static Performable withCredentials(String username, String password) {
        return Task.where("{0} signs in with '" + username + "' and '" + password,
                Wait.until(WebElementQuestion.stateOf(Target.the("signin button")
                        .located(By.cssSelector("#signin_button"))), isClickable())
                        .forNoLongerThan(10).seconds(),
                Click.on(Target.the("sign in button").located(By.id("signin_button"))),
                Enter.theValue(username).into(SignInForm.USERNAME_FIELD),
                Enter.theValue(password).into(SignInForm.PASSWORD_FIELD).thenHit(Keys.ENTER)
        );
    }
}
