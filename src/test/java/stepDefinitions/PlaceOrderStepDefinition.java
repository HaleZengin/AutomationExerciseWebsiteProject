package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.PlaceOrderPage;
import utilities.Driver;

public class PlaceOrderStepDefinition {


    PlaceOrderPage placeOrderPage = new PlaceOrderPage();

    // US0014

    @Then("kullanici ana sayfadan herhangi bir urunu sepete ekler")
    public void kullanici_ana_sayfadan_herhangi_bir_urunu_sepete_ekler()  {
        placeOrderPage.addToCard.click();
        placeOrderPage.viewCard.click();

    }

    @Then("kullanici sectigi urunun sepette oldugunu dogrular")
    public void kullanici_sectigi_urunun_sepette_oldugunu_dogrular() {
        Assert.assertTrue(placeOrderPage.sepettekiUrun.getText().contains("Fancy Green Top"));
    }

    @Then("kullanici Proceed To Checkout butonuna tiklar")
    public void kullanici_proceed_to_checkout_butonuna_tiklar() {
        placeOrderPage.proceedToCheckout.click();
    }

    @When("kullanici Register  Login butonuna tiklar")
    public void kullanici_register_login_butonuna_tiklar() {
        placeOrderPage.registerLogin.click();
    }

    @Then("kullanici adres bilgilerini ve siparisi dogrular")
    public void kullanici_adres_bilgilerini_ve_siparisi_dogrular() {
        Assert.assertTrue(placeOrderPage.sepettekiUrun.getText().contains("Fancy Green Top"));
        Assert.assertTrue(placeOrderPage.adresDogrulama.getText().contains("Canada"));
    }

    @Then("kullanici text kismina aciklama girer ve Place Order butonuna tiklar")
    public void kullanici_text_kismina_aciklama_girer_ve_place_order_butonuna_tiklar() {
        placeOrderPage.text.sendKeys("Siparisin bu hafta elime ulasmasini istiyorum.");
        placeOrderPage.placeOrderButonu.click();
    }

    @Then("kullanici odeme ayrintilarini doldurur")
    public void kullanici_odeme_ayrintilarini_doldurur() {
        placeOrderPage.nameOnCard.sendKeys("Haleee");
        placeOrderPage.cardNummer.sendKeys("123456789");
        placeOrderPage.cvc.sendKeys("123");
        placeOrderPage.month.sendKeys("10");
        placeOrderPage.year.sendKeys("2024");

    }

    @Then("kullanici Pay and Confirm Order butonuna tiklar")
    public void kullanici_pay_and_confirm_order_butonuna_tiklar() {
        placeOrderPage.payandComfirm.click();
    }

    @Then("kullanici Your order has been placed successfully! yazisini gorur")
    public void kullanici_your_order_has_been_placed_successfully_yazisini_gorur() {
        Assert.assertTrue(placeOrderPage.successText.isDisplayed());
    }

    @And("kullanici Account Deleted! yazisini gorur ve Continue butonuna tiklar")
    public void kullaniciAccountDeletedYazisiniGorurVeContinueButonunaTiklar() {
        Assert.assertTrue(placeOrderPage.deleteAccount.isDisplayed());
        placeOrderPage.continueButonu.click();
    }

}
