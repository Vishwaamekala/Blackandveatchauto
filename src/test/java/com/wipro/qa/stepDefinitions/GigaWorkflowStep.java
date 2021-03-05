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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Arrays;
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
        Thread.sleep(4000);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(ProjectInfoOBJ.selectProjectCard));
        TestUtilDemo.clickElement(ProjectInfoOBJ.selectProjectCard, "select Project card");
    }

    @And("user select  giga workflow from top menu")
    public void userSelectGigaWorkflowFromTopMenu() {
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigHeader, " Click on Giga workflow");
    }

    @And("user select the option gig workflow  dropdown")
    public void userSelectTheOptionGigWorkflowDropdown() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.activityDropdownbox));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.activityDropdownbox, "click on the drop down");
    }

    @And("user select activity information and fill the details")
    public void userSelectActivityInformationAndFillTheDetails(DataTable activity) throws InterruptedException {
        List<List<String>> activityinfo = activity.asLists();
        String step1activity;
        step1activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", activityinfo.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step1activity), "select first activity");

        Actions act = new Actions(driver);
        act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.subtypedrpdnR));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.subtypedrpdnR, "subtype selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        boolean founds = false;
        Thread.sleep(1000);

        if (driver.findElements(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR, "Equipment Tag/Name");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(1000);
        }

        if (driver.findElements(Gig_WorkflowsOBJ.equipmentCategorydrpdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR, "Equipment Category");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        }

        if (driver.findElements(Gig_WorkflowsOBJ.equipmentCategorydrpdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR, "Electrical Equipment Number/Name");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        }

        if (driver.findElements(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR, "Powerhouse Tag/Name");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        }

        if (driver.findElements(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR, "Control Room Number/Name");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();

        }

        if (driver.findElements(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR).size() == 1) {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR));
