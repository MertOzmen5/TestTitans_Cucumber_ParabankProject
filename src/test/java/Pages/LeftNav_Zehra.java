package Pages;

import Utilities.GWD;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Zehra extends ParentPage{
    public LeftNav_Zehra() {
        PageFactory.initElements(GWD.getDriver(),this);}
    @FindBy(css = "[name='username']")
    public WebElement username;
    @FindBy(css = "[name='password']")
    public WebElement password;
    @FindBy(css = "[value='Log In']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[@id='leftPanel']/ul/li[4]")
    public WebElement billPay;
    @FindBy(xpath = "//div[@id='leftPanel']/ul/li[2]")
    public WebElement accountOverview;
    @FindBy(xpath = "//tr[@class='ng-scope'][2]/td/a")
    public WebElement accountClick;


    public WebElement getWebElement(String strElement){

        switch (strElement){
            case "billPay" : return  this.billPay;
            case "accountOverview" : return  this.accountOverview;
            case "accountClick" : return  this.accountClick;

        }
        return null;
    }

}
