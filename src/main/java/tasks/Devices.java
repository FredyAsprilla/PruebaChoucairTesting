package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static userinterfaces.FormularioTres.BTNNEXTLASTSTEP;

public class Devices implements Task {


    public static Devices formulario() {
        return Tasks.instrumented(Devices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(BTNNEXTLASTSTEP),
                Click.on(BTNNEXTLASTSTEP));
    }
}
