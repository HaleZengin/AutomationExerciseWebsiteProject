package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[.=' Signup / Login']")
    public WebElement singUpButonu;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement nameBox;

    @FindBy (xpath = "(//input[@name='email'])[2]")
    public WebElement emailBox;

    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement newUserSingupButonu;

    @FindBy (xpath = "//b[contains (text(),'Enter Account Information')]")
    public WebElement createAccountPageVerification;

    @FindBy(xpath = "//a[.=' Contact us']")
    public WebElement contactUsButonu;

    @FindBy(xpath = "//h2[.='Get In Touch']")
    public WebElement getInTouchText;

    // US0007
    @FindBy(xpath = "//a[.=' Test Cases']")
    public WebElement testCaseButonu;

    @FindBy(xpath = "//b[.='Test Cases']")
    public WebElement testCasePageCorrect;

    // US0008
    @FindBy(xpath = "//a[text()=' Products']")
    public WebElement productsButonu;

    @FindBy(xpath = "//img[@id='sale_image']")
    public WebElement productsPageCorrect;

    @FindBy(xpath = "//h2[text()='All Products']")
    public WebElement productsAllproductsList;

    @FindBy(xpath = "(//a[text()='View Product'])[1]")
    public WebElement viewProduct;

    @FindBy(className = "product-information")
    public WebElement productInformationPage;

    @FindBy(xpath = "//h2[.='Blue Top']")
    public WebElement productName;

    @FindBy(xpath = "//p[.='Category: Women > Tops']")
    public WebElement category;

    @FindBy(xpath = "//span[.='Rs. 500']")
    public WebElement price;

    @FindBy(xpath = "//p[text()=' In Stock']")
    public WebElement availability;

    @FindBy(xpath = "//p[text()=' New']")
    public WebElement condition;

    @FindBy(xpath = "//p[text()=' Polo']")
    public WebElement brand;

    // US0009

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchProductElementi;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchButton;

    @FindBy(xpath = "//h2[.='Searched Products']")
    public WebElement searchedProductText;

    @FindBy(xpath = "//h2[.='Sleeveless Dress']")
    public WebElement dressYazisi;

    // US0010

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subscriptionText;

    @FindBy(id = "susbscribe_email")
    public WebElement emailAddress;

    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement okButonu;

    @FindBy(xpath = "(//div[@class='alert-success alert'])[1]")
    public WebElement successfullyText;

    //US0011
    @FindBy(xpath = "//a[.=' Cart']")
    public WebElement cartButonu;

    //US0012

    @FindBy(xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement addToCard1Urun;

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShoppingButonu;

    @FindBy(xpath = "(//a[@data-product-id='2'])[1]")
    public WebElement addToCard2Urun;

    @FindBy(xpath = "//u[.='View Cart']")
    public WebElement viewCard;

    @FindBy(xpath = "//a[.='Blue Top']")
    public WebElement birinciUrununSepettekiAdi;

    @FindBy(xpath = "//a[.='Men Tshirt']")
    public WebElement ikinciUrununSepettekiAdi;

    @FindBy(xpath = "(//tbody/tr/td[3])[1]")
    public WebElement birinciUrunSepetFiyati;

    @FindBy(xpath = "(//tbody/tr/td[4])[1]")
    public WebElement birinciUrununSepettekiMiktari;

    @FindBy(xpath = "(//tbody/tr/td[5])[1]")
    public WebElement birinciUrununSepettekiToplamFiyati;

    @FindBy(xpath = "(//tbody/tr/td[3])[2]")
    public WebElement ikincirunSepetFiyati;

    @FindBy(xpath = "(//tbody/tr/td[4])[2]")
    public WebElement ikinciUrununSepettekiMiktari;

    @FindBy(xpath = "(//tbody/tr/td[5])[2]")
    public WebElement ikinciUrununSepettekiToplamFiyati;







}
