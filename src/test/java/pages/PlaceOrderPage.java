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
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvc;

    @FindBy(xpath = "//input[@name='expiry_month']")
    public WebElement month;

    @FindBy(xpath = "//input[@name='expiry_year']")
    public WebElement year;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement payAndComfirm;

    @FindBy(xpath = "(//div[@class='alert-success alert'])[1]")
    public WebElement successText;

    @FindBy(xpath = "//li[.=' Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement continueButonu;


    // US0015

    @FindBy(xpath = "//b[.='HALE']")
    public WebElement girisYapildiginiDogrulama;

    @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement sepeteurunEkleme;

    @FindBy(xpath = "(//a[@href='/view_cart'])[2]")
    public WebElement viewCardButonu;

    @FindBy(xpath = "//li[.='Shopping Cart']")
    public WebElement sepetSayfasininGorunurlugu;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement proceedToChechoutButonu;

    @FindBy(xpath = "(//li[@class='address_country_name'])[1]")
    public WebElement country;

    @FindBy(xpath = "//a[.='Blue Top']")
    public WebElement sepettekiUrunn;

    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement textKismi;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement placeOrder;








}
