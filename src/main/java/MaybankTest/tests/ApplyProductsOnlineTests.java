package MaybankTest.tests;

import MaybankTest.pageObjects.ApplyForZestiPage;
import MaybankTest.pageObjects.ApplyOnlinePage;
import MaybankTest.pageObjects.HomePage;
import MaybankTest.pageObjects.NavigationBarElements;
import framework.BaseTest;
import io.qameta.allure.*;
import lombok.SneakyThrows;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.Utils;
import utils.listeners.TestNGListener;

@Listeners(TestNGListener.class)
@Epic("Regression Tests")
@Feature("Apply Products Online")
public class ApplyProductsOnlineTests extends BaseTest {

    @Test(priority = 1, description = "Apply Products Online.")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Apply Products Online.")
    @Story("Apply Products Online text verification")
    @SneakyThrows
    public void applyProductsOnlineTest() {
        getDriver().get("https://www.maybank2u.com/");

        HomePage homePage = new HomePage(getDriver());
        NavigationBarElements navigationBarElements = new NavigationBarElements(getDriver());
        ApplyOnlinePage applyOnlinePage = new ApplyOnlinePage(getDriver());

        navigationBarElements.clickBusinessPageName();

        Assert.assertEquals(navigationBarElements.getBusinessPageHeader(), "Manage your business online with ease");

//        navigationBarElements.clickPersonalPageName();
        //The Locator for Personal page is not consistent across pages.
        // Using navigation to go back to home page

        getDriver().get("https://www.maybank2u.com/");

        navigationBarElements.clickHelpAndTipsButton();

        Assert.assertEquals(navigationBarElements.getPageHeaderText(), "How to register for a new Maybank2u account?");

//        navigationBarElements.clickPersonalPageName();
        //The Locator for Personal page is not consistent across pages.
        // Using navigation to go back to home page

        getDriver().get("https://www.maybank2u.com/");

        navigationBarElements.clickApplyProductsOnlineButton();

        Assert.assertEquals(applyOnlinePage.getPageHeader(), "Apply Online Now");

//        applyOnlinePage.clickMayBankIslamicZestIAccountApplyButton();
        //Unable to click the button above because the page scrolls and the action of the button click gets interrupted.
        //Doing a work-around by navigating to the url directly, not advisable but for the time bieng

        getDriver().get("https://www.maybank2u.com.my/home/m2u/common/page/apply/cardSTP.do?productType=zesti");
        Utils.sleepMilliSeconds(5000);
        ApplyForZestiPage applyForZestiPage = new ApplyForZestiPage(getDriver());

        Assert.assertEquals(applyForZestiPage.getPageHeader(), "Applying for Zest-i");

        applyForZestiPage.selectFirstAvailableTitle("CAPTAIN");
        applyForZestiPage.typeIntoName("TestUser");
        applyForZestiPage.selectFirstAvailableIdType("New IC");
        applyForZestiPage.typeIntoNRICTextInputBox("900101123456");
//        applyForZestiPage.typeIntoDOBDayTextInputBox("01");
//        applyForZestiPage.typeIntoDOBMonthTextInputBox("01");
//        applyForZestiPage.typeInt0DOBYearTextInputBox("1990");

        applyForZestiPage.clickSaveAndExitButton();

        Assert.assertEquals(applyForZestiPage.getPageSubHeader(), "SUITABILITY ASSESSMENT(SA) FORM");

    }
}
