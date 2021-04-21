package user_interface;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;
import static org.openqa.selenium.By.xpath;

public class CreateNewKnowledgePage {

    public static final Target LBL_KNOWLEDEGE =
            the("label knowledge").located(By.partialLinkText("Knowledge"));

    public static final Target BTN_ADD =
            the("button add").located(xpath("//button[@class='button button_primary superpozed']"));

    public static final Target LBL_NEW_KNOWLEDGE =
            the("label new knowledege").located(xpath("//div[@source-id='newActionDropdown']//span[text()='New knowledge']"));

    public static final Target BTN_ANSWER =
            the("button answer").located(xpath("//span[text()='Answer to a question']"));

    public static final Target TXT_USER_SENTENCE =
            the("textfield user sentence to understand").located(xpath("//div[@data-testid='testid-formulation-editor-field']"));

    public static final Target BTN_CREATE_SENTENCE =
            the("button create user sentence").located(xpath("//a[contains(text(),'Create')]"));

    //iframe
    public static IFrame IFRAME_ANSWER = IFrame.withPath(By.xpath("//iframe[contains(@id,'answerFld')]"));

    public static final Target TXT_ANSWER =
            the("textfield answer supplied by the bot").inIFrame(IFRAME_ANSWER).located(xpath("//body[contains(@data-id,'answerFld')]"));

    public static final Target BTN_UPDATE =
            the("button update").located(xpath("//p[@id='actionnodesetstatus']//button[contains(text(),'Update')]"));



}
