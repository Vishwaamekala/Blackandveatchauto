package com.wipro.qa.util;

import org.openqa.selenium.By;

public class Gig_WorkflowsOBJ {

    public static By gigHeader = By.xpath("//div[text()='Gig Workflows']");
    public static By gigworkFlowHeader = By.xpath("//span[@class='gigHeaderLabel']");
    public static By dropdownSelectoption = By.xpath("//div[@class='selectOption']/span[text()='Piping Line Schedule']");

    //Dos activity
    public static By activityDropdownbox = By.xpath("//span[text()='Mechanical Data Sheets']//parent::div");

    public static By step1ActivityInformation = By.xpath("//div[@class='fragment-steps-details ']/parent::div");



    }
}