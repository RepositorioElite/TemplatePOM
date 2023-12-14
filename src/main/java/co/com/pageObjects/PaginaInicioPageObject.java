package co.com.pageObjects;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioPageObject extends PageObject {

    By txtUsuario = By.name("userName");
    By txtClave = By.name("password");
    By btnIngresar = By.name("submit");

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }
}
