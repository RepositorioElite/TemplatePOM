package co.com.steps;


import co.com.pageObjects.PaginaUsuarioPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;


public class PaginaUsuarioStep {

PaginaUsuarioPageObject paginaUsuarioPageObject = new PaginaUsuarioPageObject();

    @Step
    public void validarMensajeLogin (){
        Assert.assertThat(paginaUsuarioPageObject.getDriver().findElement(paginaUsuarioPageObject.getMsjLoginExitoso())
                .isDisplayed(), Matchers.is(true));

    }

}
