package Tests;

import BaseClasses.TestBase;
import Pages.expedierLoginPage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentReports.ExtentTestManager.startTest;

public class expedierLoginTest extends TestBase {
    expedierLoginPage login;

    public void initializer (){
        login = new expedierLoginPage(driver);

    }

    @Test(priority = 1, description = "User Login on Expedier")
    public void Validate_User_login (Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "Expedier");

        initializer();
        System.out.println("starting starting");


        login.enterEmail(testData.getProperty("userEmail"));
        sleep(1);
        login.enterPassword(testData.getProperty("password"));
        sleep(1);
        login.clickLoginBtn();
        sleep(1);
        login.isAllHistoryDisplayed();
        sleep(1);



    }

}

