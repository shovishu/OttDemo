package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PlayerScreenPage {
    WebDriver driver;
    WebDriverWait driverWait;

    public PlayerScreenPage(WebDriver driver) {
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
    @FindBy(xpath = "//a[@class='movieDescription_playBtn__0LofX null']")
    WebElement playCTAonAsset;


    //Hover on Player
    @FindBy(xpath = "//div[contains(@class,'centerControllers')]//span[contains(@class,'pauseBtn')]")
    WebElement hover;
    public By element = By.xpath("//div[contains(@class,'centerControllers')]//span[contains(@class,'pauseBtn')]");


    //Title Name and Age Certifications
    @FindBy(xpath = "//div[contains(@class,'topBarPlayer')]//div//h2[string-length(normalize-space(text())) > 0]")
    WebElement tileName;
    @FindBy(xpath = "//div[contains(@class,'topBarPlayer')]//div[string-length(normalize-space(text())) > 0]")
    WebElement ageCertificate;

    //Volume
    @FindBy(xpath = "//i[contains(@class,'volumeIcon')]")
    WebElement volume;
    @FindBy(xpath = "//span[@role='slider' and @aria-label='Temperature' and @data-index='0']")
    WebElement changeVolume;


    //Language
    @FindBy(xpath = "//div[contains(@class,'bottomControlles')]//i[contains(@class,'langIcon')]")
    WebElement language;
    @FindBy(xpath = "    //ul[contains(@class,'titlesAudioHead')]//li[label/input[@type='radio' and @id='dash-audio-3']]")
    WebElement selectLanguage;
    @FindBy(xpath = "(//span[contains(@class,'applyBtnplayer')])[1]")
    WebElement closeLangModal;


    //Quality
    @FindBy(xpath = "//i[contains(@class,'settingIcon')]")
    WebElement quality;
    @FindBy(xpath = "//ul//li[label/input[@type='radio' and @id='off11']]")
    WebElement selectQuality;
    @FindBy(xpath = "//i[contains(@class,'closeQualityDropdown')]")
    WebElement closeQualityModal;


    //Speed
    @FindBy(xpath = "//i[contains(@class,'speedIcon')]")
    WebElement speed;
    @FindBy(xpath = "//li[label/input[@type='radio' and @id='speed15']]")
    WebElement selectSpeed;
    @FindBy(xpath = " (//span[contains(@class,'applyBtnplayer')])[2]")
    WebElement closeSpeedModal;


    //Play
    @FindBy(xpath = "//div[contains(@class,'centerControllers')]//span[contains(@class,'playBtn')]")
    WebElement play;


    //Pause
    @FindBy(xpath = "//div[contains(@class,'centerControllers')]//span[contains(@class,'pauseBtn')]")
    WebElement pause;


    //Player Duration
    @FindBy(xpath = "//div[contains(@class,'playerDuration')]")
    WebElement playerDuration;


    //Player Seekbar
    @FindBy(xpath = "(//span[@class='MuiSlider-rail'])[2]")
    WebElement seekbar;


    //Forward
    @FindBy(xpath = "//span[contains(@class,'forwardBtn')]")
    WebElement forward;


    //Rewind
    @FindBy(xpath = "//span[contains(@class,'rewindBtn')]")
    WebElement rewind;


    //Full Screen
    @FindBy(xpath = "//span[contains(@class, 'controllBtns') and contains(text(), 'Full Screen')]")
    WebElement fullScreen;


    //Back to Details page
    @FindBy(xpath = "//span[contains(@class,'videoBackBtn')]")
    WebElement backToAssetPage;



    public void selectProfile() {
        userProfile.click();
    }

    public void openAsset() throws InterruptedException {
        Thread.sleep(10000);
        providerClick.click();
        clickAsset.click();
    }

    public void clickPlayCTAonAsset() {
        playCTAonAsset.click();
    }

    public void setTileName(){
        tileName.isDisplayed();
        System.out.println("Content Name : " + tileName.getText());
    }

    public void setAgeCertificate(){
        ageCertificate.isDisplayed();
        System.out.println("Age Certifications : " + ageCertificate.getText());
    }

    public void setPlayerDuration(){
        driverWait.until(ExpectedConditions.presenceOfElementLocated(element));

        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();

        playerDuration.isDisplayed();
        System.out.println("Player Duration : "+ playerDuration.getText());
    }

    public boolean setSeekbar() {
        return seekbar.isDisplayed();
    }

    public boolean setForward() {
        return forward.isDisplayed();
    }

    public boolean setRewind() {
        return rewind.isDisplayed();
    }

    //Methods for Player Controls
    public void setSettings() {
        quality.click();
        System.out.println("Quality");
        selectQuality.click();
        System.out.println("Quality changed....to 720");
        closeQualityModal.click();
        System.out.println("Close Language Modals");
    }

    public void setLanguage() {
        driverWait.until(ExpectedConditions.presenceOfElementLocated(element));

        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();
        language.click();
        System.out.println("Language");
        selectLanguage.click();
        System.out.println("Language changed....to Hindi");
        closeLangModal.click();
        System.out.println("Close Language Modals");
    }

    public void setSpeed() {
        driverWait.until(ExpectedConditions.presenceOfElementLocated(element));

        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();
        speed.click();
        System.out.println("Language");
        selectSpeed.click();
        System.out.println("Speed changed....to 2X");
        closeSpeedModal.click();
        System.out.println("Close Speed Modals");
    }

    public void setVolume() {
        driverWait.until(ExpectedConditions.presenceOfElementLocated(element));

        Actions actions = new Actions(driver);
        actions.moveToElement(volume).perform();

        Actions action = new Actions(driver);
        action.moveToElement(changeVolume).perform();
        action.clickAndHold(changeVolume).moveByOffset(0, 50).release().perform(); // Adjust offset as needed
        System.out.println("Slider moved successfully.");
    }

    public void setPause() {
        driverWait.until(ExpectedConditions.presenceOfElementLocated(element));

        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();
        pause.click();
        System.out.println("Video Paused...");
    }

    public void setPlay() {
        play.click();
        System.out.println("Video Played...");
    }

    public void setFullScreen() {
        fullScreen.click();
    }

    public void setBackToAssetPage() {
        backToAssetPage.click();
    }

}


//    @FindBy(xpath = "");
//    WebElement nextEpisode;
