package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    private static final Duration TIMEOUT = Duration.ofSeconds(5);
    private static final int POLLING = 100;

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT);
        this.driver.manage().window().maximize();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,
                5), this);
    }
}
