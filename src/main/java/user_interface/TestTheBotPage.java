package user_interface;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.xpath;

public class TestTheBotPage {

    public static final Target BTN_TEST =
            the("button test").located(xpath("//span[text()='Test']"));

    public static final Target TXT_QUESTION =
            the("textfield question").located(xpath("//input[@id='userInput']"));

    public static final Target BTN_SEND =
            the("button send question").located(xpath("//button[@id='userInputBtn']"));
}
