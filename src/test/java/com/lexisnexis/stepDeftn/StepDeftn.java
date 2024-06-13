package com.lexisnexis.stepDeftn;

import com.lexisnexis.browser.Hook;
import com.lexisnexis.page.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDeftn {

    @Given("^am on the lexisnexis home page$")
    public void am_on_the_lexisnexis_home_page() throws Throwable {
        Hook.setup().get("https://risk.lexisnexis.co.uk/");
        HomePage.AcceptCookies();
    }
    @When("^User click on$")
    public void user_click_on() throws Throwable {
        HomePage.clickSigIn();
    }
    @Then("^This page should be displayed$")
    public void this_page_should_be_displayed() throws Throwable {
        Hook.teardown();
    }
}
