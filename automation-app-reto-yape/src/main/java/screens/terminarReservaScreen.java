package screens;

import base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class terminarReservaScreen extends ScreenBase {

    @AndroidFindBy(id = "com.booking:id/title")
    private List<WebElement> monto_pago_txt;
    @AndroidFindBy(id = "com.booking:id/action_button")
    private WebElement reserva_ahora_btn;

    public void validarCostoReserva() {
        System.out.println(monto_pago_txt.get(1).getText());
        Assert.assertTrue(monto_pago_txt.get(1).getText().contains(alojaminetoScreen.precio_reserva));
    }

    public void clickEnReservarAhora() {
        reserva_ahora_btn.click();
        waitFor(reserva_ahora_btn).click();
        waitForSeconds(5);
    }
}
