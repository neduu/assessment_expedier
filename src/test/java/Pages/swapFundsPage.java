package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class swapFundsPage extends PageBase {
    public swapFundsPage(AndroidDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Swap Funds\"]")
    private WebElement swapFundsElem;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"NGN\"]")
    private WebElement changeCountryElem;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Canadian Dollar (CAD)\"]")
    private WebElement selectCountry;

    @FindBy(xpath = "//android.widget.ScrollView/android.widget.EditText")
    private WebElement nairaAmount;

    @FindBy(xpath = "(//android.view.View[@content-desc=\"Swap\"])[2]")
    private WebElement swapBtn;

    @FindBy(xpath = "(//android.view.View[@content-desc=\"Swap\"])[2]")
    private WebElement swapBtn2;

    @FindBy(xpath = "//android.view.View[@content-desc=\"You have successfully swapped funds from your Expedier Nigerian naira Account to your Expedier Canadian Dollar Account, Congrats!\"]")
    private WebElement successMessage;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Dashboard\"]")
    private WebElement dashboardBtn;



    public void clickSwapFundsElem() {
        click(swapFundsElem);
    }

    public void clickChangeCountryElem() {
        click(changeCountryElem);
    }

    public void clickCountry() {
        click(selectCountry);
    }

    public void enterAmount(String amount) {
        click(nairaAmount);
        enterText(nairaAmount, amount);
    }

    public void clickSwapBtn() {
        click(swapBtn);
    }

    public void clickSwapBtn2() {
        click(swapBtn2);
    }

    public void clickDashboardBtn() {
        click(dashboardBtn);
    }

    public boolean isSuccessMessageDisplayed() {
        try{
            return successMessage.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }



}


