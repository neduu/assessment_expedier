package Tests;

import BaseClasses.TestBase;
import Pages.expedierLoginPage;
import Pages.swapFundsPage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentReports.ExtentTestManager.startTest;

public class swapFundsTest extends TestBase {
    expedierLoginPage login;
    swapFundsPage swapFunds;

    public void initializer (){
        login = new expedierLoginPage(driver);
        swapFunds = new swapFundsPage(driver);

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

    @Test(priority = 2, description = "Validate that user swap fund")
    public void Validate_that_user_swap_fund(Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "Expedier");


        swapFunds.clickSwapFundsElem();
        sleep(1);
        swapFunds.clickChangeCountryElem();
        sleep(1);
        swapFunds.clickCountry();
        sleep(1);
        swapFunds.enterAmount(testData.getProperty("amount"));
        sleep(1);
        swapFunds.clickSwapBtn();
        sleep(1);
        swapFunds.clickSwapBtn2();
        sleep(1);
        swapFunds.clickDashboardBtn();
        sleep(1);
        swapFunds.isSuccessMessageDisplayed();



    }

}

