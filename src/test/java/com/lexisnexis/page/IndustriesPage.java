package com.lexisnexis.page;

import com.lexisnexis.util.UtilClass;
import org.openqa.selenium.By;

public class IndustriesPage {

    public static final By INDUSTRY_PAGE = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[2]/div/h3");
    public static final By FINACIAL_SERVICES = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[2]/ul/li[1]/a/div[1]");
    public static final By INSURANCE = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[2]/ul/li[2]/a/div[1]");
    public static final By LIFE_AND_PENSIONS = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[2]/ul/li[3]/a/div[1]");
    public static final By CORPORATIONS_AND_NON_PROFITS = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/li[1]/ul/li/div/div[2]/ul/li[4]/a/div[1]");

    public static void clickFinacialServices(){
        UtilClass.clickWebElement(FINACIAL_SERVICES);
    }
    public static void clickInsurance(){

        UtilClass.clickWebElement(INSURANCE);
    }

    public static void clickLifeAndPensions(){
        UtilClass.clickWebElement(LIFE_AND_PENSIONS);
    }
    public static void clickCorporationsAndNonProfits() {

        UtilClass.clickWebElement(CORPORATIONS_AND_NON_PROFITS);
    }
}
