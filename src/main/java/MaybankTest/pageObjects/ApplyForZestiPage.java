package MaybankTest.pageObjects;

import framework.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ApplyForZestiPage extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement pageHeader;

    @FindBy(xpath = "//h3")
    private WebElement pageSubHeader;

    @FindBy(css = ".RenderDesktopDropdown---container---1CES2.ApplicationPanel---containerClass---36ybh #ptitle")
    private WebElement titleDropDown;

    @FindBy(id = "pname")
    private WebElement nameTextInputBox;

    @FindBy(css = ".RenderDesktopDropdown---container---1CES2.ApplicationPanel---containerClass---36ybh #pidtype")
    private WebElement idTypeTextInputBox;

    @FindBy(id = "pidno")
    private WebElement nricNumberTextInputBox;

    @FindBy(id = "pdobDD")
    private WebElement dobDayTextInputBox;

    @FindBy(id = "pdobMM")
    private WebElement dobMonthTextInputBox;

    @FindBy(id = "pdobYYYY")
    private WebElement dobYearTextInputBox;

    @FindBy(css = ".DynamicFields---stretch---2PB6O.ApplicationPanel---inputPair---3wAZs.flex-row")
    private WebElement saveAndExitButton;

    public String getPageHeader() {
        return pageHeader.getText();
    }

    public String getPageSubHeader() {
        return pageSubHeader.getText();
    }

    public void selectFirstAvailableTitle(String title) {
        //Using this way to get it to select the first option.

        titleDropDown.click();

        new Actions(driver)
                .keyDown(Keys.DOWN)
                .perform();

        new Actions(driver)
                .keyDown(Keys.ENTER)
                .perform();
    }

    public void typeIntoName(String name) {
        nameTextInputBox.sendKeys(name);
    }

    public void selectFirstAvailableIdType(String idType) {
        idTypeTextInputBox.click();

        new Actions(driver)
                .keyDown(Keys.DOWN)
                .perform();

        new Actions(driver)
                .keyDown(Keys.ENTER)
                .perform();
    }

    public void typeIntoNRICTextInputBox(String nric) {
        nricNumberTextInputBox.sendKeys(nric);
    }

    public void typeIntoDOBDayTextInputBox(String dobDD) {
        dobDayTextInputBox.sendKeys(dobDD);
    }


    public void typeIntoDOBMonthTextInputBox(String dobMM) {
        dobMonthTextInputBox.sendKeys(dobMM);
    }


    public void typeInt0DOBYearTextInputBox(String dobYYYY) {
        dobYearTextInputBox.sendKeys(dobYYYY);
    }


    public void clickSaveAndExitButton() {
        saveAndExitButton.click();
    }

    public ApplyForZestiPage(WebDriver driver) {
        super(driver);
    }
}
