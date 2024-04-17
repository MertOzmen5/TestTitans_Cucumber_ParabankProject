package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_Asli extends ParentPage{

    public DialogContent_Asli() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


        @FindBy(css = "[class='title']")
     public WebElement accountOverwiew;

        @FindBy(css = "[ng-model='loanRequest.amount']")
    public WebElement loanAmount;

        @FindBy(css = "[ng-model='loanRequest.downPayment']")
    public WebElement downPayment;

        @FindBy(css = "[ng-model='loanRequest.fromAccountId']")
    public WebElement fromAccount;

        @FindBy(css = "[value='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//a[text()='Request Loan']")
    public WebElement noTranscation;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/div/p[1]")
    public WebElement loanApproved;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "accountOverwiew":
                return this.accountOverwiew;
            case "loanAmount":
                return this.loanAmount;
            case "downPayment":
                return this.downPayment;
            case "fromAccount":
                return this.fromAccount;
            case "applyNowButton":
                return this.applyNowButton;
            case "noTranscation":
                return this.noTranscation;
            case "loanApproved":
                return this.loanApproved;

        }

        return null;
    }















}
