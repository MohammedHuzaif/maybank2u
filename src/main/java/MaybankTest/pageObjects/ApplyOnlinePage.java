package MaybankTest.pageObjects;

import framework.BasePage;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Utils;

public class ApplyOnlinePage extends BasePage {

    @FindBy(css = ".heading-image-contetnt")
    private WebElement headerTextBlock;

    @FindBy(xpath = "//div[@id='contentConvention']/div[2]/div/div[2]/div[2]/div[2]/button[1]")
    private WebElement mayBankIslamicZestIAccountApplyButton;

    public String getPageHeader() {
        return headerTextBlock.getText();
    }

    @SneakyThrows
    public void clickMayBankIslamicZestIAccountApplyButton() {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='contentConvention']/div[2]/div/div[2]/div[2]/div[2]/button[1]")));
//        Utils.sleepMilliSeconds(3000);

        mayBankIslamicZestIAccountApplyButton.getText();
        Utils.sleepMilliSeconds(3000);
        mayBankIslamicZestIAccountApplyButton.click();
    }

    public ApplyOnlinePage(WebDriver driver) {
        super(driver);
    }
}
