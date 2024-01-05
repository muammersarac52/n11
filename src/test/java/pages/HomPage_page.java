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



}
