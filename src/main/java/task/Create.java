package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static user_interface.CreateBotPage.*;

public class Create implements Task {

    private String nameBot;
    private String language;

    public Create(String nameBot, String language) {
        this.nameBot = nameBot;
        this.language = language;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LST_BOTS),
                Click.on(BTN_CREATE_BOT),
                Enter.theValue(nameBot).into(TXT_BOT_NAME),
                SelectFromOptions.byValue(language).from(LST_LANGUAGE),
                Click.on(BTN_CREATE),
                WaitUntil.the(LST_BOTS, isVisible()),
                Click.on(LST_BOTS),
                Click.on(LBL_BOT.of(nameBot))
        );
    }

    public static Performable aNewBot(String nameBot, String language) {
        return Tasks.instrumented(Create.class, nameBot, language);
    }
}