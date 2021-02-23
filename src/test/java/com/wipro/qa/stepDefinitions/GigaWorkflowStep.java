package com.wipro.qa.stepDefinitions;

import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class GigaWorkflowStep extends TestBase {


    @Given("user login with gig workflow permission")
    public void userLoginWithGigWorkflowPermission(DataTable logindetails) throws Throwable {

        List<List<String>> login = logindetails.asLists();
        ProjectID = login.get(1).get((2));
        StepCommonMethod.login_with_a_selected_Role(ProjectInfoOBJ.LABEL_USERNAME, login.get(1).get(0),
                ProjectInfoOBJ.LABEL_PASSWORD, login.get(1).get(1), ProjectInfoOBJ.SIGNINBUTTON);
        ProjectID = login.get(1).get(2);
        String getprojectID;
        getprojectID = ProjectInfoOBJ.selectProjectCard.toString().replace("textToReplace", ProjectID).replaceAll("By.xpath:", "");
        ProjectInfoOBJ.selectProjectCard = null;
        ProjectInfoOBJ.selectProjectCard = By.xpath(getprojectID);
        Thread.sleep(3000);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(ProjectInfoOBJ.selectProjectCard));
        TestUtilDemo.clickElement(ProjectInfoOBJ.selectProjectCard, "select Project card");

    }


    @And("user select  giga workflow from top menu")
    public void userSelectGigaWorkflowFromTopMenu() {
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigHeader, " Click on Giga workflow");
        //Removing comment 50
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.activityDropdownbox) );


    }

    @And("user select the option gig workflow  dropdown")
    public void userSelectTheOptionGigWorkflowDropdown() {
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.activityDropdownbox, "click on the drop down");
    }


    @And("user select activity information and fill the details")
    public void userSelectActivityInformationAndFillTheDetails(DataTable activity) throws InterruptedException {
        List<List<String>> activityinfo = activity.asLists();
        String step1activity;
        step1activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", activityinfo.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step1activity), "select first activity");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.subtypedrpdnR));

        Actions act = new Actions(driver);
        act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.subtypedrpdnR, "subtype selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        boolean founds = false;
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR, "Instrument Purchase Specification Number selected");
        TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR);
        act.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP).build().perform();
        act.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP).build().perform();
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR, "Instrument Purchase Specification Number selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        Thread.sleep(3000);


        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR, "Equipment Tag/Name");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        Thread.sleep(300);

        TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.equipmentCategorydrpdnR);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR, "Equipment Category");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();


        Thread.sleep(300);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR, "Electrical Equipment Number/Name");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();


        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR, "Powerhouse Tag/Name");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR, "Control Room Number/Name");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "Save button");


    }

    @And("user select Customize Fragnet and fill the details")
    public void userSelectCustomizeFragnetAndFillTheDetails(DataTable fragnet) throws InterruptedException {
        List<List<String>> customizeFragnet = fragnet.asLists();
        String step2activity;
        step2activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", customizeFragnet.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step2activity), "select first activity");
        Thread.sleep(3000);

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");

    }

    @And("user select FragnetStep Information and fill the details")
    public void userSelectFragnetStepInformationAndFillTheDetails(DataTable custfragnet) throws InterruptedException {

        List<List<String>> cFragnet = custfragnet.asLists();
        String step3activity;
        step3activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", cFragnet.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step3activity), "select first activity");
        Thread.sleep(3000);
        //TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.fragnettxt);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})" ,driver.findElement(Gig_WorkflowsOBJ.fragnettxt));
        String totalbudget = TestUtilDemo.getTex(By.xpath("//div[@class='totalBudgetLabel']"));
        TestUtilDemo.clearAnddoSendKeys(Gig_WorkflowsOBJ.manhours, (Integer.parseInt(totalbudget.replaceAll("[^0-9]", "")) - 2) + "");
        Thread.sleep(2000);
        Assert.assertTrue(TestUtilDemo.isElementPresent(Gig_WorkflowsOBJ.redvalidation, "exists"));
        TestUtilDemo.clearAnddoSendKeys(Gig_WorkflowsOBJ.manhours, (Integer.parseInt(totalbudget.replaceAll("[^0-9]", "")) + ""));
        Thread.sleep(1000);
        Assert.assertTrue(TestUtilDemo.isElementPresent(Gig_WorkflowsOBJ.greenvalidation, "exists"));

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");


    }

    @And("user select Customize Gignet and fill the details")
    public void userSelectCustomizeGignetAndFillTheDetails(DataTable custgig) throws InterruptedException {

        List<List<String>> gigcustomize = custgig.asLists();
        String step4activity;
        step4activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", gigcustomize.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step4activity), "select first activity");
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(2000);

        if (driver.findElements(By.xpath(Gig_WorkflowsOBJ.step4completedrnd.toString().replaceAll("By.xpath:", ""))).size() == 1) {
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
            Thread.sleep(3000);
        }
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
        if (driver.findElements(By.xpath("//div[@class='fragmentStepsDetailsGray']")).size() == 1) {
            Thread.sleep(3000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
        }


    }


    @And("user select Gig Information and fill the details")
    public void userSelectGigInformationAndFillTheDetails(DataTable gig) throws InterruptedException {

        List<List<String>> giginfo = gig.asLists();
        String step5activity;
        step5activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", giginfo.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step5activity), "select first activity");
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(3000);
        WebDriverWait ww = new WebDriverWait(driver, 30000);
        ww.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.step4completedrnd));
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
        Thread.sleep(3000);


