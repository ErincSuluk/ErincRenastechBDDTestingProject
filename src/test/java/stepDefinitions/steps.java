package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GuruPaymentPage;
import pages.GuruPaymentProcessPage;
import utils.ConfigurationsReader;
import utils.Driver;

import java.util.List;
import java.util.Map;

public class steps {

    GuruPaymentPage guruPaymentPage=new GuruPaymentPage();
    GuruPaymentProcessPage guruPaymentProcessPage=new GuruPaymentProcessPage();
    @Given("The user wants to go https:\\/\\/demo.guru99.com\\/payment-gateway\\/index.php")
    public void the_user_wants_to_go_https_demo_guru99_com_payment_gateway_index_php() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("URL"));

    }
    @Then("The user should able to see {string}")
    public void the_user_should_able_to_see(String string) {
        Assert.assertEquals(guruPaymentPage.setMotherElephantHeader().getText(),string);
    }


    @Then("The user wants to verify that the toy price is {string}")
    public void the_user_wants_to_verify_that_the_toy_price_is(String string) {
        Assert.assertEquals(guruPaymentPage.setPriceHeader().getText(),string);

    }
    @Then("the URL should contain {string}")
    public void the_url_should_contain(String string) {
       Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
    }

    @Given("The user wants to select quantity as {string}")
    public void the_user_wants_to_select_quantity_as(String string) {
        guruPaymentPage.setQuantity(string);

    }
    @When("The user wants to click on buy now button")
    public void the_user_wants_to_click_on_buy_now_button() {
        guruPaymentPage.setBuyNowButton();

    }
    @Then("The user wants to enter credit card number as {string}")
    public void the_user_wants_to_enter_credit_card_number_as(String string) {
        guruPaymentProcessPage.setCardNumber(string);

    }
    @Then("The user wants to select expiration month as {string}")
    public void the_user_wants_to_select_expiration_month_as(String string) {
        guruPaymentProcessPage.setMonth(string);

    }
    @Then("The user wants to select expiration year as {string}")
    public void the_user_wants_to_select_expiration_year_as(String string) {
        guruPaymentProcessPage.setYear(string);

    }
    @Then("The user wants to enter CVV Code as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
        guruPaymentProcessPage.setCVVCode(string);

    }
    @Then("The user wants to click on buy button")
    public void the_user_wants_to_click_on_buy_button() {
        guruPaymentProcessPage.setBuyButton();

    }
    @Then("The user should able to see {string} message")
    public void the_user_should_able_to_see_message(String string) {
       Assert.assertEquals(guruPaymentProcessPage.setSuccessfulMessage().getText(),string);
    }

    @Given("The user wants to select {string}")
    public void the_user_wants_to_select(String string) {
        guruPaymentPage.setQuantity(string);

    }
    @When("The user wants to  enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String, String> dataTable) {
        guruPaymentProcessPage.setCardNumber(dataTable.get("CNumber"));
        guruPaymentProcessPage.setMonth(dataTable.get("EMonth"));
        guruPaymentProcessPage.setYear(dataTable.get("EYear"));
        guruPaymentProcessPage.setCVVCode(dataTable.get("CVVCode"));

    }


}
