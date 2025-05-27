import baseClass.BaseTest;
import utils.ConfigReader;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AssetDetailsPage;
import pages.LoginPage;

public class AssetDetailsTest extends BaseTest {

    public String user_mobile = ConfigReader.getProperty("mobileNumber");
    public String user_password = ConfigReader.getProperty("password");
    LoginPage loginPage;
    AssetDetailsPage assetDetailsPage;

    @BeforeTest
    public void browserLaunch() throws InterruptedException {
        initialization();
        loginPage = new LoginPage(driver);
        assetDetailsPage = loginPage.assetDetailsPage(user_mobile,user_password);
        assetDetailsPage.selectProfile();
        assetDetailsPage.openAsset();
    }

    @Test
    public void verifyTitle(){
        assetDetailsPage.setTitleName();
    }
    @Test
    public void verifyProvider(){
        assetDetailsPage.setProvider();
    }
    @Test
    public void verifyGenre(){
        assetDetailsPage.setGenre();
    }
    @Test
    public void verifyLanguage(){
        assetDetailsPage.setLanguage();
    }
    @Test
    public void verifyReleaseYear(){
        assetDetailsPage.setReleaseYear();
    }
    @Test
    public void verify(){
        assetDetailsPage.setTitleName();
    }
    @Test
    public void verifyAgeCertification(){
        assetDetailsPage.setAgeCertificate();
    }
    @Test
    public void verifyTimeDuration(){
        assetDetailsPage.setTimeDuration();
    }
    @Test
    public void verifyOTTReleaseDate(){
        assetDetailsPage.setOTTreleaseDate();
    }    @Test
    public void verifySynopsis(){
        assetDetailsPage.setSynopsis();
    }
    @Test
    public void verifyPlayCTA(){
        assetDetailsPage.setPlay_resume_upgrade_subscribe();
    }
    @Test
    public void verifyTrailers(){
        assetDetailsPage.setTrailer_poster();
    }
    @Test
    public void verifyReviewsAndRatings(){
        assetDetailsPage.setReviewRatings();
    }
    @Test
    public void verifySimilarRecommendations(){
        assetDetailsPage.setSimilarRecommendations();
    }
    @Test
    public void verifyWatchlistCTA(){
        assetDetailsPage.setWatchlist();
    }
    @Test
    public void verifyLikeCTA(){
        assetDetailsPage.setLike();
    }
    @Test
    public void verifyDislikeCTA(){
        assetDetailsPage.setDislike();
    }
    @Test
    public void verifyShareCTA(){
        assetDetailsPage.setShare();
    }

}
