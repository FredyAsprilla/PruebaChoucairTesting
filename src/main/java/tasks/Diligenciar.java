package tasks;

import interactions.SelectList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.HomePage;

import static userinterfaces.FormularioUno.*;

public class Diligenciar implements Task {

    public static Diligenciar formulario() {
        return Tasks.instrumented(Diligenciar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTNJOINTODAY),
                Enter.theValue("Fredy").into(TXTFIRSTNAME),
                Enter.theValue("Asprilla").into(TXTLASTNAME),
                Enter.theValue("Fredy5@Test.com").into(TXTEMAIL),
                SelectList.Desde(SLTMONTH, "February"),
                SelectList.Desde(SLTDAY, "7"),
                SelectList.Desde(SLTYEAR, "1990"),
                Click.on(BTNNEXTLOCATION)
                );
    }
}
