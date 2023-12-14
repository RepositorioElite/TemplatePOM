package co.com.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaUsuarioPageObject extends PageObject {


    By msjLoginExitoso = By.xpath("//h3[text()='Login Successfully']");

    public By getMsjLoginExitoso() {
        return msjLoginExitoso;
    }
}
