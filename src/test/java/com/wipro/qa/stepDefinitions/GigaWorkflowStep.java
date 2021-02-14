package com.wipro.qa.stepDefinitions;

import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.List;

public class GigaWorkflowStep extends TestBase {




    @Given("user login with gig workflow permission")
    public void userLoginWithGigWorkflowPermission(DataTable logindetails) throws Throwable {

        List<List<String>> login =logindetails.asLists();
        ProjectID = login.get(1).get((2));
        StepCommonMethod.login_with_a_selected_Role(ProjectInfoOBJ.LABEL_USERNAME, login.get(1).get(0),
              ProjectInfoOBJ.LABEL_PASSWORD ,login.get(1).get(1),  ProjectInfoOBJ.SIGNINBUTTON   );
        ProjectID =  login.get(1).get(2);
        String getprojectID ;
        getprojectID= ProjectInfoOBJ.selectProjectCard.toString().replace("textToReplace",ProjectID).replaceAll("By.xpath:","");
        ProjectInfoOBJ.selectProjectCard =null;
        ProjectInfoOBJ.selectProjectCard= By.xpath(getprojectID);
        Thread.sleep(3000);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(ProjectInfoOBJ.selectProjectCard) );
        TestUtilDemo.clickElement(ProjectInfoOBJ.selectProjectCard,"select Project card");

    }



    @And("user select  giga workflow from top menu")
    public void userSelectGigaWorkflowFromTopMenu() {
        TestUtilDemo.clickElement( Gig_WorkflowsOBJ.gigHeader , " Click on Giga workflow");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.activityDropdownbox) );


    }

    @And("user select the option gig workflow  dropdown")
    public void userSelectTheOptionGigWorkflowDropdown() {
        TestUtilDemo.clickElement( Gig_WorkflowsOBJ.activityDropdownbox , "click on the drop down");
    }


    @And("user select activity information and fill the details")
    public void userSelectActivityInformationAndFillTheDetails(DataTable  activity) throws InterruptedException {
        List<List<String>>  activityinfo  = activity.asLists();
        String step1activity ;
        step1activity= Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace",activityinfo.get(1).get(0)).replaceAll("By.xpath:","");
        TestUtilDemo.clickElement(By.xpath(step1activity),"select first activity");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(Gig_WorkflowsOBJ.subtypedrpdnR) );

        Actions act = new Actions(driver);
        act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.subtypedrpdnR,"subtype selected");
        act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        boolean founds= false;

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR,"subtype selected");
        TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR);
        act.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP).build().perform();
        act.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP).build().perform();
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.instPurchaseSpecNudrpdnR,"subtype selected");
        act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        Thread.sleep(3000);



        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmenttagorNamedrpdnR,"subtype selected");
        act.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        Thread.sleep(300);

        TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.equipmentCategorydrpdnR);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.equipmentCategorydrpdnR,"subtype selected");
        act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();


        Thread.sleep(300);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.electricalEquiNuorNadrpdnR,"subtype selected");
        act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();


        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.powerhouseTagNadrpdnR,"subtype selected");
        act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.controlRoomNuorNamdrpdnR,"subtype selected");
        act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();

        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "Save button");


    }

    @And("user select Customize Fragnet and fill the details")
    public void userSelectCustomizeFragnetAndFillTheDetails(DataTable  fragnet) throws InterruptedException {
        List<List<String>>  customizeFragnet  = fragnet.asLists();
        String step2activity ;
        step2activity= Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace",customizeFragnet.get(1).get(0)).replaceAll("By.xpath:","");
        TestUtilDemo.clickElement(By.xpath(step2activity),"select first activity");
        Thread.sleep(3000);
//        String totalbudget =  TestUtilDemo.getTex(By.xpath("//div[@class='totalBudgetLabel']"));
//        TestUtilDemo.clearAnddoSendKeys(Gig_WorkflowsOBJ.manhours , (Integer.parseInt(totalbudget)-2)+"");
//        Thread.sleep(2000);
//        Assert.assertTrue(TestUtilDemo.isElementPresent(Gig_WorkflowsOBJ.redvalidation,"exists"));
//        TestUtilDemo.clearAnddoSendKeys(Gig_WorkflowsOBJ.manhours , (Integer.parseInt(totalbudget))+"");
//        Thread.sleep(1000);
//        Assert.assertTrue(TestUtilDemo.isElementPresent(Gig_WorkflowsOBJ.greenvalidation,"exists"));


        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");

    }

    @And("user select FragnetStep Information and fill the details")
    public void userSelectFragnetStepInformationAndFillTheDetails(DataTable  custfragnet) throws InterruptedException {

        List<List<String>>  cFragnet  = custfragnet.asLists();
        String step3activity ;
        step3activity= Gig_WorkflowsOBJ.allSteos.toString().replace("textToReplace",cFragnet.get(1).get(0)).replaceAll("By.xpath:","");
        TestUtilDemo.clickElement(By.xpath(step3activity),"select first activity");
        Thread.sleep(3000);
       TestUtilDemo.scrollUpToElementPresent(Gig_WorkflowsOBJ.fragnettxt);
        String totalbudget =  TestUtilDemo.getTex(By.xpath("//div[@class='totalBudgetLabel']"));
        TestUtilDemo.clearAnddoSendKeys(Gig_WorkflowsOBJ.manhours , (Integer.parseInt(totalbudget.replaceAll("[^0-9]", ""))-2)+"");
        Thread.sleep(2000);
        Assert.assertTrue(TestUtilDemo.isElementPresent(Gig_WorkflowsOBJ.redvalidation,"exists"));
        TestUtilDemo.clearAnddoSendKeys(Gig_WorkflowsOBJ.manhours , (Integer.parseInt(totalbudget.replaceAll("[^0-9]",""))+""));
        Thread.sleep(1000);
        Assert.assertTrue(TestUtilDemo.isElementPresent(Gig_WorkflowsOBJ.greenvalidation,"exists"));


        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigSavebtn, "Save button");
        Thread.sleep(3000);
        TestUtilDemo.clickElement(Gig_WorkflowsOBJ.gigContinuebtn, "continue button");


    }
}
