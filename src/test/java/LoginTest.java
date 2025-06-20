import baseClass.BaseTest;
import utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.lang.reflect.Method;

public class LoginTest extends BaseTest {

    public String userMobile = ConfigReader.getProperty("mobileNumber");
    public String userPassword = ConfigReader.getProperty("password");
    LoginPage loginPage;

    @BeforeMethod
    public void browserLaunch(Method method) {
        initialization();
        loginPage = new LoginPage(driver);
        System.out.println("🔹 Executing Test Method: " + method.getName());
    }

    @Test
    public void verifyLoginRegisterCTA() {
        Assert.assertTrue(loginPage.verifyLoginRegisterCTA());
        loginPage.verifyLoginClick();
    }
    @Test
    public void verifyProductLogo() {
        loginPage.verifyLoginClick();
        loginPage.verifyLogo();
    }
    @Test
    public void verifyPageTitle() {
        loginPage.verifyLoginClick();
        loginPage.verifyTitle();
    }
    @Test
    public void verifyForgetPasswordCTA() {
        loginPage.verifyLoginClick();
        loginPage.forgetPassword(userMobile);
    }
    @Test
    public void verifyGoogleLoginAvailable() {
        loginPage.verifyLoginClick();
        loginPage.verifyGoogleLoginOption();
        Assert.assertTrue(loginPage.verifyGoogleLoginOption(), "Login with GOOGLE option is not present on the pagee");
    }
    @Test
    public void verifyAppleLoginAvailable() {
        loginPage.verifyLoginClick();
        loginPage.verifyAppleLoginOption();
        Assert.assertTrue(loginPage.verifyAppleLoginOption(), "Login with APPLE option is not present on the page");
    }
    @Test
    public void verifyProfileSelect() {
        loginPage.verifyLoginClick();
        loginPage.verifyLogin(userMobile, userPassword);
        loginPage.verifyProfileSelected();
    }
    @Test
    public void verifyLoginSuccessful() {
        loginPage.verifyLoginClick();
        loginPage.verifyLogin(userMobile, userPassword);
        System.out.println("Logged in with :" + userMobile + "/" + userPassword);
        Assert.assertTrue(loginPage.verifyLoginIsSuccessful());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

