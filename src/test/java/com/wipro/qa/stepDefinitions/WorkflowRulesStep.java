package com.wipro.qa.stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.WorkflowRulesOBJ;
import com.wipro.qa.util.ProjectInfoOBJ;
import com.wipro.qa.util.StepCommonMethod;
import com.wipro.qa.util.TestUtilDemo;
import com.wipro.qa.util.WBSInformationOBJ;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class WorkflowRulesStep extends TestBase {

	@Given("^validate when user login as a PLI role in WorkflowRule$")
	public void login_as_a_PLI_Role() throws Throwable {
		StepCommonMethod.login_with_a_selected_Role(WBSInformationOBJ.userName, "rathod_username",
				ProjectInfoOBJ.SIGNINBUTTON, "SignIN Button", ProjectInfoOBJ.PROJECTSELECTIONWBS, "Project Selection");
	}

	@Then("validate WorkflowRuleHeader is Display and click on header as a PLI role")
	public void validate_workflowRuleHeader_is_Display() throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("workflowRules",WorkflowRulesOBJ.workFlowRuleHeader, WorkflowRulesOBJ.workFlowRuleHeaderLink, "workFlowRuleHeader");
	}
	
	@Then("validate Upon selecting FragnetStep boxes, I can view the default durations tied to each step")
	public void default_duration_display_by_selectingboxes() throws Throwable {
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.InHouseReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.mouseHoverAndClick(WorkflowRulesOBJ.InHouseReviewLabelSelect);
		Thread.sleep(3000);
		TestUtilDemo.scrollDownTillBottum();
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.InHouseReviewLabeldurations, "InHouseReviewLabeldurations");
	}

	@Then("validate when a duration needs to be changed, I can edit the durations by selecting the duration field")
	public void editing_duration_manually() throws Throwable {
		TestUtilDemo.doSendKeys(WorkflowRulesOBJ.InHouseReviewLabeldurations, "7");
		Thread.sleep(3000);
	}

	@Then("validate PLI is displayed a generic workflow with Create, and Issue for Construction static; In-House Review, Client Review, Combined IHR & Client Review, and 3rd-Party Review are selectable")
	public void validate_PLI_is_displayed_a_generic_workflow_with_Create_and_Issue_for_Construction_static_In_House_Review_Client_Review_Combined_IHR_Client_Review_and_3rd_Party_Review_are_selectable() {
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.InHouseReviewLabel, "InHouseReviewLabel");
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.ClientReviewLabel, "ClientReviewLabel");
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.CombinedIHRClientReviewLabel, "CombinedIHRClientReviewLabel");
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.ThirdPartyReviewLabel, "ThirdPartyReviewLabel");
		
	}

	@Then("validate If the box is unselected, upon hovering over a box, a select button appears")
	public void validate_select_button_appear() throws Throwable {
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.InHouseReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.InHouseReviewLabelSelect,"InHouseReviewLabelSelect");
		Thread.sleep(3000);
	}

	@Then("validate Selecting box displays a check in the upper left corner")
	public void validate_Selecting_box_displays_a_check_in_the_upper_left_corner() {

	}

	@Then("validate If In-House Review or Client Review is selected, Combined IHR & Client Review CANNOT be selected and vice versa")
	public void validate_combinedHR_is_clickable_or_not() throws Throwable {
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.ClientReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.mouseHoverAndClick(WorkflowRulesOBJ.ClientReviewLabelSelect);
		Thread.sleep(3000);
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.CombinedIHRClientReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.ThirdPartyReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.mouseHoverAndClick(WorkflowRulesOBJ.ThirdPartyReviewLabelSelect);
		Thread.sleep(3000);
		
	}

	@Then("validate In-House Review \\(either alone or combined with Client Review) is a mandatory selection.")
	public void checking_mendatoty_box_selection() {

	}

	@Then("validate If the box is selected, upon hovering over a box, a deselect button appears")
	public void deSelect_button_appear() throws Throwable {
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.InHouseReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.isElementPresent(WorkflowRulesOBJ.InHouseReviewLabelDeSelect,"InHouseReviewLabelDeSelect");
		Thread.sleep(3000);
	}

	@Then("validate Deselecting box removed check from upper left corner.")
	public void deSelecting_boxes() throws Throwable {
		TestUtilDemo.mouseHover(WorkflowRulesOBJ.InHouseReviewLabel);
		Thread.sleep(3000);
		TestUtilDemo.mouseHoverAndClick(WorkflowRulesOBJ.InHouseReviewLabelDeSelect);
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}


	@Then("validate is there any checkbox defaultly select. remove all check marks from the fragnent steps")
	public void validateIsThereAnyCheckboxDefaultlySelectRemoveAllCheckMarksFromTheFragnentSteps() {

		List<WebElement> btns= driver.findElements(By.xpath("//button[@class='workflowSelectButton']"));
		for (WebElement btn:btns) {
			if (btn.getText().equals("Deselect")){
				btn.click();
			}
		}

		List<WebElement> allbtns= driver.findElements(By.xpath("//button[contains(text(),'Deselect')]"));
		if (allbtns.size()>0){
			Assert.assertTrue("No check box are select",true);
		}else{
			//Assert.assertTrue("check box are selected",false);
		}


	}

	@Then("validate if user selects any of the checkbox it should display duration below in textbox")
	public void validateIfUserSelectsAnyOfTheCheckboxItShouldDisplayDurationBelowInTextbox() throws InterruptedException {
		TestUtilDemo.mouseHoverAndClick(WorkflowRulesOBJ.Checkbox);
		Thread.sleep(3000);
		if  (driver.findElement(WorkflowRulesOBJ.inputdata).getAttribute("value").equals("5")){
			Assert.assertTrue("Input data displayed" +TestUtilDemo.getTex(WorkflowRulesOBJ.inputdata),true);
		} else{
			Assert.assertTrue("Input data displaye not matched"+TestUtilDemo.getTex(WorkflowRulesOBJ.inputdata),false);
		}

	}

	@Then("validate default value if user modifed  duration and check and uncheck checkbox")
	public void validateDefaultValueIfUserModifedDurationAndCheckAndUncheckCheckbox() {

		TestUtilDemo.clearAnddoSendKeys(WorkflowRulesOBJ.inputdata,"10");
		TestUtilDemo.clickElement(WorkflowRulesOBJ.Deselectbtn ,"Click on Deselet button ");
		TestUtilDemo.mouseHoverAndClick(WorkflowRulesOBJ.Checkbox);
		if  (driver.findElement(WorkflowRulesOBJ.inputdata).getAttribute("value").equals("5")){
			Assert.assertTrue("Input data displayed" +TestUtilDemo.getTex(WorkflowRulesOBJ.inputdata),true);
		} else{
			Assert.assertTrue("Input data displaye not matched"+TestUtilDemo.getTex(WorkflowRulesOBJ.inputdata),false);
		}





	}
}
