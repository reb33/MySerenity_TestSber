package ru.aplana.kbar.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.aplana.kbar.utils.Utils;

import static org.junit.Assert.fail;

/**
 * Created by Костя on 05.10.2015.
 */
public class CreditCartPage extends AbstractPageObject{

    @FindBy(linkText = "Добавить к сравнению")
    public WebElementFacade button_addToCompare;

    @FindBy(css = "div.toggleCard.removeCard > a")
    public WebElementFacade button_removeFromCompare;

    @FindBy(css = "button.sbf_button")
    public WebElementFacade button_compare;

    public void waitLoaded() throws Exception{

        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (Utils.isElementPresent(button_addToCompare)) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
    }


    @Override
    public boolean isLoaded() {
        return button_addToCompare.isDisplayed();
    }
}
