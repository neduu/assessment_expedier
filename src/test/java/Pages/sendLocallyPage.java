package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class sendLocallyPage extends PageBase {
    public sendLocallyPage(AndroidDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Send Locally\"]")
    private WebElement sendLocallyElem;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Bank Transfer\n" +
            "Send or pay through bank transfers\"]")
    private WebElement bankTransferElem;

    @FindBy(xpath = "//android.widget.EditText")
    private WebElement amountTextBox;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Send to new recipient\"]")
    private WebElement sendToNewRecipient;

    @FindBy(xpath = "//android.view.View[@content-desc=\" \"]/android.view.View[2]/android.view.View[4]")
    private WebElement bankName;

    @FindBy(xpath = "//android.widget.EditText")
    private WebElement searchBarTextBox;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Guaranty Trust Bank PLC (GTBank PLC)\"]")
    private WebElement bankElem;

    @FindBy(xpath = "//android.widget.EditText")
    private WebElement accountNumberTexTBox;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.View[10]")
    private WebElement purposeOfFund;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Tuition Payments\"]")
    private WebElement tuitionPayments;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Continue\"]")
    private WebElement continueBtn;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"1\"]")
    private WebElement pin1;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"5\"]")
    private WebElement pin2;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"9\"]")
    private WebElement pin3;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"6\"]")
    private WebElement pin4;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"3\"]")
    private WebElement pin5;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"2\"]")
    private WebElement pin6;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Dashboard\"]")
    private WebElement dashboardBtn;
//is display



    public void clickSendLocallyElem() {
        click(sendLocallyElem);
    }

    public void clickBankTransferElem() {
        click(bankTransferElem);
    }

    public void enterAmount(String amount) {
        click(amountTextBox);
        enterText(amountTextBox, amount);
    }

    public void clickSendToNewRecipient() {
        click(sendToNewRecipient);
    }

    public void clickBankName() {
        click(bankName);
    }

    public void enterSearchWord(String user) {
        click(searchBarTextBox);
        enterText(searchBarTextBox, user);
    }

    public void clickBank() {
        click(bankElem);
    }

    public void enterAccountNum(String num) {
        click(accountNumberTexTBox);
        enterText(accountNumberTexTBox, num);
    }

    public void clickPurposeOfFund() {
        click(purposeOfFund);
    }

    public void clickTuitionPayments() {
        click(tuitionPayments);
    }

    public void clickContinueBtn() {
        click(continueBtn);
    }

    public void clickPin1() {
        click(pin1);
    }

    public void clickPin2() {
        click(pin2);
    }

    public void clickPin3() {
        click(pin3);
    }

    public void clickPin4() {
        click(pin4);
    }

    public void clickPin5() {
        click(pin5);
    }

    public void clickPin6() {
        click(pin6);
    }

    public void clickDashboardBtn() {
        click(dashboardBtn);
    }


}


