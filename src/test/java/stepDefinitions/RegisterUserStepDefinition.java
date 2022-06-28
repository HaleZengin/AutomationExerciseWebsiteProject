package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterUserStepDefinition {

    MainPage mainPage = new MainPage();

    @When("kullanici tarayiciyi baslatir")
    public void kullanici_tarayiciyi_baslatir() {
        Driver.getDriver();
    }
    @Then("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("AutomationExerciseUrl"));
    }
    @Then("sayfanin gorunur oldugunu test eder")
    public void sayfanin_gorunur_oldugunu_test_eder() {
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }
    @Then("kullanici SingUp-Login butonuna tiklar")
    public void kullanici_sing_up_login_butonuna_tiklar() {
        mainPage.singUpButonu.click();
    }
    @Then("kullanici New User Signup! yazisinin gorunurlugunu test eder")
    public void kullanici_new_user_signup_yazisinin_gorunurlugunu_test_eder() {
        Assert.assertTrue(mainPage.singUpButonu.isDisplayed());
    }

    @When("kullanici isim ve mail adresini girer")
    public void kullaniciIsimVeMailAdresiniGirer() {
        mainPage.nameBox.sendKeys("hale");
        mainPage.emailBox.sendKeys("helee@gmail.com");
    }

    @Then("Singup butonuna tiklar")
    public void singupButonunaTiklar() {
        mainPage.newUserSingupButonu.click();
    }

    @Then("acilan sayfada ENTER ACCOUNT INFORMATION yazisinin gorunurlugunu test eder")
    public void acilanSayfadaENTERACCOUNTINFORMATIONYazisininGorunurlugunuTestEder() {
        Assert.assertTrue(mainPage.createAccountPageVerification.isDisplayed());
    }
}
