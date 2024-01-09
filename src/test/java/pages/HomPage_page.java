package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomPage_page {
    public HomPage_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='12dd678f-aa17-46d1-9382-09490182dc8f']")
    public WebElement closePopUp;
    //*[@data-name='Settings Button']

    @FindBy(xpath = "(//*[@class='dn-slide-accept-btn'])[1]")
    public WebElement closeCookie;

 @FindBy(xpath = " //input[@id='searchData']")
    public WebElement arama;

    @FindBy(xpath = "//*[@class='iconsSearch']")
    public WebElement aramaTikla;

    @FindBy(xpath = "//*[@id='p-584158827']/div/a/div/img")
    public WebElement birinciUrun;

    @FindBy(xpath = "(//a[@href='https://www.n11.com/uye-ol'])[1]")
    public WebElement uyeOl;

    @FindBy(xpath = "//*[@id='contentWrapper']")
    public WebElement hosgeldiniz;



    @FindBy(xpath = "//div[@class='btnPrimary agreement-button']")
    public WebElement musteriAydinlatmaMetni;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement ad;

    @FindBy(xpath = "//label[@for='registrationEmail']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement telNo;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement cinsiyet;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement guvenlikKodu;

    @FindBy(xpath = "//label[@for='acceptContract']")
    public WebElement uyelikSozlesmesi;

    @FindBy(xpath = "//label[@for='sendPromotionalMailAndSms']")
    public WebElement hizmettenHaberdarOlma;

    @FindBy(xpath = "//div[@id='submitButton']")
    public WebElement numarayiDogrula;

    @FindBy(xpath = "//a[@class='google-login-btn']")
    public WebElement google;

    @FindBy(xpath = "//div[@class='facebook_large medium facebookBtn btnSignUp']")
    public WebElement facebok;

    @FindBy(xpath = "//a[@class='apple-login-btn']")
    public WebElement apple;





}
