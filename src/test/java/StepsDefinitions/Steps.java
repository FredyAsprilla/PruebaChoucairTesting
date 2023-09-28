package StepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarUsuario;
import tasks.*;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
public class Steps {

    @Before
    public void configuracionInicial() {
        setTheStage(new OnlineCast());
    }

    @Dado("que Fredy quiere acceder a la pagina")
    public void que_fredy_quiere_acceder_a_la_pagina() {
        theActorCalled("actor").wasAbleTo(Abrir.lapagina());
    }

    @Cuando("ingresa al formulario")
    public void ingresa_al_formulario() {
        theActorInTheSpotlight().attemptsTo(Diligenciar.formulario());
    }

    @Cuando("Diligencio mi localizacion")
    public void diligencio_mi_localizacion() throws InterruptedException {
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(Localizacion.formulario());
    }

    @Cuando("Diligencio caracteristicas de mi PC")
    public void diligencio_caracteristicas_de_mi_pc() {
        theActorInTheSpotlight().attemptsTo(Devices.formulario());
    }

    @Cuando("Diligencio mi contrasena")
    public void diligencio_mi_contrasena() {
        theActorInTheSpotlight().attemptsTo(PassForm.final2());
    }


    @Entonces("Valido la creación del usuario")
    public void valido_la_creación_del_usuario() throws InterruptedException {
        theActorInTheSpotlight().should(seeThat(ValidarUsuario.creado()));
    }
}