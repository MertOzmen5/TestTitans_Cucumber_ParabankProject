package Pages;

import Utilities.GWD;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Zehra {
    public LeftNav_Zehra() {
        PageFactory.initElements(GWD.getDriver(),this);}
    @FindBy(xpath = "//div[@id='leftPanel']/ul/li[4]")
    public WebElement billPay;
    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement payeeName;



    public WebElement getWebElement(String strElement){

        switch (strElement){
            case "billPay" : return  this.billPay;
            case "payeeName" : return  this.payeeName;


        }
        return null;
    }

}
