package co.com.stepDefinitions;

import co.com.steps.PaginaInicioStep;


import co.com.steps.PaginaUsuarioStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {

    @Steps
    PaginaInicioStep paginaInicioStep;
    @Steps
    PaginaUsuarioStep paginaUsuarioStep;

    @Dado("que el usuario se encuentre en la pagina web")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() throws IOException {
        paginaInicioStep.abrirNavegador();
    }

    @Cuando("ingrese el usuario con la clave")
    public void ingreseElUsuarioConLaClave() throws IOException {
        paginaInicioStep.escribirUsuario();
        paginaInicioStep.escribirClave();
        paginaInicioStep.clicIngresar();
    }

    @Entonces("el usuario visualizara un mensaje de login exitoso")
    public void elUsuarioVisualizaraUnMensajeDeLoginExitoso() {
        paginaUsuarioStep.validarMensajeLogin();
    }
}
