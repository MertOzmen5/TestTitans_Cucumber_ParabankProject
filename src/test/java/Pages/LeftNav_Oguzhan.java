package Pages;

import StepDefinitions.US_602_OguzhanSteps;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Oguzhan extends ParentPage{

    public LeftNav_Oguzhan() {PageFactory.initElements(GWD.getDriver(),this);}

//    **************US_602_Oguzhan************
   @FindBy(css = "[name='username']")
    public WebElement username;
    @FindBy(css = "[name='password']")
    public WebElement password;
    @FindBy(css = "[value='Log In']")
    public WebElement loginButton;
    @FindBy(linkText = "Open New Account")
    public WebElement openNewAccount;
    @FindBy(linkText = "Open New Account")
    public WebElement openNewAccount2;
    @FindBy(css = "[class='logo']")
    public WebElement logo;



    public WebElement getWebElement(String strElement){

        switch (strElement){
            case "openNewAccount" : return  this.openNewAccount;
            case "openNewAccount2" : return  this.openNewAccount2;
            case "logo" : return  this.logo;

        }
        return null;
    }





}
