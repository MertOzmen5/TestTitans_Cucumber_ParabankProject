package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Mert extends ParentPage{
    public LeftNav_Mert() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerButton;
}
