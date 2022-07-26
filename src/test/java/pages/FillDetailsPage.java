package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;

public class FillDetailsPage {

    public FillDetailsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id= "uniform-id_gender1")
    public WebElement genderBox;

    @FindBy(id= "password")
    public WebElement passwordBox;

    @FindBy(id="days")
    public WebElement dayDropdown;

    @FindBy(id="months")
    public WebElement monthDropdown;

    @FindBy(id="years")
    public WebElement yearDropdown;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletterSignupBox;

    @FindBy(id="optin")
    public WebElement specialOfferBox;

    @FindBy(id="first_name")
    public WebElement firstNameBox;

    @FindBy(id="last_name")
    public WebElement lastNameBox;

    @FindBy(id= "company")
    public WebElement companyBox;

    @FindBy(id="address1")
    public WebElement addressBox;

    @FindBy(id="country")
    public WebElement countryDropdown;

    @FindBy(id="state")
    public WebElement stateBox;

    @FindBy(id="city")
    public WebElement cityBox;

    @FindBy(id="zipcode")
    public WebElement zipcodeBox;

    @FindBy(id="mobile_number")
    public WebElement mobileNumberBox;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedText;

    //US006

    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subject;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement message;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submit;

    @FindBy(xpath = "(//div[.='Success! Your details have been submitted successfully.'])[1]")
    public WebElement successText;

    @FindBy(xpath = "//span[.=' Home']")
    public WebElement home;







}
