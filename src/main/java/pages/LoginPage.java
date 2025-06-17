package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "(//div[contains(text(),'Login/Register')])[1]")
    public WebElement LoginRegisterCTA;
    @FindBy(xpath = "//a[@class='logo']")
    public WebElement logo;
    @FindBy(xpath = "//div[@class='title']")
    public WebElement pageTitle;
    @FindBy(xpath = "(//input[@id='phoneEmail'])[1]")
    public WebElement mobileNumber;
    @FindBy(xpath = "//input[@id='btSubmit']")
    public WebElement proceed;
    @FindBy(xpath = "(//input[@id='upass'])[1]")
    public WebElement password;
    @FindBy(xpath = "//input[@id='btnLogin']")
    public WebElement login;
    @FindBy(xpath = "//a[@id='forgotPasswordLink']")
    public WebElement forgetPasswordLink;
    @FindBy(xpath = "//a[@alt='Google']")
    public WebElement loginWithGoogle;
    @FindBy(xpath = "//a[@alt='Apple Login']")
    public WebElement loginWithApple;
    @FindBy(xpath = "(//h1[normalize-space()=\"Who's watching?\"])[1]")
    WebElement loginSuccessful;
    @FindBy(xpath = "//img[@alt='Vishwajeet']")
    WebElement profile;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean verifyLoginRegisterCTA() {
        return LoginRegisterCTA.isDisplayed();
    }
    public void verifyLoginClick() {
        LoginRegisterCTA.click();
    }
    public void verifyLogo() {
        logo.isDisplayed();
    }
    public void verifyTitle() {
        pageTitle.isDisplayed();
    }
    public void verifyLogin(String Mobile, String Password) {
        mobileNumber.sendKeys(Mobile);
        proceed.click();
        password.sendKeys(Password);
        login.click();
    }
    public void forgetPassword(String mobile) {
        mobileNumber.sendKeys(mobile);
        proceed.click();
        forgetPasswordLink.isDisplayed();
    }
    public boolean verifyGoogleLoginOption() {
        return loginWithGoogle.isDisplayed();
    }
    public boolean verifyAppleLoginOption() {
        return loginWithApple.isDisplayed();
    }
    public boolean verifyLoginIsSuccessful() {
        return loginSuccessful.isDisplayed();
    }
    public void verifyProfileSelected() {
        profile.click();
    }

    public PlayerScreenPage Login(String Username, String Password) {
        LoginRegisterCTA.click();
        mobileNumber.sendKeys(Username);
        proceed.click();
        password.sendKeys(Password);
        login.click();

        return new PlayerScreenPage(driver);
    }

    public AssetDetailsPage assetDetailsPage(String Username, String Password) {
        LoginRegisterCTA.click();
        mobileNumber.sendKeys(Username);
        proceed.click();
        password.sendKeys(Password);
        login.click();

        return new AssetDetailsPage(driver);
    }

}

