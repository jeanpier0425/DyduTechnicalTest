package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static user_interface.TestTheBotPage.*;

public class Test implements Task {

    private String request;

    public Test(String request) {
        this.request = request;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_TEST),
                Enter.theValue(request).into(TXT_QUESTION),
                Click.on(BTN_SEND)
        );
    }

    public static Performable theBot(String request) {
        return Tasks.instrumented(Test.class, request);
    }
}
