package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static user_interface.CreateNewKnowledgePage.*;

public class Configure implements Task {

    private String request;
    private String answer;

    public Configure(String request, String answer) {
        this.request = request;
        this.answer = answer;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_KNOWLEDEGE, isClickable()).forNoMoreThan(15000).milliseconds(),
                JavaScriptClick.on(LBL_KNOWLEDEGE),
                WaitUntil.the(BTN_ADD, isClickable()).forNoMoreThan(15000).milliseconds(),
                Click.on(BTN_ADD),
                Click.on(LBL_NEW_KNOWLEDGE),
                Click.on(BTN_ANSWER),
                Enter.theValue(request).into(TXT_USER_SENTENCE),
                Click.on(BTN_CREATE_SENTENCE),
                Enter.theValue(answer).into(TXT_ANSWER),
                Click.on(BTN_UPDATE)
        );
    }

    public static Performable aNewKnowledge(String request, String answer){
        return Tasks.instrumented(Configure.class,request,answer);
    }

}
