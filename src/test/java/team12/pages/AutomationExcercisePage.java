package team12.pages;

import org.openqa.selenium.support.PageFactory;
import team12.utilities.Driver;


public class AutomationExcercisePage {

    public AutomationExcercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement kayit;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement kayitSayfasi;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement kullaniciBilgileri;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountInformation;


    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement cinsiyet;


    @FindBy(xpath = "//input[@type='password']")
    public WebElement passsword;

    @FindBy(xpath = "((//*[@id='days'])//option)[5]")
    public WebElement days;

    @FindBy(xpath = "((//*[@id='months'])//option)[5]")
    public WebElement months;

    @FindBy(xpath = "((//*[@id='years'])//option)[25]")
    public WebElement years;

    @FindBy(xpath= "//*[text()='Sign up for our newsletter!']")
    public WebElement signUp;

    @FindBy(xpath= "//*[text()='Receive special offers from our partners!']")
    public WebElement receiveSpecial;

    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[text()='United States']")
    public WebElement country;

    @FindBy(xpath = "//*[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccount;


    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreated;

    @FindBy(xpath = "//*[@id='dismiss-button']")
    public WebElement reklamiKapat;


    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement accountDeleted;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement delete;
}
