Feature: Lexisnexis automated script
  Scenario: Under Choose Your Industry heading clicking and asserting elements availability
    Given User is on the lexisnexis home page
    When User click on Choose Your Industry tab
    Then Industry page should be Industries Page Displayed
    And Financial Services link should be Financial Services LinkDisplayed and click able
    And Insurance link should be Insurance Link Displayed and click able
    And Life and Pensions link should be LifeAnd Pensions LinkDisplayed and click able
    And Corporations and Non-Profits link should be Corporations AndNon Profits Link Displayed and click able


  Scenario Outline: In Choose your Industry Tab, Select an Industry, then Select Financial Services
    Given User is on the lexisnexis home page
    And User click on Choose Your Industry tab
    And Industry page should be "<IndustriesPageDisplayed>"
    When User click Your Financial Services link
    Then View Financial Services  Home should be View Financial Services Home Displayed
    And Financial Crime Compliance link should be Financial CrimeCompliance Link Displayed and click able
    And Customer Data Management link should be Customer DataManagement Link Displayed and click able
    And Collections & Recovery link should be Collections & Recovery Link Displayed and click able
    And Risk Orchestration link should be RiskOrchestrationLinkDisplayed and click able
    And Fraud and Identity Management link should be Fraud AndIdentity Management Link Displayed and click able
    And Credit Risk Assessment link should be Credit RiskAssessment Link Displayed and click able
    And Investigations and Due Diligence link should be Investigations And Due Diligence Link Displayed and click able
    Examples:
      | IndustriesPageDisplayed |
      | Industries  |


