package user_interface;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.xpath;

public class CreateBotPage {

    public static final Target LST_BOTS =
            the("list bots").located(xpath("//span[@id='selectedBot']/.."));

    public static final Target BTN_CREATE_BOT =
            the("button create bot").located(xpath("//button[@class='button button_primary button_wide']"));

    public static final Target TXT_BOT_NAME =
            the("textfield bot name").located(xpath("//input[@id='nameFld']"));

    public static final Target LST_LANGUAGE =
            the("list language").located(xpath("//select[@id='language']"));

    public static final Target BTN_CREATE =
            the("button create").located(xpath("//button[contains(text(),'Create')]"));

    //mapeo temporal lista de bots
    public static final Target LBL_BOT =
            the("label bot").locatedBy("(//a[contains(text(),'{0}')])[1]");

}