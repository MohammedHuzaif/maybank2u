package MaybankTest.pageObjects;

import framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(css = "//dashboardPlaceholder" )
    private WebElement dashboardPlaceholder;

    public String getDashboardPlaceholder(){
        return dashboardPlaceholder.getText();
    }

    public DashboardPage(WebDriver driver) {
        super(driver);
    }
}
