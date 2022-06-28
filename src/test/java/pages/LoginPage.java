package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    // US002

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginYourAccountText;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButon;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedinText;

    // US003 invalidEmail , invalidPassword

    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    public WebElement incorrectText;

    // US004

    @FindBy(xpath = "//a[.=' Logout']")
    public WebElement logoutButon;

    // US005

    @FindBy(xpath = "//p[.='Email Address already exist!']")
    public WebElement existEmail;


}
