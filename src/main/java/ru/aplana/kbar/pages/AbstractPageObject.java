package ru.aplana.kbar.pages;


import net.serenitybdd.core.pages.PageObject;

/**
 * Created by Костя on 06.10.2015.
 */
public abstract class AbstractPageObject extends PageObject {

    public abstract boolean isLoaded();

//    public AbstractPageObject(WebDriver driver) {
//        super(driver);
//    }
}
