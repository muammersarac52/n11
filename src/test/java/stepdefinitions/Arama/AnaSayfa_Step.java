package stepdefinitions.Arama;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.HomPage_page;
import utilities.Driver;

import static utilities.ReusableMethods.closePopUp;
import static utilities.ReusableMethods.navigateToUrl;

public class AnaSayfa_Step {
    HomPage_page page = new HomPage_page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("MS Kullanici url gider")
    public void ms_kullanici_url_gider() {
        navigateToUrl();
        closePopUp();
    }

    @When("MS Ana sayfayi dogrular")
    public void ms_ana_sayfayi_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("n11");
    }

    @And("MS aramaya {string} urunler yazar")
    public void msAramayaYazar(String urunler) {
        page.arama.sendKeys(urunler);
        page.closeCookie.click();
        page.aramaTikla.click();


    }

    @When("MS acilan sayfayi dogrular")
    public void ms_acilan_sayfayi_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("telefon");



    }


}
