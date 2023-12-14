package co.com.steps;

import co.com.pageObjects.PaginaInicioPageObject;
import co.com.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PaginaInicioStep {

    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();
    public static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();


    @Step
    public void abrirNavegador() throws IOException {
        leerExcel = Excel.leerDatosDeHojaDeExcel("Data/DatosExcel.xlsx", "Url");
        paginaInicioPageObject.getDriver().get(leerExcel.get(0).get("Url"));

    }

    @Step
    public void escribirUsuario() throws IOException {
        leerExcel = Excel.leerDatosDeHojaDeExcel("Data/DatosExcel.xlsx", "Datoslogin");
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtUsuario()).sendKeys(leerExcel.get(0).get("Usuario"));
    }

    @Step
    public void escribirClave() throws IOException {
        leerExcel = Excel.leerDatosDeHojaDeExcel("Data/DatosExcel.xlsx", "Datoslogin");
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtClave()).sendKeys(leerExcel.get(0).get("Clave"));
    }


    @Step
    public void clicIngresar() {
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnIngresar()).click();
    }

}
