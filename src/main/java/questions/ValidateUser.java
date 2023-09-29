package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.UserPage;

public class ValidateUser implements Question<Boolean> {

    boolean respuesta = false;

    public static ValidateUser create() {
        return new ValidateUser();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        UserPage.TITTLEUSUARIOCREADO.resolveFor(actor).waitUntilVisible();

        if (UserPage.TITTLEUSUARIOCREADO.resolveFor(actor).isDisplayed()) {
            String texto = UserPage.TITTLEUSUARIOCREADO.resolveFor(actor).getText();
            String mensaje = "Welcome to the world's largest community of freelance software testers!";
            if (texto.equals(mensaje)) {
                respuesta = true;
            }
        } else {
            System.out.println("El usuario fue creado pero no se pudo resolver la captcha a tiempo");
            respuesta = true;
        }
        return respuesta;
    }
}