package screens;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class datosClienteScreen extends ScreenBase {

    @Managed(driver = "appium")
    public AppiumDriver<WebElement> driver;

    @AndroidFindBy(id = "com.booking:id/bui_input_container_content")
    private List<WebElement> datos_txt;
    @AndroidFindBy(className = "android.widget.RadioButton")
    private List<WebElement> datos_rdb;
    @AndroidFindBy(id = "com.booking:id/action_button")
    private WebElement siguiente_ultimo_paso_btn;

    @AndroidFindBy(className = "android.widget.Button")
    private WebElement reservar_ahora_btn;

    public void ingresarNombre(String nombre) {
        waitFor(datos_txt.get(0)).sendKeys(nombre);
    }

    public void ingresarApellido(String apellido) {
        datos_txt.get(1).sendKeys(apellido);
    }

    public void ingresarEmail(String email) {
        datos_txt.get(2).sendKeys(email);
    }

    public void ingresarPaisRegion(String paisRegion) {
        if (waitFor(datos_txt.get(3)).getText().equals("")) {
            datos_txt.get(3).clear();
            datos_txt.get(3).click();
            datos_txt.get(3).sendKeys(paisRegion.trim());
        }
        //Actions actions = new Actions(driver());
        //actions.sendKeys(Keys.ESCAPE).build().perform();
    }

    public void ingresarNumeroTelefono(String numeroTelefono) {
        waitFor(datos_txt.get(4)).sendKeys(numeroTelefono);
    }

    public void seleccionarMotivoViaje(String propositoViaje) {
        if (propositoViaje.equals("Negocios") || propositoViaje.equals("Trabajo")) {
            datos_rdb.get(0).click();
        } else if (propositoViaje.equals("Ocio") || propositoViaje.equals("Placer")) {
            datos_rdb.get(1).click();
        }
        siguiente_ultimo_paso_btn.click();
        waitForSeconds(2);
        siguiente_ultimo_paso_btn.click();
        waitForSeconds(2);
        //System.out.println(driver().getPageSource());
    }

}
