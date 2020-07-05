package starter.signin;

import net.serenitybdd.screenplay.targets.Target;

class SignInForm {
    static Target PAGE_HEADER = Target.the("page header")
                                       .locatedBy("div.page-header h3");
    static Target USERNAME_FIELD = Target.the("username field")
            .locatedBy("#user_login");
    static Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("#user_password");
}
