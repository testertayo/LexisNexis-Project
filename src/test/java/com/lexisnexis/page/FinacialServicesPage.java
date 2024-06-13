package com.lexisnexis.page;

import com.lexisnexis.util.UtilClass;
import org.openqa.selenium.By;

public class FinacialServicesPage {

    public static final By FINACIAL_SERVICES_HOME_LINK = By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/div/a");
    public static final By FINANCIAL_CRIME_COMPLIANCE_LINK = By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[1]/a/div");
    public static final By CUSTOMER_DATA_MANAGEMENT_LINK = By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[3]/a/div");
    public static final By COLLECTIONS_AND_RECOVERY = By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[5]/a/div");
    public static final By RISK_ORCHESTRATION_LINK = By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[7]/a/div");
    public static final By FRAUD_AND_IDENTITY_MANAGEMENT_LINK = By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[2]/a/div");
    public static final By CREDIT_RISK_ASSESSMENT_LINK = By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[4]/a/div");
    public static final By INVESTIGATION_AND_DUE_DILIGENCE = By.xpath("//*[@id=\"{4D5E7A25-6576-4637-9149-6AB8E198E48D}\"]/ul/li[6]/a/div");

    public static void clickFinancialServices(){
        UtilClass.clickWebElement(FINACIAL_SERVICES_HOME_LINK);
    }
    public static void clickFinancialCrimeComplianceLink(){

        UtilClass.clickWebElement(FINANCIAL_CRIME_COMPLIANCE_LINK);
    }

    public static void clickCustomerDataManagementLink(){
        UtilClass.clickWebElement(CUSTOMER_DATA_MANAGEMENT_LINK);
    }
    public static void clickCollectionAndRecoveryLink(){

        UtilClass.clickWebElement(COLLECTIONS_AND_RECOVERY);
    }

    public static void clickRiskOrchestrationLink(){
        UtilClass.clickWebElement(RISK_ORCHESTRATION_LINK);
    }
    public static void clickFraudAndIdentityManagementLink(){

        UtilClass.clickWebElement(FRAUD_AND_IDENTITY_MANAGEMENT_LINK);
    }

    public static void clickCreditRiskAssessmentLink(){
        UtilClass.clickWebElement(CREDIT_RISK_ASSESSMENT_LINK);
    }
    public static void clickInvestigationAndDueDiligenceLink(){

        UtilClass.clickWebElement(INVESTIGATION_AND_DUE_DILIGENCE);
    }

}
