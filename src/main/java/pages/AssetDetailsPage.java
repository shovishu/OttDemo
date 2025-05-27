package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AssetDetailsPage {

    WebDriver driver;
    WebDriverWait driverWait;

    public AssetDetailsPage(WebDriver driver) {
        this.driver = driver;
        this.driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }

    //Navigation to Player Screen
    @FindBy(xpath = "//img[@alt='Vishwajeet']")
    WebElement userProfile;
    @FindBy(xpath = "//img[@alt='SonyLIV']")
    WebElement providerClick;
    @FindBy(xpath = "(//img[@alt='banner'])[7]")
    WebElement clickAsset;


    @FindBy(xpath = "//div[@class='movieDescription_pageHeadMp__UlfUz' and h1]")
    WebElement titleName;
    @FindBy(xpath = "//ul[@class='movieDescription_movieType__pq1IU']//li[@class='movieDescription_vsLiProvider__MHYvL']")
    WebElement provider;
    @FindBy(xpath = "//ul[@class='movieDescription_movieType__pq1IU']//li")
    WebElement genre;
//    for (WebElement item : allItems) {
//        System.out.println(item.getText());
//    }

    @FindBy(xpath = "//ul[@class='movieDescription_ratingInfo__7n2xj']//li[1]")
    WebElement language;
    @FindBy(xpath = "//ul[@class='movieDescription_ratingInfo__7n2xj']//li[2]")
    WebElement releaseYear;
    @FindBy(xpath = "//ul[@class='movieDescription_ratingInfo__7n2xj']//li[3]")
    WebElement ageCertificate;
    @FindBy(xpath = "//ul[@class='movieDescription_ratingInfo__7n2xj']//li[4]")
    WebElement timeDuration;
    @FindBy(xpath = "//b[contains(text(), 'OTT Release date')]/following-sibling::span")
    WebElement OTTreleaseDate;
    @FindBy(xpath = "//p[@class='movieDescription_readMoreFunction__D00uu']")
    WebElement synopsis;
    @FindBy(xpath = "//a[@class='movieDescription_playBtn__0LofX null']")
    WebElement play_resume_upgrade_subscribe;
    @FindBy(xpath = "(//div[@class='undefined__main ottplay-372'])[1]")
    WebElement trailer_poster;
//    @FindBy(xpath = "")
//    WebElement muteNunmute_trailer;
//    @FindBy(xpath = "")
//    WebElement fullscreen_trailer;
//    @FindBy(xpath = "")
//    WebElement playPause_trailer;
    @FindBy(xpath = "//div[@class='UserReview_wrapUserReview__EGf1K']")
    WebElement ReviewRatings;
    @FindBy(xpath = "//div[@class='SimilarMovies_text__uN48d']")
    WebElement similarRecommendations;
    @FindBy(xpath = "//ul[@class='movieDescription_movieActions__B9luk']//b[contains(text(),'Watchlist')]")
    WebElement watchlist;
    @FindBy(xpath = "//ul[@class='movieDescription_movieActions__B9luk']//b[contains(text(),'Like')]")
    WebElement like;
    @FindBy(xpath = "//ul[@class='movieDescription_movieActions__B9luk']//b[contains(text(),'Dislike')]")
    WebElement dislike;
    @FindBy(xpath = "//ul[@class='movieDescription_movieActions__B9luk']//b[contains(text(),'Share')]")
    WebElement share;



    public void selectProfile() {
        userProfile.click();
    }

    public void openAsset() throws InterruptedException {
        Thread.sleep(10000);
        providerClick.click();
        clickAsset.click();
    }


    public boolean setTitleName() {
        return titleName.isDisplayed();
    }
    public boolean setProvider() {
        return provider.isDisplayed();
    }
    public boolean setGenre() {
        return genre.isDisplayed();
    }
    public boolean setLanguage() {
        return language.isDisplayed();
    }
    public boolean setReleaseYear() {
        return releaseYear.isDisplayed();
    }
    public boolean setAgeCertificate() {
        return ageCertificate.isDisplayed();
    }
    public boolean setTimeDuration() {
        return timeDuration.isDisplayed();
    }
    public boolean setOTTreleaseDate() {
        return OTTreleaseDate.isDisplayed();
    }
    public boolean setSynopsis() {
        return synopsis.isDisplayed();
    }
    public boolean setPlay_resume_upgrade_subscribe() {
        return play_resume_upgrade_subscribe.isDisplayed();
    }
    public boolean setTrailer_poster() {
        return trailer_poster.isDisplayed();
    }
    public boolean setReviewRatings() {
        return ReviewRatings.isDisplayed();
    }
    public boolean setSimilarRecommendations() {
        return similarRecommendations.isDisplayed();
    }
    public boolean setWatchlist() {
        return watchlist.isDisplayed();
    }
    public boolean setLike() {
        return like.isDisplayed();
    }
    public boolean setDislike() {
        return dislike.isDisplayed();
    }
    public boolean setShare() {
        return share.isDisplayed();
    }
}


