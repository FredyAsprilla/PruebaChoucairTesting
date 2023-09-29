package StepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import models.Data;

import java.util.Map;

public class Hook {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());

    }
    @DataTableType
    public Data defineConstructorVar(Map<String, String> dataTable) {
        // Crea una instancia de ConstructorVar usando los datos de la tabla
        return new Data(dataTable.get("name"), dataTable.get("lastName"), dataTable.get("day"), dataTable.get("month"), dataTable.get("year"));
    }
}