//        Review Process Datasheets
//        Prepare Draft Mechanical Datasheets
//        Check Draft Mechanical Datasheets

        for (int row = 2; row < giginfo.size(); row++) {

            Actions act = new Actions(driver);
            if (row < 5 || row == 8) {
                String ReviewProcessDatasheets;
                ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString().replace("textToReplace", giginfo.get(row).get(0)).replaceAll("By.xpath:", "");
                TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                Thread.sleep(3000);
            } else {
                String ReviewProcessDatasheets;
                ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString().replace("textToReplace", giginfo.get(row).get(0).concat(" ")).replaceAll("By.xpath:", "").concat(" ");
                TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                Thread.sleep(3000);
            }

            TestUtilDemo.clickElement(By.xpath("//p[text()='Fill In Activity Information']"), "test");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.worktype));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.worktype, "select worktype");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(3000);
            TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.PreferredPerformerLocation);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.PreferredPerformerLocation, "select preferred");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(3000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "select first activity");
            Thread.sleep(2000);
            TestUtilDemo.scrollUpTop();

            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
            Thread.sleep(2000);
        }

        Thread.sleep(2000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigFinishbtn, "continue button");
        Thread.sleep(2000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.btncomplete, "Completed button");


    }

    @And("user select Gig Information and fill the details for piping")
    public void userSelectGigInformationAndFillTheDetailsforpiping(DataTable gig) throws InterruptedException {

        List<List<String>> giginfo = gig.asLists();
        String step5activity;
        step5activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", giginfo.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step5activity), "select first activity");
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(3000);
        WebDriverWait ww = new WebDriverWait(driver, 30000);
        ww.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.step4completedrnd));
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
        Thread.sleep(3000);

//          | Create Stress Isometric Package        |
//      | Perform Prelim SB Stress Analysis      |
//      | Add Stress Analysis Comments to  ISO's |


        for (int row = 2; row < giginfo.size(); row++) {

            Actions act = new Actions(driver);
            if (row < 4) {
                String ReviewProcessDatasheets;
                ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString().replace("textToReplace", giginfo.get(row).get(0)).replaceAll("By.xpath:", "");
                TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                Thread.sleep(3000);
            }else{

                String ReviewProcessDatasheets;
                ReviewProcessDatasheets = "//ul[@class='list-group']//li//p[starts-with(text(),'"+ giginfo.get(row).get(0)+"')]/parent::div/span";
                TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                Thread.sleep(3000);

            }

            TestUtilDemo.clickElement(By.xpath("//p[text()='Fill In Activity Information']"), "test");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.worktype));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.worktype, "select worktype");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(3000);
            TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.txtgiginsturctionR);
            TestUtilDemo.doSendKeys(Gig_WorkflowsOBJ.txtgiginsturctionR, "Gig flow autmation");

            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(3000);
            TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.PreferredPerformerLocation);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.PreferredPerformerLocation, "select preferred");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(4000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "select first activity");
            Thread.sleep(2000);
            TestUtilDemo.scrollUpTop();
            Thread.sleep(2000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
            Thread.sleep(2000);
        }

        Thread.sleep(2000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigFinishbtn, "continue button");
        Thread.sleep(2000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.btncomplete, "Completed button");


    }


    @And("user select activity information for piping and fill the details")
    public void userSelectActivityInformationForPipingAndFillTheDetails(DataTable gig) throws InterruptedException {
        List<List<String>> giginfo = gig.asLists();
        String step1activity;
        step1activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", giginfo.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step1activity), "select first activity");
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.subtypedrpdnR, "subtype selected");
//        String dropdownarrow =Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace",giginfo.get(1).get(0)).replaceAll("By.xpath:","");
//        act.clickAndHold(driver.findElement(By.xpath(dropdownarrow))).build().perform();
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        boolean founds = false;

