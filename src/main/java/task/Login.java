package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static user_interface.LoginPage.*;

public class Login implements Task {

    private String user;
    private String pass;

    public Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(TXT_USER),
                Enter.theValue(pass).into(TXT_PASS),
                Click.on(BTN_CONNECT)
        );
    }

    public static Performable inThePage(String user, String pass){
        return Tasks.instrumented(Login.class,user,pass);
    }

}
