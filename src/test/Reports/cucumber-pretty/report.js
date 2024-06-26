$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("lexisnesxis.feature");
formatter.feature({
  "line": 1,
  "name": "Lexisnexis automated script",
  "description": "",
  "id": "lexisnexis-automated-script",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Under Choose Your Industry heading clicking and asserting elements availability",
  "description": "",
  "id": "lexisnexis-automated-script;under-choose-your-industry-heading-clicking-and-asserting-elements-availability",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on the lexisnexis home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User click on Choose Your Industry tab",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Industry page should be Industries Page Displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Financial Services link should be Financial Services LinkDisplayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Insurance link should be Insurance Link Displayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Life and Pensions link should be LifeAnd Pensions LinkDisplayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Corporations and Non-Profits link should be Corporations AndNon Profits Link Displayed and click able",
  "keyword": "And "
});
formatter.match({
  "location": "LexisnexisStpDftn.user_is_on_the_lexisnexis_home_page()"
});
formatter.result({
  "duration": 6127320100,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.user_click_on_Choose_Your_Industry_tab()"
});
formatter.result({
  "duration": 468581500,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.industry_page_should_be_Industries_Page_Displayed()"
});
formatter.result({
  "duration": 106436200,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.financial_Services_link_should_be_Financial_Services_LinkDisplayed_and_click_able()"
});
formatter.result({
  "duration": 109218900,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.insurance_link_should_be_Insurance_Link_Displayed_and_click_able()"
});
formatter.result({
  "duration": 92506000,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.life_and_Pensions_link_should_be_LifeAnd_Pensions_LinkDisplayed_and_click_able()"
});
formatter.result({
  "duration": 70001500,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.corporations_and_Non_Profits_link_should_be_Corporations_AndNon_Profits_Link_Displayed_and_click_able()"
});
formatter.result({
  "duration": 686752100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "In Choose your Industry Tab, Select an Industry, then Select Financial Services",
  "description": "",
  "id": "lexisnexis-automated-script;in-choose-your-industry-tab,-select-an-industry,-then-select-financial-services",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User is on the lexisnexis home page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User click on Choose Your Industry tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Industry page should be \"\u003cIndustriesPageDisplayed\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click Your Financial Services link",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "View Financial Services  Home should be View Financial Services Home Displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Financial Crime Compliance link should be Financial CrimeCompliance Link Displayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Customer Data Management link should be Customer DataManagement Link Displayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Collections \u0026 Recovery link should be Collections \u0026 Recovery Link Displayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Risk Orchestration link should be RiskOrchestrationLinkDisplayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Fraud and Identity Management link should be Fraud AndIdentity Management Link Displayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Credit Risk Assessment link should be Credit RiskAssessment Link Displayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Investigations and Due Diligence link should be Investigations And Due Diligence Link Displayed and click able",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "lexisnexis-automated-script;in-choose-your-industry-tab,-select-an-industry,-then-select-financial-services;",
  "rows": [
    {
      "cells": [
        "IndustriesPageDisplayed"
      ],
      "line": 26,
      "id": "lexisnexis-automated-script;in-choose-your-industry-tab,-select-an-industry,-then-select-financial-services;;1"
    },
    {
      "cells": [
        "Industries"
      ],
      "line": 27,
      "id": "lexisnexis-automated-script;in-choose-your-industry-tab,-select-an-industry,-then-select-financial-services;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
  "name": "In Choose your Industry Tab, Select an Industry, then Select Financial Services",
  "description": "",
  "id": "lexisnexis-automated-script;in-choose-your-industry-tab,-select-an-industry,-then-select-financial-services;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User is on the lexisnexis home page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User click on Choose Your Industry tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Industry page should be \"Industries\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click Your Financial Services link",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "View Financial Services  Home should be View Financial Services Home Displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Financial Crime Compliance link should be Financial CrimeCompliance Link Displayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Customer Data Management link should be Customer DataManagement Link Displayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Collections \u0026 Recovery link should be Collections \u0026 Recovery Link Displayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Risk Orchestration link should be RiskOrchestrationLinkDisplayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Fraud and Identity Management link should be Fraud AndIdentity Management Link Displayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Credit Risk Assessment link should be Credit RiskAssessment Link Displayed and click able",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Investigations and Due Diligence link should be Investigations And Due Diligence Link Displayed and click able",
  "keyword": "And "
});
formatter.match({
  "location": "LexisnexisStpDftn.user_is_on_the_lexisnexis_home_page()"
});
formatter.result({
  "duration": 2767595000,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.user_click_on_Choose_Your_Industry_tab()"
});
formatter.result({
  "duration": 478881900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Industries",
      "offset": 25
    }
  ],
  "location": "LexisnexisStpDftn.industry_page_should_be(String)"
});
formatter.result({
  "duration": 128338400,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.user_click_Your_Financial_Services_link()"
});
formatter.result({
  "duration": 100484000,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.view_Financial_Services_Home_should_be_View_Financial_Services_Home_Displayed()"
});
formatter.result({
  "duration": 95850100,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.financial_Crime_Compliance_link_should_be_Financial_CrimeCompliance_Link_Displayed_and_click_able()"
});
formatter.result({
  "duration": 67677800,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.customer_Data_Management_link_should_be_Customer_DataManagement_Link_Displayed_and_click_able()"
});
formatter.result({
  "duration": 81597600,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.collections_Recovery_link_should_be_Collections_Recovery_Link_Displayed_and_click_able()"
});
formatter.result({
  "duration": 80955700,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.risk_Orchestration_link_should_be_RiskOrchestrationLinkDisplayed_and_click_able()"
});
formatter.result({
  "duration": 124509100,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.fraud_and_Identity_Management_link_should_be_Fraud_AndIdentity_Management_Link_Displayed_and_click_able()"
});
formatter.result({
  "duration": 85835300,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.credit_Risk_Assessment_link_should_be_Credit_RiskAssessment_Link_Displayed_and_click_able()"
});
formatter.result({
  "duration": 69184200,
  "status": "passed"
});
formatter.match({
  "location": "LexisnexisStpDftn.investigations_and_Due_Diligence_link_should_be_Investigations_And_Due_Diligence_Link_Displayed_and_click_able()"
});
formatter.result({
  "duration": 719908700,
  "status": "passed"
});
formatter.uri("lexisnexis2.feature");
formatter.feature({
  "line": 1,
  "name": "Lexisnexis",
  "description": "",
  "id": "lexisnexis",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Lexisnexis",
  "description": "",
  "id": "lexisnexis;lexisnexis",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "am on the lexisnexis home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "This page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDeftn.am_on_the_lexisnexis_home_page()"
});
formatter.result({
  "duration": 2728960800,
  "status": "passed"
});
formatter.match({
  "location": "StepDeftn.user_click_on()"
});
formatter.result({
  "duration": 437225100,
  "status": "passed"
});
formatter.match({
  "location": "StepDeftn.this_page_should_be_displayed()"
});
formatter.result({
  "duration": 671519900,
  "status": "passed"
});
});