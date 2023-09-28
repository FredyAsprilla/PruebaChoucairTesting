package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static userinterfaces.FormularioCuatro.*;
public class PassForm implements Task {

    public static PassForm final2() {
        return Tasks.instrumented(PassForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(TXTPASS),
                Enter.theValue("Contrasena12567").into(TXTPASS),
                JavaScriptClick.on(TXTPASS2),
                Enter.theValue("Contrasena12567").into(TXTPASS2),
                Click.on(CHECK1),
                Click.on(CHECK2),
                Click.on(BTNCOMPLETE)
        );


    }

}
