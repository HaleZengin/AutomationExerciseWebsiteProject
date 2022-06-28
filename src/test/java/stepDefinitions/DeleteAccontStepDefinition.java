package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DeleteAccountPage;
import utilities.Driver;

public class DeleteAccontStepDefinition {

    DeleteAccountPage deleteAccountPage = new DeleteAccountPage();

    @When("kullanici Continue butonuna basar")
    public void kullanici_continue_butonuna_basar() {
        deleteAccountPage.continueButton.click();
    }
    @Then("sag ustte olan Logged in as username yazisini gorur")
    public void sagUstteOlanLoggedInAsUsernameYazisiniGorur() {
        Assert.assertTrue(deleteAccountPage.loggedinText.isDisplayed());
    }
    @Then("kullanici Delete Account butonuna tiklar")
    public void kullanici_delete_account_butonuna_tiklar() {
        deleteAccountPage.deleteButton.click();
    }
    @And("kullanici hesabin silindigini test eder")
    public void kullaniciHesabinSilindiginiTestEder() {
        String pageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(pageUrl.contains("delete_account"));
    }
}
