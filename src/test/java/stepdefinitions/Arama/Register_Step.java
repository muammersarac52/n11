package stepdefinitions.Arama;

import io.cucumber.java.en.And;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.HomPage_page;
import utilities.Driver;

import static utilities.Driver.getDriver;

public class Register_Step {
    HomPage_page page=new HomPage_page();
    Actions actions=new Actions(getDriver());
    @And("MS Uye ol butonuna tiklar")
    public void msUyeOlButonunaTiklar() {
        page.uyeOl.click();
    }

    @And("MS Acilan sayfayi dogrular")
    public void msAcilanSayfayiDogrular() {
        assert page.hosgeldiniz.isDisplayed();
    }

    @And("MS Aramaya {string} ad yazarAnd")
    public void msAramayaAdYazarAnd(String string) {
        actions.sendKeys(page.ad,"ad");
    }

    @And("MS Aramaya {string} soyAd yazar")
    public void msAramayaSoyAdYazar(String arg0) {
    }

    @And("MS Aramaya {string} eMail yazar")
    public void msAramayaEMailYazar(String arg0) {
    }

    @And("MS Aramaya {string} tel yazar")
    public void msAramayaTelYazar(String arg0) {
    }

    @And("MS Aramaya {string} sifre yazar")
    public void msAramayaSifreYazar(String arg0) {
    }

    @And("{string}cinsiyet secer")
    public void cinsiyetSecer(String arg0) {
    }

    @And("Tiklamalari yapar")
    public void tiklamalariYapar() {
    }

    @And("numarani dogrula tusuna basar")
    public void numaraniDogrulaTusunaBasar() {
    }
}
