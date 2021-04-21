package user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.xpath;

public class LoginPage extends PageObject {

    public static final Target TXT_USER =
            the("textfield user").located(xpath("//input[@id='emailAddress']"));

    public static final Target TXT_PASS =
            the("textfield pass").located(xpath("//input[@id='password']"));

    public static final Target BTN_CONNECT =
            the("button connect").located(xpath("//input[contains(@id,'submit')]"));
}
