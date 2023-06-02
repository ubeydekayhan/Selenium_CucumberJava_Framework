package team12.stepdefinitions;

import com.github.javafaker.Company;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import team12.pages.AutomationExercisePage;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;

public class AutomationexerciseStepDefinition {

    AutomationExercisePage automationExercisePage;
    Faker faker;


    @Given("Kullanici_{string}_sayfasina_gider")
    public void kullanici__sayfasina_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Given("Kullanici_anasayfanin_basariyla_dogrulandigini_goruntuler")
    public void kullanici_anasayfanin_basariyla_dogrulandigini_goruntuler() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Automation Exercise"));
    }


    @Given("Kullanici_kaydol_Giris_dugmesine_tiklar")
    public void kullanici_kaydolGiris_dugmesine_tiklar() {
        automationExercisePage = new AutomationExercisePage();
        automationExercisePage.kayit.click();
    }


    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @Given("Yeni_kullanici_kaydinin_gorundugu_dogrulanir")
    public void yeni_kullanici_kaydinin_gorundugu_dogrulanir() {
        automationExercisePage = new AutomationExercisePage();
        Assert.assertTrue(automationExercisePage.kayitSayfasi.isDisplayed());
    }

    @Given("Kullanici_{string}_ve_{string}_girer_ve_kaydolur")
    public void kullanici__ve__girer_ve_kaydolur(String fakerName, String email) {
        faker = new Faker();
        fakerName = faker.name().firstName();
        email = faker.internet().emailAddress();
        automationExercisePage = new AutomationExercisePage();
        automationExercisePage.kullaniciBilgileri.sendKeys(fakerName, Keys.TAB, email, Keys.TAB, Keys.ENTER);
    }

    @Given("Hesap_Bilgilerini_Girinin_gorundugunu_dogrular")
    public void hesap_bilgilerini_girinin_gorundugunu_dogrular() {
        automationExercisePage = new AutomationExercisePage();
        automationExercisePage.enterAccountInformation.isDisplayed();
    }

    @Given("Signup for our newsletter onay kutusu secilir")
    public void signupForOurNewsletterOnayKutusuSecilir() {
        automationExercisePage = new AutomationExercisePage();
        automationExercisePage.signUp.click();
    }

    @Given("Receive special offers from our partners onay kutusu secilir")
    public void receiveSpecialOffersFromOurPartnersOnayKutusuSecilir() {
        automationExercisePage = new AutomationExercisePage();
        automationExercisePage.receiveSpecial.click();
    }


    @Given("Kullanici_ayrintili_bilgileri_doldurur")
    public void kullanici_ayrintili_bilgileri_doldurur() {
        faker = new Faker();
        automationExercisePage = new AutomationExercisePage();

        String firstName = faker.name().firstName();
        String lastname = faker.name().lastName();
        String company = faker.company().toString();
        String adress = faker.address().fullAddress();
        String state = faker.address().state();
        String city = faker.address().city();
        String zipcode = faker.address().zipCode();
        String number = faker.phoneNumber().cellPhone();
        String password = faker.code() + faker.number().digits(8);

        automationExercisePage.cinsiyet.click();
        automationExercisePage.passsword.sendKeys(password, Keys.TAB);
        automationExercisePage.days.click();
        automationExercisePage.months.click();
        automationExercisePage.years.click();
        automationExercisePage.firstName.sendKeys(firstName, Keys.TAB,
                lastname, Keys.TAB,
                company, Keys.TAB,
                adress);
        automationExercisePage.country.click();
        automationExercisePage.state.sendKeys(state, Keys.TAB, city, Keys.TAB, zipcode, Keys.TAB, number,Keys.TAB,Keys.ENTER);

    }

    @Given("Kullanici_Create_Account_butonuna_tiklar")
    public void kullanici_create_account_butonuna_tiklar() {
        automationExercisePage = new AutomationExercisePage();
        automationExercisePage.createAccount.click();
        ReusableMethods.elementToBeClickable(automationExercisePage.createAccount);

        //automationExercisePage.createAccount.click();
       // Driver.getDriver().switchTo().frame("aswift_6");
       // Driver.getDriver().switchTo().defaultContent();
      //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
      //
      //wait.until(ExpectedConditions.elementToBeClickable(automationExercisePage.createAccount));
    }

    @Given("Kullanici_Account_Created_yazisinin_Gorundugunu_Dogrular")
    public void kullanici_account_created_yazisinin_gorundugunu_dogrular() {
        automationExercisePage = new AutomationExercisePage();
        ReusableMethods.visibleWait(automationExercisePage.accountCreated,20);
        Assert.assertTrue(automationExercisePage.accountCreated.isDisplayed());
    }


    @And("Kullanici_Delete_Account_Butonuna_basar")
    public void kullanici_delete_account_butonuna_basar() {
        automationExercisePage = new AutomationExercisePage();
        //automationExercisePage.continueButton.click();
        //automationExercisePage.reklamiKapat.click();
        automationExercisePage.delete.click();
        //Driver.getDriver().switchTo().alert().dismiss();


    }

    @Then("ACCOUNT_DELETED_gorunur_ve_Continueya_basar")
    public void account_deleted_gorunur_ve_continueya_basar() {
        automationExercisePage = new AutomationExercisePage();
        ReusableMethods.click(automationExercisePage.accountDeleted);
        automationExercisePage.continueButton.click();
    }

    @And("sayfayi_kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @Given("reklami_kapatir")
    public void reklami_kapatir() {
        automationExercisePage=new AutomationExercisePage();
        try {
            Robot robot = new Robot();
            robot.mouseMove(-300,200);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        /*
        if (automationExercisePage.reklamiKapat.isDisplayed()){
               // automationExercisePage.reklamiKapat.click();
                ReusableMethods.click(automationExercisePage.reklamiKapat);
            }else{
                //automationExercisePage.reklamiKapat2.click();
                ReusableMethods.click(automationExercisePage.reklamiKapat2);
            }

         */

    }

    @Given("Kullanici_continueya_basar")
    public void kullanici_continueya_basar() {
        automationExercisePage=new AutomationExercisePage();
        automationExercisePage.continueButton.click();

    }
}
