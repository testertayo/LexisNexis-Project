package com.lexisnexis.stepDeftn;

import com.lexisnexis.browser.Hook;
import com.lexisnexis.page.FinacialServicesPage;
import com.lexisnexis.page.HomePage;
import com.lexisnexis.page.IndustriesPage;
import com.lexisnexis.util.UtilClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LexisnexisStpDftn {


@Given("^User is on the lexisnexis home page$")
public void user_is_on_the_lexisnexis_home_page() throws Throwable {
    Hook.setup().get("https://risk.lexisnexis.co.uk/");
    HomePage.AcceptCookies();
}

    @When("^User click on Choose Your Industry tab$")
    public void user_click_on_Choose_Your_Industry_tab() throws Throwable {
        HomePage.clickChooseYourIndustry();

    }

    @Then("^Industry page should be Industries Page Displayed$")
    public void industry_page_should_be_Industries_Page_Displayed() throws Throwable {
        UtilClass.assertWebElementIsDisplayed(IndustriesPage.INDUSTRY_PAGE);
    }

    @Then("^Financial Services link should be Financial Services LinkDisplayed and click able$")
    public void financial_Services_link_should_be_Financial_Services_LinkDisplayed_and_click_able() throws Throwable {
        UtilClass.assertWebElementIsDisplayed(IndustriesPage.FINACIAL_SERVICES);

    }

    @Then("^Insurance link should be Insurance Link Displayed and click able$")
    public void insurance_link_should_be_Insurance_Link_Displayed_and_click_able() throws Throwable {
        UtilClass.assertWebElementIsDisplayed(IndustriesPage.INSURANCE);
    }

    @Then("^Life and Pensions link should be LifeAnd Pensions LinkDisplayed and click able$")
    public void life_and_Pensions_link_should_be_LifeAnd_Pensions_LinkDisplayed_and_click_able() throws Throwable {
        UtilClass.assertWebElementIsDisplayed(IndustriesPage.LIFE_AND_PENSIONS);

    }

    @Then("^Corporations and Non-Profits link should be Corporations AndNon Profits Link Displayed and click able$")
    public void corporations_and_Non_Profits_link_should_be_Corporations_AndNon_Profits_Link_Displayed_and_click_able() throws Throwable {
        UtilClass.assertWebElementIsDisplayed(IndustriesPage.CORPORATIONS_AND_NON_PROFITS);

        Hook.teardown();

    }


    //====================================================

    @Given("^Industry page should be \"([^\"]*)\"$")
    public void industry_page_should_be(String arg1) throws Throwable {
        UtilClass.assertWebElementIsDisplayed(IndustriesPage.INSURANCE);

    }

    @When("^User click Your Financial Services link$")
    public void user_click_Your_Financial_Services_link() throws Throwable {
    IndustriesPage.clickFinacialServices();

    }

    @Then("^View Financial Services  Home should be View Financial Services Home Displayed$")
    public void view_Financial_Services_Home_should_be_View_Financial_Services_Home_Displayed() throws Throwable {
    UtilClass.assertWebElementIsDisplayed(FinacialServicesPage.FINACIAL_SERVICES_HOME_LINK);

    }

    @Then("^Financial Crime Compliance link should be Financial CrimeCompliance Link Displayed and click able$")
    public void financial_Crime_Compliance_link_should_be_Financial_CrimeCompliance_Link_Displayed_and_click_able() throws Throwable {
    UtilClass.assertWebElementIsDisplayed(FinacialServicesPage.FINANCIAL_CRIME_COMPLIANCE_LINK);

    }

    @Then("^Customer Data Management link should be Customer DataManagement Link Displayed and click able$")
    public void customer_Data_Management_link_should_be_Customer_DataManagement_Link_Displayed_and_click_able() throws Throwable {
        UtilClass.assertWebElementIsDisplayed(FinacialServicesPage.CUSTOMER_DATA_MANAGEMENT_LINK);

    }

    @Then("^Collections & Recovery link should be Collections & Recovery Link Displayed and click able$")
    public void collections_Recovery_link_should_be_Collections_Recovery_Link_Displayed_and_click_able() throws Throwable {
        UtilClass.assertWebElementIsDisplayed(FinacialServicesPage.COLLECTIONS_AND_RECOVERY);

    }

    @Then("^Risk Orchestration link should be RiskOrchestrationLinkDisplayed and click able$")
    public void risk_Orchestration_link_should_be_RiskOrchestrationLinkDisplayed_and_click_able() throws Throwable {
        UtilClass.assertWebElementIsDisplayed(FinacialServicesPage.RISK_ORCHESTRATION_LINK);

    }

    @Then("^Fraud and Identity Management link should be Fraud AndIdentity Management Link Displayed and click able$")
    public void fraud_and_Identity_Management_link_should_be_Fraud_AndIdentity_Management_Link_Displayed_and_click_able() throws Throwable {
        UtilClass.assertWebElementIsDisplayed(FinacialServicesPage.FRAUD_AND_IDENTITY_MANAGEMENT_LINK);
    }

    @Then("^Credit Risk Assessment link should be Credit RiskAssessment Link Displayed and click able$")
    public void credit_Risk_Assessment_link_should_be_Credit_RiskAssessment_Link_Displayed_and_click_able() throws Throwable {
        UtilClass.assertWebElementIsDisplayed(FinacialServicesPage.CREDIT_RISK_ASSESSMENT_LINK);
    }

    @Then("^Investigations and Due Diligence link should be Investigations And Due Diligence Link Displayed and click able$")
    public void investigations_and_Due_Diligence_link_should_be_Investigations_And_Due_Diligence_Link_Displayed_and_click_able() throws Throwable {
        UtilClass.assertWebElementIsDisplayed(FinacialServicesPage.INVESTIGATION_AND_DUE_DILIGENCE);

        Hook.teardown();
    }





//
}