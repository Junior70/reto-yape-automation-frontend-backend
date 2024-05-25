package screens;

import base.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebElement;

import java.util.List;

public class buscarFechasScreen extends ScreenBase {

    @Managed(driver = "appium")
    AndroidDriver<WebElement> driver;

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElement fecha_windows_scroll;
    @AndroidFindBy(xpath = "//android.view.View/android.view.View[@class='android.view.View']")
    private List<WebElement> fecha_lista_lbl;
    @AndroidFindBy(id = "com.booking:id/facet_date_picker_confirm")
    private WebElement fecha_selecciona_btn;


    public void seleccionarFechaInicial(String fechaInicial) {
        seleccionarfecha(fechaInicial, fecha_lista_lbl, fecha_windows_scroll);
    }

    public void seleccionarFechaFinal(String fechaFinal) {
        seleccionarfecha(fechaFinal, fecha_lista_lbl, fecha_windows_scroll);
    }

    public void clickEnSeleccionarFecha() {
        waitFor(fecha_selecciona_btn).click();
    }

}
