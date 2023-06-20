package MaybankTest.pageObjects;


import framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id="username")
    private WebElement userNameTextInputBox;

    @FindBy(css=".LoginUsername---login-button---3Fl8E")
    private WebElement loginButton;

    @FindBy(css="h1")
    private WebElement generalModal_userName;

    @FindBy(css=".SecurityPhrase---image-caption---1TK3M ")
    private WebElement  generalModal_securityPhrase;

    @FindBy(css=".btn.btn-success")
    private WebElement generalModal_yesButton;

    @FindBy(id="my-password-input")
    private WebElement generalModal_passwordTextInputBox;

    public void typeIntoUserNameTextInputBox(String userName){
        userNameTextInputBox.click();
        userNameTextInputBox.clear();
        userNameTextInputBox.sendKeys(userName);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public String getGeneralModal_userNameText(){
        return generalModal_userName.getText();
    }

    public String getGeneralModal_securityPhraseText(){
        return generalModal_securityPhrase.getText();
    }

    public void clickGeneralModal_yesButton(){
        generalModal_yesButton.click();
    }

    public void typeIntoGeneralModal_passwordTextInputBox(String password){
        generalModal_passwordTextInputBox.click();
        generalModal_passwordTextInputBox.clear();
        generalModal_passwordTextInputBox.sendKeys(password);
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

}
