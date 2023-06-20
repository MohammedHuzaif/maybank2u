package MaybankTest.pageObjects;

import framework.BasePage;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class NavigationBarElements extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement pageHeader;

    @FindBy(css=".navbar-brand")
    private WebElement navBarBrandName;

    @FindBy(xpath = "//a[@class='Header---selectedItem---2qf8r']")
    private WebElement personalPageButton;

    @FindBy(xpath = "//a[@href='https://www.maybank2u.com.my/maybank2u/malaysia/en/business/index.page']")
    private WebElement businessPageButton;

    @FindBy(xpath = "//a[@href='https://www.maybank2u.com.my/maybank2u/malaysia/en/personal/frequent_queries/m2u_first_time_registration/how_to_register_for_a_new_maybank2u_account.page']")
    private WebElement helpAndTips;

    @FindBy(xpath = "//h1[@class='smaller limited']")
    private WebElement businessPageHeader;

    @FindBy(css=".Header---applyProductsOnline---Nrdqc")
    private WebElement applyProductsOnlineButton;

    public void clickBrandName(){
        navBarBrandName.click();
    }

    @SneakyThrows
    public void clickPersonalPageName(){
        Utils.sleepMilliSeconds(3000);
        personalPageButton.click();
    }

    public void clickBusinessPageName(){
        businessPageButton.click();
    }

    public void clickHelpAndTipsButton(){
        helpAndTips.click();
    }

    public String getBusinessPageHeader(){
        return businessPageHeader.getText();
    }

    public String getPageHeaderText(){
        return pageHeader.getText();
    }

    public void clickApplyProductsOnlineButton(){
        applyProductsOnlineButton.click();
    }

    public NavigationBarElements(WebDriver driver) {
        super(driver);
    }
}
