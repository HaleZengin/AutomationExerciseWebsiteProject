package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MainPage;
import utilities.Driver;

public class MainPageTopButtonsStepDefinition {

    MainPage mainPage = new MainPage();


    // US0007
    @Then("kullanici Test Case butonuna tiklar")
    public void kullanici_test_case_butonuna_tiklar() {
        mainPage.testCaseButonu.click();
    }

    @Then("kullanici Test Case sayfasinin acildigini test eder")
    public void kullanici_test_case_sayfasinin_acildigini_test_eder() {
        Assert.assertTrue(mainPage.testCasePageCorrect.isDisplayed());
    }


    // US0008

    @Then("kullanici Products butonuna tiklar")
    public void kullanici_products_butonuna_tiklar() {
        mainPage.productsButonu.click();
    }

    @Then("kullanici sayfaya gittigini dogrular")
    public void kullanici_sayfaya_gittigini_dogrular() {
        Assert.assertTrue(mainPage.productsPageCorrect.isDisplayed());
    }

    @When("kullanici urun listesini gorur")
    public void kullanici_urun_listesini_gorur() {
        Assert.assertTrue(mainPage.productsAllproductsList.isDisplayed());
    }

    @Then("ilk urunun urunu goruntule butonuna tiklar")
    public void ilk_urunun_urunu_goruntule_butonuna_tiklar() {
        mainPage.viewProduct.click();
    }

    @Then("kullanici urun detay sayfasina gider")
    public void kullanici_urun_detay_sayfasina_gider() {
        Assert.assertTrue(mainPage.productInformationPage.isDisplayed());
    }

    @Then("kullanici urun detaylarinin gorunurlugunu dogrular - product name, category, price, availability, condition, brand")
    public void kullanici_urun_detaylarinin_gorunurlugunu_dogrular_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(mainPage.productName.isDisplayed());
        Assert.assertTrue(mainPage.category.isDisplayed());
        Assert.assertTrue(mainPage.price.isDisplayed());
        Assert.assertTrue(mainPage.availability.isDisplayed());
        Assert.assertTrue(mainPage.condition.isDisplayed());
        Assert.assertTrue(mainPage.brand.isDisplayed());

    }

    // US0009

    @When("kullanici Search Product kismina urun adi girer ve search butonuna tiklar")
    public void kullaniciSearchProductKisminaUrunAdiGirerVeSearchButonunaTiklar() {
        mainPage.searchProductElementi.sendKeys("Dress");
        mainPage.searchButton.click();
    }

    @Then("kullanici SEARCHED PRODUCTS yazisini gorur")
    public void kullaniciSEARCHEDPRODUCTSYazisiniGorur() {
        Assert.assertTrue(mainPage.searchedProductText.isDisplayed());
    }

    @And("baslik kisminda girdigi urun adini gorur")
    public void baslikKismindaGirdigiUrunAdiniGorur() {
        Assert.assertTrue(mainPage.dressYazisi.getText().contains("Dress"));
    }


    // US 0010

    @Then("kullanici sayfayi asagiya kaydirir")
    public void kullanici_sayfayi_asagiya_kaydirir() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN);
    }

    @Then("kullanici SUBSCRIPTION yazisinin gorunurlugunu dogrular")
    public void kullanici_subscription_yazisinin_gorunurlugunu_dogrular() {
        Assert.assertTrue(mainPage.subscriptionText.isDisplayed());
    }

    @Then("kullanici mail adresini girer ve ok dugmesine basar")
    public void kullanici_mail_adresini_girer_ve_ok_dugmesine_basar() {
        Faker faker = new Faker();
        mainPage.emailAddress.sendKeys(faker.internet().emailAddress());
        mainPage.okButonu.click();
    }

    @Then("kullanici You have been successfully subscribed! yazisini dogrular")
    public void kullanici_you_have_been_successfully_subscribed_yazisini_dogrular() {
        Assert.assertTrue(mainPage.successfullyText.isDisplayed());

    }


    // US0011
    @Then("kullanici Cart butonuna tiklar")
    public void kullaniciCartButonunaTiklar() {
        mainPage.cartButonu.click();
    }







}
