package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
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


    // US002

    LoginPage loginPage = new LoginPage();

    @Then("kullanici Login to your account yazisinin gorunurlugunu test eder")
    public void kullanici_login_to_your_account_yazisinin_gorunurlugunu_test_eder() {
        Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }
    @When("kullanici dogru {string} ve {string} girer")
    public void kullanici_dogru_ve_girer(String email, String password) {
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("email"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }
    @Then("kullanici Login butanuna tiklar")
    public void kullanici_login_butanuna_tiklar() {
        loginPage.loginButon.click();
    }
    @Then("Logged in as username yazisinin gorunur oldugunu test eder")
    public void logged_in_as_username_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(loginPage.loggedinText.isDisplayed());
    }


    // US003

    @And("kullanici {string} ve {string} girer")
    public void kullaniciVeGirer(String invalidEmail, String invalidPassword) {
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("invalidEmail"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("invalidPassword"));
    }

    @And("kullanici Your email or password is incorrect! yazisini gorur")
    public void kullaniciYourEmailOrPasswordIsIncorrectYazisiniGorur() {
         Assert.assertTrue(loginPage.incorrectText.isDisplayed());
    }

    // US004

    @When("kullanici Logout butonuna tiklar")
    public void kullaniciLogoutButonunaTiklar() {
        loginPage.logoutButon.click();
    }

    @Then("kullanici login sayfasina dondugunu test eder")
    public void kullaniciLoginSayfasinaDondugunuTestEder() {
        Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }

    // US005

    @And("kullanici Email Address already exist! yazisini gorur")
    public void kullaniciEmailAddressAlreadyExistYazisiniGorur() {
        Assert.assertTrue(loginPage.existEmail.isDisplayed());
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();

    }

    //US006

    @Then("kullanici Contact Us butonuna tiklar")
    public void kullaniciContactUsButonunaTiklar() {

        mainPage.contactUsButonu.click();
    }

    @Then("kullanici GET IN TOUCH yazisini gorur")
    public void kullaniciGETINTOUCHYazisiniGorur() {

        Assert.assertTrue(mainPage.getInTouchText.isDisplayed());
    }




}
