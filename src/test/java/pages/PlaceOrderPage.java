package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PlaceOrderPage {

    public PlaceOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    //US0014

    @FindBy(xpath = "(//a[@data-product-id='8'])[1]")
    public WebElement addToCard;

    @FindBy(xpath = "//a[.='View Cart']")
    public WebElement viewCard;

    @FindBy(tagName = "(//h4)[2]")
    public WebElement sepettekiUrun;

    @FindBy(xpath = "//a[.='Proceed To Checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//a[.='Register / Login']")
    public WebElement registerLogin;

    @FindBy(xpath = "(//li[@class='address_country_name'])[1]")
    public WebElement adresDogrulama;

    @FindBy(tagName = "//textarea")
    public WebElement text;

    @FindBy(xpath = "//a[.='Place Order']")
    public WebElement placeOrderButonu;

    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement cardNummer;

    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvc;

    @FindBy(xpath = "//input[@name='expiry_month']")
    public WebElement month;

    @FindBy(xpath = "//input[@name='expiry_year']")
    public WebElement year;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement payandComfirm;

    @FindBy(xpath = "(//div[@class='alert-success alert'])[1]")
    public WebElement successText;

    @FindBy(xpath = "//li[.=' Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement continueButonu;




}
