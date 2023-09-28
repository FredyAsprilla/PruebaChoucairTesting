package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioTres {
    public static final Target BTNNEXTLASTSTEP = Target.the("Boton Next Devices").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

}
