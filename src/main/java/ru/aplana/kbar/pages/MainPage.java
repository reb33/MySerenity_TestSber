package ru.aplana.kbar.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Костя on 05.10.2015.
 */
@DefaultUrl("http://www.sberbank.ru/")
public class MainPage extends AbstractPageObject{

    @FindBy(xpath = "//a[@class='no-link']/span[.='Выбрать карту']")
    public WebElementFacade text_chouse_cart;

    @FindBy(linkText = "Кредитные карты")
    public WebElementFacade link_creditCarts;

    @FindBy(css = "img.current-image")
    public WebElementFacade img_mainPage;

//    public MainPage(WebDriver driver){
//        super(driver);
//    }

//    @WhenPageOpens
//    public void untilLoaded(){
//
//        element(link_creditCarts).waitUntilClickable();
//    }

    @Override
    public boolean isLoaded() {
        return img_mainPage.isDisplayed();
    }

//    public void open(){
//
//    }


}
