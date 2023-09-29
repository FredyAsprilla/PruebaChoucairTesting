package tasks;

import com.github.javafaker.Faker;
import interactions.SelectList;
import models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.HomePage;

import java.util.List;

import static userinterfaces.FormOne.*;

public class FillOut implements Task {
    Faker faker = new Faker();
    String mail = faker.internet().emailAddress();

    private List<Data> data;

    public FillOut(List<Data> data) {
        this.data = data;
    }

    public static FillOut form(List<Data> data) {
        return Tasks.instrumented(FillOut.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (Data data : data) {
            actor.attemptsTo(Click.on(HomePage.BTNJOINTODAY),
                    Enter.theValue(data.getName()).into(TXTFIRSTNAME),
                    Enter.theValue(data.getLastName()).into(TXTLASTNAME),
                    Enter.theValue(mail).into(TXTEMAIL),
                    SelectList.Desde(SLTMONTH, data.getMonth()),
                    SelectList.Desde(SLTDAY, data.getDay()),
                    SelectList.Desde(SLTYEAR, data.getYear()),
                    Click.on(BTNNEXTLOCATION)
            );
        }
    }
}