//            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR, "Instrument Purchase Specification Number selected");
//            act.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP).build().perform();
//            act.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP).build().perform();
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR, "Instrument Purchase Specification Number selected");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(1000);
        }

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(2000);
         TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "Save button");
    }

    @And("user select Customize Fragnet and fill the details")
    public void userSelectCustomizeFragnetAndFillTheDetails(DataTable fragnet) throws InterruptedException {
        List<List<String>> customizeFragnet = fragnet.asLists();
        String step2activity;
        step2activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", customizeFragnet.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step2activity), "select first activity");
        Thread.sleep(2000);

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

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.manhours));
        String totalbudget = TestUtilDemo.getTex(By.xpath("//div[@class='totalBudgetLabel']"));
        TestUtilDemo.clearAnddoSendKeys(Gig_WorkflowsOBJ.manhours, (Integer.parseInt(totalbudget.replaceAll("[^0-9]", "")) - 2) + "");
        Thread.sleep(2000);
        Assert.assertTrue(TestUtilDemo.isElementPresent(Gig_WorkflowsOBJ.redvalidation, "exists"));
        TestUtilDemo.clearAnddoSendKeys(Gig_WorkflowsOBJ.manhours, (Integer.parseInt(totalbudget.replaceAll("[^0-9]", "")) + ""));
        Thread.sleep(1000);
        Assert.assertTrue(TestUtilDemo.isElementPresent(Gig_WorkflowsOBJ.greenvalidation, "exists"));

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(4000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
    }

    @And("User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive")
    public void userSelectsStepGigentsCheckboxAndItValidatesAllTheSelectedValuesInStep(DataTable custgig) throws InterruptedException {
        // select  step 4 and  check or uncheck Customize Gignet

        List<List<String>> gigcustomize = custgig.asLists();
        String step4activity;
        step4activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", "Customize Gignet").replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step4activity), "select first activity");
        Thread.sleep(1000);
        // we will removed all checked process
        List<WebElement> allprocess = driver.findElements(By.xpath("//div[@class='rectangleBoxes rectangleBoxes_checked']//label"));
        for (WebElement we1 : allprocess) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", we1);
            we1.click();
        }
        Thread.sleep(1000);

        for (int row = 1; row < gigcustomize.size(); row++) {
            String giginroproces;
            giginroproces = Gig_WorkflowsOBJ.checkUncheckprocess.toString().replace("textToReplace", gigcustomize.get(row).get(0)).replaceAll("By.xpath:", "");
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(By.xpath(giginroproces)));
            TestUtilDemo.clickElement(By.xpath(giginroproces), "select process");

        }
        Thread.sleep(1000);

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(1000);

        if (driver.findElements(By.xpath(Gig_WorkflowsOBJ.step4completedrnd.toString().replaceAll("By.xpath:", ""))).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
            Thread.sleep(1000);
        }
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
        if (driver.findElements(By.xpath("//div[@class='fragmentStepsDetailsGray']")).size() == 1) {
            Thread.sleep(1000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
        }


        // select  step 5 and  process the gig information
        String step5activity;
        step5activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", "Gig Information").replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step5activity), "select first activity");
        Thread.sleep(1000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(1000);
        WebDriverWait ww = new WebDriverWait(driver, 30000);
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
        Thread.sleep(2000);


        for (int row = 1; row < gigcustomize.size(); row++) {
            Actions act = new Actions(driver);
            if (row < 5 || row == 8) {
                String ReviewProcessDatasheets;
                ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString().replace("textToReplace", gigcustomize.get(row).get(0)).replaceAll("By.xpath:", "");
                TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                Thread.sleep(3000);
            } else {
                String ReviewProcessDatasheets;
                ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString().replace("textToReplace", gigcustomize.get(row).get(0).concat(" ")).replaceAll("By.xpath:", "").concat(" ");
                TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                Thread.sleep(3000);
            }

            TestUtilDemo.clickElement(By.xpath("//p[text()='Fill In Activity Information']"), "test");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.worktype));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.worktype));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.worktype, "select worktype");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(2000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.PreferredPerformerLocation));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.PreferredPerformerLocation, "select preferred");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(2000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "select first activity");
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
            Thread.sleep(1000);
        }

        Thread.sleep(2000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigFinishbtn, "continue button");
        Thread.sleep(2000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.btncomplete, "Completed button");


    }


    /**      Scenario one  completed    */


    @And("user select the option gig workflow  dropdown {string}")
    public void userSelectTheOptionGigWorkflowDropdown(String gigflow) throws InterruptedException {
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        act.click(driver.findElement(Gig_WorkflowsOBJ.dropdownSelectoption)).build().perform();
        Thread.sleep(3000);
        String optiongigworkflow;
        optiongigworkflow = Gig_WorkflowsOBJ.optionselect.toString().replace("textToReplace", gigflow).replaceAll("By.xpath:", "");
        act.click(driver.findElement(By.xpath(optiongigworkflow))).build().perform();
//        TestUtilDemo.clickElement(By.xpath(optiongigworkflow), "test");
        Thread.sleep(3000);

    }


    //Process
    @And("user select activity information and fill the details for Process")
    public void userSelectActivityInformationAndFillTheDetailsForProcess(DataTable gig) throws InterruptedException {

        List<List<String>> giginfo = gig.asLists();
        String step1activity;
        step1activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", giginfo.get(1).get(0)).replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step1activity), "select first activity");
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.subtypedrpdnR));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.subtypedrpdnR));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.subtypedrpdnR, "subtype selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        boolean founds = false;




        if (driver.findElements(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR));
            Thread.sleep(2000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR, "Equipment Tag/Name selected");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(3000);
        }
        if (driver.findElements(Gig_WorkflowsOBJ.equipmentCategorydrpdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR));
            Thread.sleep(2000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR, "Equipment Category selected");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        }

        Thread.sleep(300);
        if (driver.findElements(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR));
            Thread.sleep(2000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR, "Electrical Equipment Number/Name selected");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        }

        if (driver.findElements(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR));
            Thread.sleep(2000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR, "Powerhouse Tag/Name selected");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        }
        if (driver.findElements(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR));
            Thread.sleep(2000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR, "Control Room Number/Name selected");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        }
        if (driver.findElements(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR));
            Thread.sleep(3000);
            act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR, "Instrument Purchase Specification Number selected");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(2000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR, "Instrument Purchase Specification Number selected");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();


        }


        if (driver.findElements(Gig_WorkflowsOBJ.foundatiotagnamepdnR).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.foundatiotagnamepdnR));
            Thread.sleep(2000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.foundatiotagnamepdnR, "Control Room Number/Name selected");
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        }


        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        //changed sync time from 6000 to 4000
        Thread.sleep(2000);
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.gigContinueenabledbtn));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "Save button");


    }

    // pipe process
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
            act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
            if (driver.findElements(Gig_WorkflowsOBJ.worktype).size() > 0) {
                Thread.sleep(3000);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.worktype));
                webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.worktype));
                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.worktype, "select worktype");
                act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
                Thread.sleep(3000);
            }
            if (driver.findElements(Gig_WorkflowsOBJ.txtgiginsturctionR).size() > 0) {
                TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.txtgiginsturctionR);
                TestUtilDemo.doSendKeys(Gig_WorkflowsOBJ.txtgiginsturctionR, "Gig flow autmation");
            }
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(3000);
            if (driver.findElements(Gig_WorkflowsOBJ.PreferredPerformerLocation).size() > 0) {
                TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.PreferredPerformerLocation);
                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.PreferredPerformerLocation, "select preferred");
            }
            act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            Thread.sleep(4000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "select first activity");
            Thread.sleep(2000);
            TestUtilDemo.scrollUpTop();
            Thread.sleep(2000);
            //why we comment below code ?
            if (driver.findElements(Gig_WorkflowsOBJ.step4completedrnd).size() > 0) {
                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
            }
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinueenabledbtn, "Finish Gig flow button clicked");
            Thread.sleep(2000);

        }

        if (driver.findElements(Gig_WorkflowsOBJ.btncomplete).size() > 0) {
            Thread.sleep(3000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.btncomplete, "itration completed and final complete");
        }
    }


    @And("User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive {string},{string}")
    public void userSelectsStepfourGigentsCheckboxAndItValidatesAllTheSelectedValuesInStepfive(String arg0, String submenus) throws InterruptedException {

        // select  step 4 and  check or uncheck Customize Gignet

        String[]  gigcustomize = submenus.split(",");
        String step4activity;
        step4activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", "Customize Gignet").replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step4activity), "select first activity");
        Thread.sleep(1000);
        // we will removed all checked process
        List<WebElement> allprocess = driver.findElements(By.xpath("//div[@class='rectangleBoxes rectangleBoxes_checked']//label"));
        for (WebElement we1 : allprocess) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", we1);
            we1.click();
        }
        Thread.sleep(1000);

        for (int row = 0; row < gigcustomize.length; row++) {
            String giginroproces;
            giginroproces = Gig_WorkflowsOBJ.checkUncheckprocess.toString().replace("textToReplace", gigcustomize[row]).replaceAll("By.xpath:", "");
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(By.xpath(giginroproces)));
            TestUtilDemo.clickElement(By.xpath(giginroproces), "select process");

        }
        Thread.sleep(1000);

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(1000);

        if (driver.findElements(By.xpath(Gig_WorkflowsOBJ.step4completedrnd.toString().replaceAll("By.xpath:", ""))).size() == 1) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
            Thread.sleep(1000);
        }
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
        if (driver.findElements(By.xpath("//div[@class='fragmentStepsDetailsGray']")).size() == 1) {
            Thread.sleep(1000);
            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");
        }


        // select  step 5 and  process the gig information
        String step5activity;
        step5activity = Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace", "Gig Information").replaceAll("By.xpath:", "");
        TestUtilDemo.clickElement(By.xpath(step5activity), "select first activity");
        Thread.sleep(1000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(1000);
        WebDriverWait ww = new WebDriverWait(driver, 30000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
        Thread.sleep(2000);


        for (int row = 0; row < gigcustomize.length; row++) {
            Actions act = new Actions(driver);
            if (row < 5 || row == 8) {
                String ReviewProcessDatasheets;
                ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString().replace("textToReplace", gigcustomize[row]).replaceAll("By.xpath:", "");
                TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                Thread.sleep(3000);
            } else {
                String ReviewProcessDatasheets;
                ReviewProcessDatasheets = Gig_WorkflowsOBJ.equipmentdatasheetlist.toString().replace("textToReplace", gigcustomize[row]).replaceAll("By.xpath:", "").concat(" ");
                TestUtilDemo.clickElement(By.xpath(ReviewProcessDatasheets), "select first activity");
                act.sendKeys(Keys.ARROW_DOWN).build().perform();
                Thread.sleep(3000);
            }

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(By.xpath("//p[text()='Fill In Activity Information']")));
//            TestUtilDemo.clickElement(By.xpath("//p[text()='Fill In Activity Information']"), "test");
//            act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();
            webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.worktype));

            if (driver.findElements(Gig_WorkflowsOBJ.worktype).size() > 0) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.worktype));
                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.worktype, "select worktype");
                act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
            }

            if (driver.findElements(Gig_WorkflowsOBJ.txtgiginsturctionR).size() > 0) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.txtgiginsturctionR));
                TestUtilDemo.doSendKeys(Gig_WorkflowsOBJ.txtgiginsturctionR, "Gig flow autmation");
            }
            if (driver.findElements(Gig_WorkflowsOBJ.PreferredPerformerLocation).size() > 0) {
                Thread.sleep(2000);
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.PreferredPerformerLocation));
                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.PreferredPerformerLocation, "select preferred");
                act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
                Thread.sleep(2000);
            }

            TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "select first activity");
            Thread.sleep(3000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
            if (driver.findElements(Gig_WorkflowsOBJ.step4completedrnd).size()>0) {
                Thread.sleep(1000);
                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
            }
            Thread.sleep(1000);
            if (driver.findElements(Gig_WorkflowsOBJ.step4completedrnd).size()>0){
                Thread.sleep(1000);
                TestUtilDemo.scrollUpTop();
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", driver.findElement(Gig_WorkflowsOBJ.step4completedrnd));
//                TestUtilDemo.clickElement(Gig_WorkflowsOBJ.step4completedrnd, "select first activity");
                driver.findElement(By.xpath("//span[text()='Mark as Completed']/parent::button")).click();
            }



        }

        Thread.sleep(2000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigFinishbtn, "continue button");
        Thread.sleep(2000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.btncomplete, "Completed button");




    }

    @And("uncheck all FragnetStep Information nonreview steps and select first  nonreview step")
    public void uncheckAllFragnetStepInformationNonreviewStepsAndSelectFirstNonreviewStep() throws InterruptedException {
        Thread.sleep(3000);
        int i=0;
        List<WebElement> allprocess = driver.findElements(By.xpath("//div[@class='rectangleBoxes rectangleBoxes_checked']//label"));
        for (WebElement we1 : allprocess) {
            if (i>0) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})", we1);
                we1.click();
            }
            i++;
        }


    }
}

