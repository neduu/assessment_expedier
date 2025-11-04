package Tests;

import BaseClasses.TestBase;
import Pages.expedierLoginPage;
import Pages.sendLocallyPage;
import Pages.swapFundsPage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentReports.ExtentTestManager.startTest;

public class sendLocallyTest extends TestBase {
    expedierLoginPage login;
    sendLocallyPage sendLocally;

    public void initializer (){
        login = new expedierLoginPage(driver);
        sendLocally = new sendLocallyPage(driver);

    }

    @Test(priority = 1, description = "User Login on Expedier")
    public void Validate_User_login (Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "Expedier");

        initializer();
        System.out.println("starting starting");


        login.enterEmail(testData.getProperty("userEmail"));
        login.enterPassword(testData.getProperty("password"));
        login.clickLoginBtn();
        login.isAllHistoryDisplayed();


    }

    @Test(priority = 2, description = "Validate that user can send funds locally")
    public void Validate_that_user_can_send_funds_locally(Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "Expedier");


        sendLocally.clickSendLocallyElem();
        sleep(1);
        sendLocally.clickBankTransferElem();
        sleep(1);
        sendLocally.enterAmount(testData.getProperty("amount2"));
        sleep(1);
        sendLocally.clickSendToNewRecipient();
        sleep(1);
        sendLocally.clickBankName();
        sleep(1);
        sendLocally.enterSearchWord(testData.getProperty("word"));
        sendLocally.clickBank();
        sendLocally.enterAmount(testData.getProperty("acctNum"));
        sleep(1);
        sendLocally.clickPurposeOfFund();
        sleep(1);
        sendLocally.clickTuitionPayments();
        sleep(1);
        sendLocally.clickContinueBtn();
        sleep(1);
        sendLocally.clickPin1();
        sleep(1);
        sendLocally.clickPin2();
        sleep(1);
        sendLocally.clickPin3();
        sleep(1);
        sendLocally.clickPin4();
        sleep(1);
        sendLocally.clickPin5();
        sleep(1);
        sendLocally.clickPin6();
        sleep(1);
        sendLocally.clickDashboardBtn();


    }

}


