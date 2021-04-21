package user_interface;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.xpath;

public class TemporlPage {

    public static final Target BTN_INACTIVE =
            the("button inactive").located(xpath("//span[text()='Inactive bots']"));


}
