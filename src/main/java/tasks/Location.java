package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.FormTwo;

public class Location implements Task {
    public static Location form() {
        return Tasks.instrumented(Location.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(FormTwo.BTNNEXTDEVICES),
                Click.on(FormTwo.BTNNEXTDEVICES)
        );

    }
}
