package com.wipro.qa.stepDefinitions;

import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.ProjectInfoOBJ;
import com.wipro.qa.util.ReferenceLibraryOBJ;
import com.wipro.qa.util.StepCommonMethod;
import com.wipro.qa.util.TestUtilDemo;
import com.wipro.qa.util.WBSInformationOBJ;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReferenceLibraryStep extends TestBase {

	@Given("when user opens browser to run ReferenceLibrary Script")
	public void when_user_opens_browser_to_run_reference_library_script() throws Throwable {
		StepCommonMethod.login_with_a_selected_Role(WBSInformationOBJ.userName, "rathod_username",
				ProjectInfoOBJ.SIGNINBUTTON, "SignIN Button", ProjectInfoOBJ.PROJECTSELECTIONWBS, "Project Selection");
	}

	@Then("validate ReferenceLibraryHeader is display and click on header Link")
	public void validate_reference_library_header_is_display() throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("referenceLibrary",
				ReferenceLibraryOBJ.referenceLibraryHeader, ReferenceLibraryOBJ.referenceLibraryHeaderLink,
				"AssignTeamHeader");
	}

	@Then("validate ProjectSpecificDocument section is Display and click")
	public void user_click_on_ProjectSpecificDocuments_link() throws Throwable {
		StepCommonMethod.validate_subSection_is_Display_and_click(ReferenceLibraryOBJ.ProjectSpecificDocumentsManagementSection, "ProjectSpecificDocumentsManagementSection");
	}

	@When("Validate user when moving the slider to on position")
	public void validate_user_when_moving_the_slider_to_on_position() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle on");
	}

	@Then("validate moving the slider to on position only editing of name and ID, deletingorpasting of link allowed")
	public void validate_moving_the_slider_to_on_position_only_editing_of_name_and_id_deleting_pasting_of_link_allowed()
			throws Throwable {
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(1000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.nameTextBox, "Automation");
		Thread.sleep(1000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.IDtextBox, "686");
		Thread.sleep(1000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, "https://www.google.com/");
		Thread.sleep(1000);
	}

	@Then("Validate user can save the updated data and link will become a hyperlink to open the file or website")
	public void validate_user_can_save_the_updated_data_and_link_will_become_a_hyperlink_to_open_the_file_or_website()
			throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "Save Button ");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.googleLink, "googleLink");
		Thread.sleep(1000);
		// get current window
		String mainWindowHandle = driver.getWindowHandles().iterator().next();
		// switch back
		driver.switchTo().window(mainWindowHandle);
	}

	@Then("Validate Hovering over link cell will display entire link")
	public void validate_hovering_over_link_cell_will_display_entire_link() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.secondRowText, "secondRowText");
		TestUtilDemo.mouseHover(ReferenceLibraryOBJ.googleLink);
		Thread.sleep(4000);

	}

	@Then("Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click")
	public void validate_user_can_copy_the_existing_row_then_category_copied_and_all_other_columns_blank_and_Save_Complete_and_Edit_button_click()
			throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.copyIcon, "copyIcon Icon ");
		Thread.sleep(2000);
	}

	@When("Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon")
	public void deleting_existing_row() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(1000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.linkTextBox, "linkTextBox only click");
		Thread.sleep(3000);
		TestUtilDemo.mouseHoverAndClick(ReferenceLibraryOBJ.crossIcon);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.crossDeleteButton, "crossDeleteButton");
		Thread.sleep(2000);
	}

	@When("user click on AddReference button")
	public void user_click_on_add_reference_button() throws Throwable {
		TestUtilDemo.scrollDownForLogPage();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.addReferenceButton, "addReference Button ");
		Thread.sleep(2000);

	}

	@Then("validate Newly added row can be saved without ID or link populated")
	public void validate_newly_added_row_can_be_saved_without_id_or_link_populated() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryDropDown, "Automation Category");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryDropDownvalue, "categoryDropDownvalue");
	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to section is display")
	public void click_on_save_complete_button_and_edit_button_and_check_mark_display() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.ProjectSpecificDocumentsManagementCheckedMark, "form completed");
	}

	/************* ProcedureManagement********/
	@When("validate ProcedureManagement section is Display and click")
	public void user_click_on_ProcedureManagement_sub_section() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ClientDocumentsManagementSection,
				"ClientDocumentsManagementSection Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProceduresManagementSection, "ProcedureManagement Section link");
	}

	@Then("validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement")
	public void editing_or_deleting_link_column() throws Throwable {
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(2000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.linkTextBox, "https://www.google.com/");
		Thread.sleep(1000);
	}

	@Then("validate Newly added row can be saved without ID or link populated in ProcedureManagement {string}")
	public void validate_newly_added_row_can_be_saved_without_id_or_link_populated_in_ProcedureManagement(String nameTextbox)
			throws Throwable {

		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.nameTextBoxdocument, nameTextbox);
		Thread.sleep(2000);

	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProcedureManagementsection is display")
	public void click_on_save_complete_button_and_edit_button_display() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.proceduresManagementCheckedMark, "form completed");
		driver.close();
		driver.quit();
	}

	/*
	 * @When("user click on ClientDocumentsManagement SubSection") public void
	 * user_click_on_ClientDocumentsManagement_sub_section() {
	 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.
	 * ClientDocumentsManagementSection, "ClientDocumentsManagementSection link"); }
	 * 
	 * 
	 * @Then("validate Newly added row can be saved without ID or link populated in ClientDocument"
	 * ) public void
	 * validate_newly_added_row_can_be_saved_without_id_or_link_populated_in_ClientDocument
	 * () throws Throwable {
	 * 
	 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryDropDown,
	 * "categoryDropDown "); Thread.sleep(2000);
	 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryDropDownvalue,
	 * "categoryDropDownvalue "); Thread.sleep(2000);
	 * 
	 * TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.nameTextBoxdocument,
	 * "Automation name"); Thread.sleep(2000);
	 * 
	 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "Save Button");
	 * Thread.sleep(2000);
	 * 
	 * }
	 * 
	 * @Then("Validate user can copy the existing row then Category copied and all other columns blank and Save click"
	 * ) public void
	 * validate_user_can_copy_the_existing_row_then_category_copied_and_all_other_columns_blank_and_save_click
	 * () throws Throwable { TestUtilDemo.clickElement(ReferenceLibraryOBJ.copyIcon,
	 * "copyIcon Icon "); Thread.sleep(5000);
	 * TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON,
	 * "SAVE_BUTTON Icon "); Thread.sleep(5000); }
	 * 
	 */

	/*********** Below Code for piping Role *******************************/

	//ProjectSpecificDocumentsPiping
	@Given("validate user login as a piping role for ReferenceLibrary")
	public void user_loging_as_a_piping_role() throws Throwable {
		StepCommonMethod.login_with_a_selected_Role(WBSInformationOBJ.userName, "piping_username",
				ProjectInfoOBJ.SIGNINBUTTON, "SignIN Button", ProjectInfoOBJ.PROJECTSELECTIONWBS, "Project Selection");
	}

	@Then("validate ProjectSpecificDocumentsPiping section is Display and click")
	public void user_click_on_reference_library_header_link() throws Throwable {
		StepCommonMethod.validate_subSection_is_Display_and_click(ReferenceLibraryOBJ.projectSpecificDocumentsPiping,
				"projectSpecificDocumentsPiping");
	}
	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsPipingsection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_piping() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.projectSpecificDocumentsPipingCheckedMark, "form completed");
		}
	
	//ProceduresPiping
	@When("validate ProceduresPiping section is Display and click")
	public void user_click_on_ProcedurePiping_sub_section() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.clientDocumentsPiping,
				"clientDocumentsPiping Link");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.proceduresPiping, "proceduresPiping Section link");
	}

	@When("Validate user click on the save and complete button and then edit button and checked mark next to ProceduresPipingsection is display")
	public void click_on_save_complete_button_and_edit_button_display_in_procedure() throws Throwable {

		StepCommonMethod.save_complete_click_and_edit_display(ReferenceLibraryOBJ.SAVE_BUTTON,
				ReferenceLibraryOBJ.COMPLETE_BUTTON, ReferenceLibraryOBJ.EDIT_BUTTON,
				ReferenceLibraryOBJ.proceduresPipingCheckedMark, "form completed");
		driver.close();
		driver.quit();
	}
	
	////	
	
	@Then("validate Project-Specific, Documents and Client DocumentsProcedures, Calculation Templates, Typical Details, Manuals\\/Handbooks, Training, Historical Documents, and Other all sub sections are display")
	public void validate_all_subSection_is_Display() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ClientDocumentsManagementSection,
				"ClientDocumentsManagementSection");
		TestUtilDemo.scrollDownTillBottum();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProjectSpecificDocumentsStructuralSection,
				"ProjectSpecificDocumentsStructuralSection");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.ProjectSpecificDocumentsStructuralSection,
				"ProjectSpecificDocumentsStructuralSection");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ClientDocumentsStructuralSection,
				"ClientDocumentsStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.ClientDocumentsStructuralSection,
				"ClientDocumentsStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProceduresStructuralSection, "ProceduresStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.ProceduresStructuralSection,
				"ProceduresStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.CalculationTemplatesStructuralSection,
				"CalculationTemplatesStructuralSectionc Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.CalculationTemplatesStructuralSection,
				"CalculationTemplatesStructuralSectionc Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.TypicalDetailsStructuralSection,
				"CalculationTemplatesStructuralSection Link");

		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.TypicalDetailsStructuralSection,
				"CalculationTemplatesStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ManualsHandbooksStructuralSection,
				"ManualsHandbooksStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.ManualsHandbooksStructuralSection,
				"ManualsHandbooksStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.TrainingStructuralSection, "TrainingStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.TrainingStructuralSection, "TrainingStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.OtherStructuralSection, "OtherStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.OtherStructuralSection, "OtherStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ChecklistsStructuralSection, "ChecklistsStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.ChecklistsStructuralSection,
				"ChecklistsStructuralSection Link");
		Thread.sleep(3000);

	}

	@When("Validate user when moving the slider to on position for Select the resource to add to the project")
	public void movingSlider_to_ON_Position() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle Link");
		Thread.sleep(5000);

	}

	@Then("Validate user when moving the slider to off position for DeSelect the resource to add to the project")
	public void movingSlider_to_OFF_Position() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(5000);
	}

	@When("Validate moving the slider on to off position, editing of all fields in row will not be allowed")
	public void validate_moving_the_slider_on_to_off_position_editing_of_all_fields_in_row_will_not_be_allowed()
			throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle Link");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle Link");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(5000);
		// TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTINFORMATION_HEADER,
		// "PROJECTINFORMATION_HEADER Link");
	}

	@When("validate user click on the projectInformation header and then referencelibrary header")
	public void clicking_on_headers() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTINFORMATION_HEADER, "PROJECTINFORMATION_HEADER Link");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.referenceLibraryHeader, "PROJECTINFORMATION_HEADER Link");
		Thread.sleep(3000);
	}

	@Then("Validate for Procedures, Calculation Templates, Typical Details, Manuals\\/Handbooks, Training, Historical Documents, and Other, when moving the slider to on position, only deleting\\/pasting of link allowed.")
	public void validate_movingSlider_to_ON_Position_only_deletingOrPasting_of_link_allowed_in_all_Section()
			throws Throwable {

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProjectSpecificDocumentsManagementSection,
				"ProjectSpecificDocumentsManagementSection Link");
		TestUtilDemo.scrollDownToElementPresent(ReferenceLibraryOBJ.ClientDocumentsStructuralSection);

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProceduresStructuralSection, "ProceduresStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.linkTextBox, "https://www.google.com/");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.CalculationTemplatesStructuralSection,
				"CalculationTemplatesStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.linkTextBox, "https://www.google.com/");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");

		TestUtilDemo.scrollDownTillBottum();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.TypicalDetailsStructuralSection,
				"CalculationTemplatesStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.linkTextBox, "https://www.google.com/");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ManualsHandbooksStructuralSection,
				"ManualsHandbooksStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.linkTextBox, "https://www.google.com/");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);
		TestUtilDemo.scrollDownTillBottum();

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.TrainingStructuralSection, "TrainingStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.addReferenceButton, "addReferenceButton Link");
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.nameTextBox, "Automation Structural");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.IDtextBox, "9876");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.linkTextBox, "https://www.google.com/");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.OtherStructuralSection, "OtherStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.addReferenceButton, "addReferenceButton Link");
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.nameTextBox, "Automation Structural");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.IDtextBox, "9876");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.linkTextBox, "https://www.google.com/");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);
		TestUtilDemo.scrollDownTillBottum();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ChecklistsStructuralSection, "ChecklistsStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.linkTextBox, "https://www.google.com/");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);

	}

	@Then("validate for Project-Specific Documents or Client Documents, when moving the slider to on position, editing of name and ID, deleting\\/pasting of link allowed.")
	public void validate_slider_is_ON_in_ProjectSpecificDocuments_And_ClientDocuments() throws Throwable {
		TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTINFORMATION_HEADER, "PROJECTINFORMATION_HEADER Link");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.referenceLibraryHeader, "PROJECTINFORMATION_HEADER Link");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProjectSpecificDocumentsManagementSection,
				"ProjectSpecificDocumentsManagementSection Link");
		TestUtilDemo.scrollDownToElementPresent(ReferenceLibraryOBJ.ChecklistsManagementSection);

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProjectSpecificDocumentsStructuralSection,
				"ProjectSpecificDocumentsStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.nameTextBox, "Automation");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.IDtextBox, "56789");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.linkTextBox, "https://www.google.com/");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ClientDocumentsStructuralSection,
				"ClientDocumentsStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.toggle, "toggle Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.nameTextBox, "Automation");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.IDtextBox, "56789");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.linkTextBox, "https://www.google.com/");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);

	}

	@Then("validate clicking in the link cell for a given row, a blank will appear and allow copying in a url to a specific document file For Procedures, Calculation Templates, Typical Details, Manuals\\/Handbooks, Training, Historical Documents, and Other default link with display from the master that must be deleted prior to pasting in a new link")
	public void Default_link_with_display_from_the_master_that_must_be_deleted_prior_to_pasting_in_a_newLink() {

		System.out.println(
				"Implementation not done since data not available in Master DB , Data avail for PLI not for DPS");
	}

	@Then("validate clicking in the link cell for a given row that already has a link populated, the DPS can choose to delete the link by selecting X icon")
	public void validate_by_clicking_on_X_icon_in_the_link_cell() throws Throwable {

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ClientDocumentsStructuralSection,
				"ClientDocumentsStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.linkTextBox, "linkTextBox");
		TestUtilDemo.mouseHoverAndClick(ReferenceLibraryOBJ.crossIcon);
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.crossDeleteButton, "crossDeleteButton");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);
	}

	@Then("After clicking out of the link cell, the link will become a hyperlink to open open Project Wise app and display")
	public void validate_user_click_on_hyperlink_in_linkCell() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProjectSpecificDocumentsStructuralSection,
				"ProjectSpecificDocumentsStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.link, "link Link");
	}

	@Then("Hovering over link cell will display entire link.")
	public void hovering_over_link_cell_will_display_entire_link() {
		TestUtilDemo.mouseHover(ReferenceLibraryOBJ.link);

	}

	@When("validate After selecting to add additional document, a new row will appear at the bottom of the table with fields to complete")
	public void validate_user_click_on_addreference_Button() throws Throwable {

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ClientDocumentsStructuralSection,
				"ClientDocumentsStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.addReferenceButton, "addReferenceButton Link");
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.nameTextBox, "Automation Structural");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);

	}

	@Then("validate Name, Category, link, ID column display for Project Specific Document")
	public void validate_Name_Category_link_ID_column_display_for_Project_Specific_Document() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProjectSpecificDocumentsStructuralSection,
				"ProjectSpecificDocumentsStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.CategoryColumn, "CategoryColumn column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.NameColumn, "NameColumn Column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.IDColumn, "IDColumn column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.LinkColumn, "LinkColumn Column");

	}

	@Then("validate Name, link, ID column display for Procedures, Calculation Templates, Typical Details, Manuals\\/Handbooks, Training, Historical Documents sections")
	public void validate_Name_link_ID_column_display_for_Procedures_Calculation_Templates_Typical_Details_Manuals_Handbooks_Training_Historical_Documents_sections() {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProceduresStructuralSection, "ProceduresStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.NameColumn, "NameColumn Column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.IDColumn, "IDColumn column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.LinkColumn, "LinkColumn Column");

		TestUtilDemo.scrollDown();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.CalculationTemplatesStructuralSection,
				"CalculationTemplatesStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.NameColumn, "NameColumn Column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.IDColumn, "IDColumn column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.LinkColumn, "LinkColumn Column");

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.TypicalDetailsStructuralSection,
				"TypicalDetailsStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.NameColumn, "NameColumn Column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.IDColumn, "IDColumn column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.LinkColumn, "LinkColumn Column");
		TestUtilDemo.scrollDown();

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ManualsHandbooksStructuralSection,
				"ManualsHandbooksStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.NameColumn, "NameColumn Column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.IDColumn, "IDColumn column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.LinkColumn, "LinkColumn Column");

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.TrainingStructuralSection, "TrainingStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.NameColumn, "NameColumn Column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.IDColumn, "IDColumn column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.LinkColumn, "LinkColumn Column");
		TestUtilDemo.scrollDown();

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.OtherStructuralSection, "OtherStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.NameColumn, "NameColumn Column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.IDColumn, "IDColumn column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.LinkColumn, "LinkColumn Column");

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ChecklistsStructuralSection, "ChecklistsStructuralSection Link");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.NameColumn, "NameColumn Column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.IDColumn, "IDColumn column");
		TestUtilDemo.isElementPresent(ReferenceLibraryOBJ.LinkColumn, "LinkColumn Column");
	}

	@Then("validate newly added row can be saved without ID or link populated")
	public void validate_newly_added_row_can_be_saved_without_ID_or_link_populated() throws Throwable {

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ChecklistsStructuralSection, "ChecklistsStructuralSection Link");
		TestUtilDemo.scrollDownForLogPage();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.addReferenceButton, "addReferenceButton Link");
		TestUtilDemo.doSendKeys(ReferenceLibraryOBJ.nameTextBox, "Automation Structural");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);

	}

	@Then("validate editing and saving of the user added document name, ID, and category fields can be completed only for Project-Specific Documents and Client Documents")
	public void validate_editing_and_saving_of_the_user_added_document_name_ID_and_category_fields_can_be_completed_only_for_Project_Specific_Documents_and_Client_Documents()
			throws Throwable {

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ChecklistsStructuralSection, "ChecklistsStructuralSection Link");
		TestUtilDemo.scrollUP();
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ProceduresStructuralSection, "ProceduresStructuralSection Link");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(3000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.nameTextBox, "Edited Name");
		Thread.sleep(3000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.IDtextBox, "77556");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);

		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ClientDocumentsStructuralSection,
				"ClientDocumentsStructuralSection Link");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.categoryTextLink, "categoryTextLink");
		Thread.sleep(3000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.nameTextBox, "Edited Name");
		Thread.sleep(3000);
		TestUtilDemo.clearAnddoSendKeys(ReferenceLibraryOBJ.IDtextBox, "77556");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(3000);
	}

	@Then("validate Deleting, re-pasting and saving of the link field can be completed")
	public void validate_Deleting_re_pasting_and_saving_of_the_link_field_can_be_completed() {
		System.out.println("Hover method not implemented");

	}

	@Then("validate Upon losing the focus from the Category box for newly added custom row user will be prompted to enter category\\/name accordingly or delete row")
	public void validate_focus_out_message_on_category() {
		System.out.println("Bug created not fixed yet");

	}

	@Then("validate Name box for Procedures, Calculation Templates, Typical Details, Manuals\\/Handbooks, Training, Historical Documents, and Other for newly added custom row user will be prompted to enter category\\/name accordingly or delete row")
	public void validate_focus_out_message_on_Name() {
		System.out.println("Bug created not fixed yet");

	}

	@Then("validate For Project-Specific Documents and Client Documents, DPS can select copy\\/duplicate which will create new row under line of selection with the Category copied, and all other columns blank")
	public void validate_copy_feature() throws Throwable {
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.ClientDocumentsStructuralSection,
				"ClientDocumentsStructuralSection Link");
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.copyIcon, "copyIcon Icon ");
		Thread.sleep(5000);
		TestUtilDemo.clickElement(ReferenceLibraryOBJ.SAVE_BUTTON, "SAVE_BUTTON Icon ");
		Thread.sleep(5000);

	}

	@Then("validate All user added rows \\(either by duplicate or by Add Reference) can be deleted by selecting the trash can on the far right of the row.")
	public void validate_All_user_added_rows_either_by_duplicate_or_by_Add_Reference_can_be_deleted_by_selecting_the_trash_can_on_the_far_right_of_the_row() {
		driver.close();
		driver.quit();

	}

}
