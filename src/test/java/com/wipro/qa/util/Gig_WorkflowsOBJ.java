package com.wipro.qa.util;

import org.openqa.selenium.By;

public class Gig_WorkflowsOBJ {

    public static By gigHeader = By.xpath("//div[text()='Gig Workflows']");
    public static By gigworkFlowHeader = By.xpath("//span[@class='gigHeaderLabel']");
    public static By dropdownSelectoption = By.xpath("//div[@class='selectOption']/span[text()='Piping Line Schedule']");

    //Dos activity
    public static By activityDropdownbox = By.xpath("//span[text()='Mechanical Data Sheets']//parent::div");
    public static By allSteos = By.xpath("//div[text()='textToReplace']");

    public static By step1ActivityInformation = By.xpath("//div[text()='Activity Information']");
    public static By subtypedrpdnR = By.xpath("//p[text()='Subtype']/parent::div//div");
    //public static By purchaseSpecNuorNametxt = By.xpath("");
    public static By instPurchaseSpecNudrpdnR = By.xpath("//p[text()='Instrument Purchase Specification Number']/parent::div//div[1]");
    public static By equipmenttagorNamedrpdnR = By.xpath("//p[text()='Discipline/Subject Specific']/parent::div/..//p[text()='Equipment Tag/Name']/parent::div/div[1]");
    public static By equipmentCategorydrpdnR = By.xpath("//p[text()='Discipline/Subject Specific']/parent::div/..//p[text()='Equipment Category']/parent::div/div[1]");
    public static By electricalEquiNuorNadrpdnR = By.xpath("//p[text()='Discipline/Subject Specific']/parent::div/..//p[text()='Electrical Equipment Number/Name']/parent::div//div[1]");
    public static By powerhouseTagNadrpdnR = By.xpath("//p[text()='Discipline/Subject Specific']/parent::div/..//p[text()='Powerhouse Tag/Name']/parent::div//div[1]");
    public static By controlRoomNuorNamdrpdnR = By.xpath("//p[text()='Discipline/Subject Specific']/parent::div/..//p[text()='Control Room Number/Name']/parent::div//div[1]");


    public static By gigSavebtn = By.xpath("//div[@class='gigStepFooter' or @class='gigButtonContainer']//button[text()='Save']");
    public static By gigContinuebtn = By.xpath("//div[@class='gigStepFooter']//button[text()='Continue']");
    public static By manhours =By.xpath("//input[@name='manHourBudget0']");
    public static By fragnettxt =By.xpath("//input[@name='fragnetStepDuration0']");
    public static By greenvalidation =By.xpath("//div[@class='totalHrs colorGreen row']");
    public static By redvalidation =By.xpath("//div[@class='totalHrs colorRed row']");
    public static By step4completedrnd =By.xpath("//span[text()='Mark as Completed']");


    public static By equipmentdatasheetlist =By.xpath("//ul[@class='list-group']//li//p[text()='textToReplace']/parent::div/span");
    public static By worktype=By.xpath("//p[text()='Work Type']/parent::div/div");
    public static By gigFinishbtn = By.xpath("//div[@class='gigStepFooter' or @class='gigButtonContainer']//button[text()='Finish Gig Workflow']");


    }
