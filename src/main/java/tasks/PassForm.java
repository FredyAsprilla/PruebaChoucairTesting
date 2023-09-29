package tasks;

import com.github.javafaker.Faker;
import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import java.util.List;

import static userinterfaces.FormFour.*;
public class PassForm implements Task {
    Faker faker = new Faker();
    String password = faker.internet().password(11,20,true,true,true);

    public static PassForm final2() {
        return Tasks.instrumented(PassForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(password);

            actor.attemptsTo(
                    JavaScriptClick.on(TXTPASS),
                    Enter.theValue(password).into(TXTPASS),
                    JavaScriptClick.on(TXTPASS2),
                    Enter.theValue(password).into(TXTPASS2),
                    Click.on(CHECK1),
                    Click.on(CHECK2),
                    Click.on(BTNCOMPLETE)
            );

    }
}
