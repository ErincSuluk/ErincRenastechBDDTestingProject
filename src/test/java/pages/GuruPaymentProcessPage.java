package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;
import utils.Driver;

public class GuruPaymentProcessPage {
    public GuruPaymentProcessPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "card_nmuber")
    private WebElement CardNumber;

    @FindBy(id = "month")
    private WebElement month;

    @FindBy(id = "year")
    private WebElement year;

    @FindBy(id = "cvv_code")
    private WebElement CVVCode;

    @FindBy(xpath = "//input[@class='button special']")
    private WebElement buyButton;

    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement successfulMessage;

    public void setCardNumber(String cardNumber) {
        CardNumber.sendKeys(cardNumber);
    }

    public void setMonth(String Month) {
        month.sendKeys(Month);
    }

    public void setYear(String Year) {
        year.sendKeys(Year);
    }

    public void setCVVCode(String cVVCode) {
        CVVCode.sendKeys(cVVCode);
    }

    public void setBuyButton() {
        BrowserUtils.staticWait(3);
        buyButton.click();
    }

    public WebElement setSuccessfulMessage() {
        return successfulMessage;
    }
}
