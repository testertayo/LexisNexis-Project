package com.lexisnexis.page;

import org.openqa.selenium.By;
import com.lexisnexis.util.UtilClass;

public class HomePage {

    public static final By Sign_In = By.xpath("//*[@id=\"mm-32882528-f67d-4cb9-8509-f6d48ac579c5\"]/div/div/ul/div/a[2]");
    public static final By Accept_Cookies = By.id("onetrust-accept-btn-handler");

    public static final By CHOOSE_YOUR_INDUSTRY = By.linkText("Choose Your Industry");
    public static final By OUR_PRODUCTS = By.linkText("Our Products");
    public static final By INSIGHTS_AND_RESOURCES = By.linkText("Insights and Resources");
    public static final By ABOUT_US = By.linkText("About Us");


    public static void AcceptCookies(){
        UtilClass.clickWebElement(Accept_Cookies);
    }
    public static void clickSigIn(){
        UtilClass.clickWebElement(Sign_In);
    }

    public static void clickChooseYourIndustry(){
        UtilClass.clickWebElement(CHOOSE_YOUR_INDUSTRY);
    }
    public static void clickOurProducts()
    {
        UtilClass.clickWebElement(OUR_PRODUCTS);
    }

    public static void clickInsightsAndResourcesYourIndustry(){
        UtilClass.clickWebElement(INSIGHTS_AND_RESOURCES);
    }
    public static void clickAboutUs()
    {
        UtilClass.clickWebElement(ABOUT_US);
    }
}
