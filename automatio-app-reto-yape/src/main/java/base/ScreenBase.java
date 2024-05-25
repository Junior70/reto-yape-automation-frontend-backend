package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

public class ScreenBase extends PageObject {


    public AndroidDriver driver() {
        AndroidDriver androidDriver = ((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver());
        return androidDriver;
    }

    public AppiumDriver<?> appiumDriver() {
        return ((AppiumDriver<?>) ((WebDriverFacade) getDriver()).getProxiedDriver());
    }

    public void waitForSeconds(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void allOption(List<WebElement> listElement, String valor) {
        for (int i = 0; i < listElement.size(); i++) {
            if (listElement.get(i).getText().equals(valor)) {
                listElement.get(i).click();
                break;
            }
        }
    }

    public void scrollElement(WebElement element) {
        Dimension size = element.getSize();
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endX = size.width / 2;
        int endY = (int) (size.height * 0.2);

        TouchAction touchAction = new TouchAction(driver());
        touchAction.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
    }

    public void seleccionarfecha(String fecha, List<WebElement> elementList, WebElement elementWindows) {
        if (formatDate(fecha) >= 0) {
            int maxIterations = 5;
            int iteration = 0;
            boolean itemFound = false;
            while (iteration < maxIterations && !itemFound) {
                /*for (WebElement dateLbl : elementList) {
                    waitFor(dateLbl);
                    if (dateLbl.getAttribute("content-desc").equals(fecha)) {
                        dateLbl.click();
                        itemFound = true;
                        break;
                    }
                }*/
                for(int i = 0; i < elementList.size(); i++){
                    waitFor(elementList.get(i));
                    if(elementList.get(i).getAttribute("content-desc").equals(fecha)){
                        elementList.get(i).click();
                        itemFound = true;
                        break;
                    }
                }
                if (!itemFound) {
                    scrollElement(elementWindows);
                    iteration++;
                }
            }
        } else {
            System.out.println("La fecha inicial: " + fecha + "es menor que la fecha actual");
        }
    }

    public static void main(String[] args) {
        ScreenBase screenBase = new ScreenBase();
        screenBase.formatDate("14 junio 2024");
    }
    public int formatDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy", new Locale("es", "ES"));
        Date date1 = null;
        Date date2 = null;
        int comparacion;
        try {
            date1 = format.parse(date);
            date2 = new Date();
            comparacion = date1.compareTo(date2);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return comparacion;
    }

    public void selecionarCantidadHabPers(List<WebElement> elementLbl, List<WebElement> elementBtn, int index, String cant) {
        String cantElement = elementLbl.get(index).getText();
        while (!cantElement.equals(cant)) {
            elementBtn.get(index).click();
            cantElement = elementLbl.get(index).getText();
        }
    }

    public void CantidadNinos(String ValueEdad, List<WebElement> elementBtn, int index, WebElement elementSelEdad, By locator, WebElement elementOk) {
        String[] ValueEdadArray = ValueEdad.split(",");
        List<String> lisValueEdad = new ArrayList<>(Arrays.asList(ValueEdadArray));
        for (String value : lisValueEdad) {
            elementBtn.get(index).click();
            WebElement numberPicker = elementSelEdad.findElement(locator);
            String currentValue = numberPicker.getText();
            while (!currentValue.contains(value)) {
                // Swipe up
                new TouchAction(driver())
                        .press(PointOption.point(numberPicker.getLocation().getX(), numberPicker.getLocation().getY() + numberPicker.getSize().getHeight() / 2))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                        .moveTo(PointOption.point(numberPicker.getLocation().getX(), numberPicker.getLocation().getY() - numberPicker.getSize().getHeight() / 2))
                        .release()
                        .perform();
                currentValue = numberPicker.getText();

            }
            numberPicker.click();
            elementOk.click();
        }
    }

    public boolean verifyText(WebElement element, String text) {
        return waitFor(element).getText().contains(text);
    }

}
