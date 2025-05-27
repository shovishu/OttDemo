import baseClass.BaseTest;
import utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PlayerScreenPage;

public class PlayerScreenTest extends BaseTest {

    public String user_mobile = ConfigReader.getProperty("mobileNumber");
    public String user_password = ConfigReader.getProperty("password");
    LoginPage loginPage;
    PlayerScreenPage playerPage;

    @BeforeTest
    public void browserLaunch() throws InterruptedException {
        initialization();
        loginPage = new LoginPage(driver);
        playerPage = loginPage.Login(user_mobile,user_password);
        playerPage.selectProfile();
        playerPage.openAsset();
        playerPage.clickPlayCTAonAsset();
    }


    @Test(priority = 0)
    public void verifyPause() {
        playerPage.setPause();
    }
    @Test(priority = 1)
    public void verifyPlay(){
        playerPage.setPlay();
    }
    @Test(priority = 2)
    public void verifyLanguage(){
        playerPage.setLanguage();
    }
    @Test(priority = 3)
    public void verifySetting(){
        playerPage.setSettings();
    }
    @Test(priority = 4)
    public void verifySpeed(){
        playerPage.setSpeed();
    }
    @Test(priority = 5)
    public void verifyVolume(){
        playerPage.setVolume();
    }
    @Test(priority = 6)
    public void verifyPlayerTitle(){
        playerPage.setTileName();
    }
    @Test(priority = 7)
    public void verifyAgeCertificate(){
        playerPage.setAgeCertificate();
    }
    @Test(priority = 8)
    public void verifyPlayerDurations(){
        playerPage.setPlayerDuration();
    }
    @Test(priority = 9)
    public void verifySeekbar(){
        Assert.assertTrue(playerPage.setSeekbar());
    }
    @Test(priority = 10)
    public void verifyForwardRewind(){
        Assert.assertTrue(playerPage.setRewind());
        Assert.assertTrue(playerPage.setForward());
    }
    @Test(priority = 11)
    public void verifyBackToAssetPage(){
        playerPage.setBackToAssetPage();
    }
    @Test(priority = 12)
    public void verifyFullScreen(){
        playerPage.setFullScreen();
    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }

}

