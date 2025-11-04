package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class expedierLoginPage extends PageBase {
    public expedierLoginPage(AndroidDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.EditText")
    private WebElement emailAddressTextBox;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.widget.EditText")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Login\"]")
    private WebElement loginBtn;

    @FindBy(xpath = "//android.view.View[@content-desc=\"History\"]")
    private WebElement historyText;
//is display


    public void enterEmail(String email) {
        click(emailAddressTextBox);
        enterText(emailAddressTextBox, email);
    }

    public void enterPassword(String password) {
        click(passwordTextBox);
        enterText(passwordTextBox, password);
    }

    public void clickLoginBtn() {
        click(loginBtn);
    }

    public boolean isAllHistoryDisplayed() {
        try{
            return historyText.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }


}

