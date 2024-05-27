package screens;

import base.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebElement;
import java.util.List;

public class buscarDestinoScreen extends ScreenBase {

    @Managed(driver = "appium")
    //public AppiumDriver<WebElement> driver;
    AndroidDriver<WebElement> driver;
    @AndroidFindBy(xpath = "//android.widget.ImageButton")
    public WebElement x_btn;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    public WebElement buscar_destino_btn;
    @AndroidFindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    public WebElement ingresar_destino;

    @AndroidFindBy(xpath = "//*[@resource-id='com.booking:id/view_disambiguation_destination_subtitle']")
    public List<WebElement> seleccionar_destino_lista;

    public void abrirApp() {
    }

    public void clickEnX() {
        waitFor(x_btn).click();
    }

    public void clickenBuscar() {
        waitFor(buscar_destino_btn).click();
    }

    public void ingresarElDestinoABuscar(String destino) {
        waitFor(ingresar_destino).sendKeys(destino);
    }

    public void SeleccionarElDestino(String destino) {
        allOption(seleccionar_destino_lista, destino);
        waitForSeconds(5);
    }
}
