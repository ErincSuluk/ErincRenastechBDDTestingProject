package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;
import utils.Driver;

public class GuruPaymentPage {
    public GuruPaymentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[.='Mother Elephant With Babies Soft Toy']")
    public WebElement MotherElephantHeader;

    @FindBy(xpath = "//h3[.='Price: $20']")
    public WebElement PriceHeader;

    @FindBy(xpath = "//select[@name='quantity']")
    public WebElement QuantityDropdown;

    @FindBy(xpath = "//input[@value='Buy Now']")
    public WebElement BuyNowButton;


    public WebElement setMotherElephantHeader() {
        return MotherElephantHeader;
    }

    public WebElement setPriceHeader() {
        return PriceHeader;
    }

    public void setQuantity(String quantity) {
        Select select=new Select(QuantityDropdown);
        select.selectByValue(quantity);
    }

    public void setBuyNowButton() {
        BrowserUtils.staticWait(3);
        BuyNowButton.click();
    }
}
