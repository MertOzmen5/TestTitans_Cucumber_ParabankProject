package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Oguzhan extends ParentPage {

    public DialogContent_Oguzhan() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "//p[@class='error']")
    public WebElement loginError;
    @FindBy(xpath = "//p[@class='smallText']//b")
    public WebElement loginSuccess;















}