//        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR, "Instrument Purchase Specification Number selected");
        TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR);
        act.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP).build().perform();
        act.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP).build().perform();
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR, "Instrument Purchase Specification Number selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        Thread.sleep(3000);


        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR, "Equipment Tag/Name selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        Thread.sleep(300);

        TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.equipmentCategorydrpdnR);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR, "Equipment Category selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();


        Thread.sleep(300);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR, "Electrical Equipment Number/Name selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();


        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR, "Powerhouse Tag/Name selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR, "Control Room Number/Name selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(4000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "Save button");


    }

    @And("user select the option gig workflow  dropdown {string}")
    public void userSelectTheOptionGigWorkflowDropdown(String gigflow) throws InterruptedException {
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        String dropdownarrow = Gig_WorkflowsOBJ.dropdownSelectoption.toString().replace("textToReplace", gigflow).replaceAll("By.xpath:", "").concat(" ");
        act.clickAndHold(driver.findElement(By.xpath(dropdownarrow))).build().perform();

        String optiongigworkflow;
        optiongigworkflow = Gig_WorkflowsOBJ.optionselect.toString().replace("textToReplace", gigflow).replaceAll("By.xpath:", "").concat(" ");
        TestUtilDemo.clickElement(By.xpath(optiongigworkflow), "test");


    }
/*
    @And("user select activity information and fill the details for Process")
    public void userSelectActivityInformationAndFillTheDetailsForProcess() throws InterruptedException {
  */

   /* @And("user select Customize Gignet and fill the details for Process")
    public void userSelectCustomizeGignetAndFillTheDetailsForProcess() {
    }*/

    //Process
    @And("user select activity information and fill the details for Process")
    public void userSelectActivityInformationAndFillTheDetailsForProcess(DataTable gig) throws InterruptedException {

        List<List<String>> giginfo = gig.asLists();
        String step1activity;
        step1activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", giginfo.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step1activity), "select first activity");
        Thread.sleep(3000);
        Actions act = new Actions(driver);
//        act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})" ,driver.findElement(Gig_WorkflowsOBJ.subtypedrpdnR));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.subtypedrpdnR));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.subtypedrpdnR, "subtype selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        boolean founds = false;

//        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR, "Instrument Purchase Specification Number selected");
//        TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR);
//        act.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP).build().perform();
//        act.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP).build().perform();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})" ,driver.findElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR, "Instrument Purchase Specification Number selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})" ,driver.findElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR, "Equipment Tag/Name selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        Thread.sleep(300);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})" ,driver.findElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR));
        //TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.equipmentCategorydrpdnR);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR, "Equipment Category selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();


        Thread.sleep(300);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})" ,driver.findElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR, "Electrical Equipment Number/Name selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})" ,driver.findElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR, "Powerhouse Tag/Name selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})" ,driver.findElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR, "Control Room Number/Name selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(6000);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.gigContinueenabledbtn));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "Save button");


    }

    @And("user select Gig Information and fill the details for Process")
    public void userSelectGigInformationAndFillTheDetailsForProcess(DataTable gig) throws InterruptedException {
        List<List<String>> giginfo = gig.asLists();
        String step5activity;
        step5activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", giginfo.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step5activity), "select first activity");
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(3000);
        WebDriverWait ww = new WebDriverWait(driver, 30000);
        ww.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.step4completedrnd));
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
        Thread.sleep(3000);

        for (int row = 2; row < giginfo.size(); row++) {

            Actions act = new Actions(driver);
            if (row < 7) {
                String ReviewProcessDatasheets;
                ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString().replace("textToReplace", giginfo.get(row).get(0)).replaceAll("By.xpath:", "");
                TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                Thread.sleep(3000);
            }

            //TestUtilDemo.clickElement(By.xpath("//p[text()='Fill In Activity Information']"), "test");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
            if(driver.findElements(Gig_WorkflowsOBJ.worktype).size()>0) {
                Thread.sleep(3000);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})" ,driver.findElement(Gig_WorkflowsOBJ.worktype));
                webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.worktype));
                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.worktype, "select worktype");
                act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
                Thread.sleep(3000);
            }
            if(driver.findElements(Gig_WorkflowsOBJ.txtgiginsturctionR).size()>0) {
                TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.txtgiginsturctionR);
                TestUtilDemo.doSendKeys(Gig_WorkflowsOBJ.txtgiginsturctionR, "Gig flow autmation");
            }
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(3000);
            if(driver.findElements(Gig_WorkflowsOBJ.PreferredPerformerLocation).size()>0) {
                TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.PreferredPerformerLocation);
                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.PreferredPerformerLocation, "select preferred");
            }
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(4000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "select first activity");
            Thread.sleep(2000);
            TestUtilDemo.scrollUpTop();
            Thread.sleep(2000);
            //TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinueenabledbtn, "Finish Gig flow button clicked");
            Thread.sleep(2000);

        }
    }
}

