package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Oguzhan extends ParentPage {

    public LeftNav_Oguzhan() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //    **************US_602_Oguzhan************
    @FindBy(css = "[name='username']")
    public WebElement username;
    @FindBy(css = "[name='password']")
    public WebElement password;
    @FindBy(css = "[value='Log In']")
    public WebElement loginButton;


}
