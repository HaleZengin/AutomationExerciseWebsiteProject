package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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




}
