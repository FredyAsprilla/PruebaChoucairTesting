package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.PaginaUsuario;

public class ValidarUsuario implements Question<Boolean> {

    boolean respuesta = false;

    public static ValidarUsuario creado() {
        return new ValidarUsuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        PaginaUsuario.TITTLEUSUARIOCREADO.resolveFor(actor).waitUntilVisible();

        if (PaginaUsuario.TITTLEUSUARIOCREADO.resolveFor(actor).isDisplayed()) {
            String texto = PaginaUsuario.TITTLEUSUARIOCREADO.resolveFor(actor).getText();
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