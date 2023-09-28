package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.FormularioDos;

public class Localizacion implements Task {
    public static Localizacion formulario() {
        return Tasks.instrumented(Localizacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(FormularioDos.BTNNEXTDEVICES),
                Click.on(FormularioDos.BTNNEXTDEVICES)
        );

    }
}
