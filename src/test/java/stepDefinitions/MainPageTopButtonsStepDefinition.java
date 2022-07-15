package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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

    // US0012

    @When("kullanici ilk urunu sepete ekler")
    public void kullanici_ilk_urunu_sepete_ekler() {
        mainPage.addToCard1Urun.click();
    }
    @Then("kullanici Continue Shopping butonuna tiklar")
    public void kullanici_continue_shopping_butonuna_tiklar() {
        mainPage.continueShoppingButonu.click();
    }
    @Then("kullanici ikinci urunu sepete ekler")
    public void kullanici_ikinci_urunu_sepete_ekler() {
        mainPage.addToCard2Urun.click();
    }
    @Then("kullanici View Cart butonuna tiklar")
    public void kullanici_view_cart_butonuna_tiklar() {
        mainPage.viewCard.click();
    }
    @Then("kullanici sectigi iki urunun de sepette oldugunu dogrular")
    public void kullanici_sectigi_iki_urunun_de_sepette_oldugunu_dogrular() {
        String birinciUrunSepette=mainPage.birinciUrununSepettekiAdi.getText();
        String ikinciUrunSepette=mainPage.ikinciUrununSepettekiAdi.getText();
        Assert.assertTrue(birinciUrunSepette.contains("Blue Top"));
        Assert.assertTrue(ikinciUrunSepette.contains("Men Tshirt"));

    }
    @Then("kullanici fiyatini, toplam fiyatini ve urun miktaini dogrular")
    public void kullanici_fiyatini_toplam_fiyatini_ve_urun_miktaini_dogrular() {
        String price1 = (mainPage.birinciUrunSepetFiyati.getText());
        String quantity1 = (mainPage.birinciUrununSepettekiMiktari.getText());
        String total1 = (mainPage.birinciUrununSepettekiToplamFiyati.getText());

        String price2 = (mainPage.ikincirunSepetFiyati.getText());
        String quantity2 = (mainPage.ikinciUrununSepettekiMiktari.getText());
        String total2 = (mainPage.ikinciUrununSepettekiToplamFiyati.getText());

        Assert.assertTrue(price1.contains("Rs. 500"));
        Assert.assertTrue(quantity1.contains("1"));
        Assert.assertTrue(total1.contains("Rs. 500"));
        Assert.assertTrue(price2.contains("Rs. 400"));
        Assert.assertTrue(quantity2.contains("1"));
        Assert.assertTrue(total2.contains("Rs. 400"));

        System.out.println("Sepetteki urun fiyati, miktari ve toplam fiyati dogru!");
    }


    // US0013

    @Then("kullanici ana sayfadan herhangi bir urunun View Product butonuna tiklar")
    public void kullanici_ana_sayfadan_herhangi_bir_urunun_view_product_butonuna_tiklar() {
        mainPage.herhangibirUrununDetayi.click();
    }

    @When("kullanici urun detay sayfasinin acildigini dogrular")
    public void kullanici_urun_detay_sayfasinin_acildigini_dogrular() {
        Assert.assertTrue(mainPage.urunResmi.isDisplayed());
    }
    @Then("kullanici urun miktarini dorde cikarir")
    public void kullanici_urun_miktarini_dorde_cikarir() {
        mainPage.urunQuantity.sendKeys(Keys.UP, Keys.UP, Keys.UP);
    }
    @Then("kullanici Add to Card butonuna basar")
    public void kullanici_add_to_card_butonuna_basar() {
        mainPage.addToCard.click();
    }
    @Then("kullanici urun miktarinin sectigi miktarla esit oldugunu test eder")
    public void kullanici_urun_miktarinin_sectigi_miktarla_esit_oldugunu_test_eder() {
        Assert.assertTrue(mainPage.sepetQuantity.getText().contains("4"));
    }











}
