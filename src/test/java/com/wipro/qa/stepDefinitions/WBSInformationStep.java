package com.wipro.qa.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.WBSInformationOBJ;
import com.wipro.qa.util.AssignTeamOBJ;
import com.wipro.qa.util.ProjectInfoOBJ;
import com.wipro.qa.util.StepCommonMethod;
import com.wipro.qa.util.TestUtilDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WBSInformationStep extends TestBase {

	@Given("^validate when user login as a PLI role in WBSInformation$")
	public void login_as_a_PLI_role() throws Throwable {
		StepCommonMethod.login_with_a_selected_Role(WBSInformationOBJ.userName, "rathod_username",
				ProjectInfoOBJ.SIGNINBUTTON, "SignIN Button", ProjectInfoOBJ.PROJECTSELECTIONWBS, "Project Selection");
	}

	@Then("validate WBSInformationHeader is Display and click on header")
	public void validate_wbs_information_header_is_display() throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("wbsInformation",WBSInformationOBJ.WBSInformationHeader, WBSInformationOBJ.WBSInformationHeaderLink, "WBSInformation");
	}

	@Then("validate CWAList section text is Display")
	public void validate_cwa_list_section_text_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.CWAListSection, "CWAListSection Text");
	}

	@Then("validate ModuleList section text is Display")
	public void validate_module_list_section_text_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.moduleListSection, "moduleListSection Text");
	}

	@Then("validate PurchaseSpecificationList Section text is Display")
	public void validate_purchase_specification_list_section_text_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.purchaseListSection, "purchaseListSection Text");
	}

	@Then("validate MechanicalEquipmentList Section text is Display")
	public void validate_mechanical_equipment_list_section_text_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.mechanicalListSection, "mechanicalListSection Text");
	}

	@When("^user click on CWAList SubSection$")
	public void user_click_on_cwa_list_sub_section() {
		TestUtilDemo.clickElement(WBSInformationOBJ.CWAListSection, "CWAListSection Link");
	}

	@Then("validate CWAList HeaderTitle is Display")
	public void validate_cwa_list_header_title_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.CWAListTopText, "CWAListTopText");
	}

	@Then("validate CWA ExportList Template is Display")
	public void validate_cwa_export_list_template_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.exportListTemplate, "exportListTemplate");
	}

	@Then("validate importButton is Display")
	public void validate_import_button_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.importButton, "importButton link");
	}

	@Then("validate searchIcon is Display")
	public void validate_search_icon_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.searchIcon, "searchIcon ");
	}

	@Then("validate CWA number column is display")
	public void validate_cwa_number_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.CWANumberColumn, "CWANumber Column Text");
	}

	@Then("validate CWA name column is display")
	public void validate_cwa_name_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.CWANameColumn, "CWAName Column  Text");
	}

	@Then("validate addRow Icon is Display at bottom")
	public void validate_add_row_icon_is_display_at_bottom() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.addRowButton, "addRowButton");
	}

	@Then("Validate user click on CWAList SubSection")
	public void Validate_user_click_on_CWAList_SubSection() {
		TestUtilDemo.clickElement(WBSInformationOBJ.CWAListSection, "CWAListSection  Link");
	}

	@Then("validate user click on the addRow Icon")
	public void validate_user_click_on_the_add_row_icon() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton  Link");
		Thread.sleep(2000);
	}

	@Then("Validate user enter the CWA Number and CWA Name {string},{string}")
	public void validate_user_enter_the_cwa_number_and_cwa_name( String CWANumberTextBox, String CWANameTextBox ) throws Throwable {
		TestUtilDemo.doSendKeys(WBSInformationOBJ.CWANumberTextBox,  CWANumberTextBox);
		//TestUtilDemo.doSendKeys(WBSInformationOBJ.CWANumberTextBox, CWANumberTextBox );
				Thread.sleep(2000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.CWANameTextBox, CWANameTextBox);
		Thread.sleep(2000);
	}

	@Then("Validate save button is enabled")
	public void validate_save_button_is_enabled() throws Throwable {
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "save button");
		Thread.sleep(2000);
	}

	@Then("Validate user click on the save button")
	public void validate_user_click_on_the_save_button() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "save button click");
		Thread.sleep(2000);
	}

	@Then("validate save button is disabled")
	public void validate_save_button_is_disabled() {
		System.out.println("soonnnnnnnn");
	}

	@Then("validate complete button is enabled")
	public void validate_complete_button_is_enabled() throws Throwable {
		TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON, "Complete button");
		Thread.sleep(2000);
	}

	/*
	 * @Then("validate user edit the row") public void validate_user_edit_the_row()
	 * throws Throwable {
	 * TestUtilDemo.clickElement(WBSInformationOBJ.CWANumberTextBoxEdit,
	 * "CWANumberTextBoxEdit "); Thread.sleep(3000);
	 * TestUtilDemo.doSendKeys(WBSInformationOBJ.CWANumberTextBoxEdit1, "Edited ");
	 * Thread.sleep(5000); }
	 *
	 * @Then("validate user reset the data") public void
	 * validate_user_reset_the_data() throws Throwable {
	 * TestUtilDemo.clickElement(WBSInformationOBJ.RESET_BUTTON, "Reset button ");
	 * Thread.sleep(2000); String message =
	 * TestUtilDemo.getTex(ProjectInfoOBJ.resetMessage, " Reset message text");
	 * Assert.
	 * assertEquals("Reset will revert all displayed information to the last saved version. Continue?"
	 * , message); TestUtilDemo.clickElement(ProjectInfoOBJ.continueButton,
	 * "continue Button click"); Thread.sleep(2000); Thread.sleep(5000);
	 * TestUtilDemo.clickElement(WBSInformationOBJ.CWANumberTextBoxEdit,
	 * "CWANumberTextBox "); Thread.sleep(2000);
	 *
	 * }
	 *
	 * @Then("validate user again edit the row") public void
	 * validate_user_again_edit_the_row() throws InterruptedException {
	 * Thread.sleep(5000);
	 * TestUtilDemo.clickElement(WBSInformationOBJ.CWANumberTextBoxEdit,
	 * "CWANumberTextBox "); Thread.sleep(2000);
	 * TestUtilDemo.doSendKeys(WBSInformationOBJ.CWANumberTextBoxEdit, "54321 ");
	 * Thread.sleep(2000); }
	 *
	 * @Then("Validate save button is enabled and save the updated data") public
	 * void validate_save_button_is_enabled_and_save_the_updated_data() throws
	 * Throwable { TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON,
	 * "Save Button click "); Thread.sleep(5000); }
	 *
	 * @Then("validate updated data is display") public void
	 * validate_updated_data_is_display() throws Throwable { String text =
	 * TestUtilDemo.getTex(WBSInformationOBJ.CWANumberTextBox, "CWANumber data ");
	 * Assert.assertEquals("54321", text); Thread.sleep(2000); }
	 */

	@Then("validate user click on complete button")
	public void validate_user_click_on_complete_button() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON  click ");
		Thread.sleep(5000);

	}

	/****************************** Below code for the Module List Section*******************************/

	@When("user click on ModuleList SubSection")
	public void user_click_on_ModuleList_sub_section() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.moduleListSection, "ModuleListSection Link");
		Thread.sleep(3000);
	}

	@Then("validate ModuleList HeaderTitle is Display")
	public void validate_ModuleList_header_title_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.moduleListTopText, "ModuleListTopText");
	}

	@Then("validate ModuleList ExportList Template is Display")
	public void validate_Module_export_list_template_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.exportListTemplate, "exportListTemplate");
	}

	@Then("validate importButton2 is Display")
	public void validate_import_button2_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.importButton, "importButton link");
	}

	@Then("validate searchIcon2 is Display")
	public void validate_search_icon2_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.searchIcon, "searchIcon ");
	}

	@Then("validate Module number column is display")
	public void validate_Module_number_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.moduleNumberColumn, "moduleNumberColumn Text");
	}

	@Then("validate module name column is display")
	public void validate_module_name_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.moduleNameColumn, "moduleNameColumn  Text");
	}

	@Then("validate CWA Numbersname column is display")
	public void validate_cwa_numbers_name_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.CWANumberNameColumn, "CWANumberNameColumn   Text");
	}

	@Then("validate addRow Icon2 is Display at bottom")
	public void validate_add_row_icon2_is_display_at_bottom() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.addRowButton, "addRowButton");
	}

	@Then("Validate user click on ModuleList SubSection")
	public void Validate_user_click_on_ModuleList_SubSection() {
		TestUtilDemo.clickElement(WBSInformationOBJ.moduleListSection, "CWAListSection  Link");
	}

	@Then("validate user click on the addRow Icon2")
	public void validate_user_click_on_the_add_row_icon2() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton  Link");
		Thread.sleep(2000);
	}
	@Then("Validate user enter the Modulenumber and modulename and CWA Numbername {string},{string}")
	public void Validate_user_enter_the_Modulenumber_and_modulename_and_CWANumbername(String moduleNumberColumnTextBox,String moduleNameColumnTextBox) throws Throwable {
		TestUtilDemo.doSendKeys(WBSInformationOBJ.moduleNumberColumnTextBox, moduleNumberColumnTextBox);
		Thread.sleep(2000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.moduleNameColumnTextBox, "ModuleTest");
		Thread.sleep(2000);
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.cwaNumberNameDropDown, 1, moduleNameColumnTextBox );

		Thread.sleep(2000);
	}

	@Then("Validate save2 button is enabled")
	public void validate_save2_button_is_enabled() throws Throwable {
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "save button");
		Thread.sleep(2000);
	}

	@Then("Validate user click on the save2 button")
	public void validate_user_click_on_the_save2_button() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "save button click");
		Thread.sleep(2000);
	}

	@Then("validate save2 button is disabled")
	public void validate_save2_button_is_disabled() {
		System.out.println("soonnnnnnnn");
	}

	@Then("validate complete2 button is enabled")
	public void validate_complete2_button_is_enabled() throws Throwable {
		TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON, "Complete button");
		Thread.sleep(2000);
	}

	@Then("validate user click on complete2 button")
	public void validate_user_click_on_complete2_button() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "Complete button Click");
		Thread.sleep(2000);
	}

	/************************* Below code for the PurchaseSpecificationList Section*********************************/

	@When("user click on PurchaseSpecificationList SubSection")
	public void user_click_on_PurchaseSpecificationList_sub_section() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.moduleListSection, "ModuleListSection Link");
		TestUtilDemo.scrollDown();
		TestUtilDemo.clickElement(WBSInformationOBJ.purchaseListSection, "PurchaseSpecificationListSection Link");
		Thread.sleep(3000);
	}

	@Then("validate PurchaseSpecificationList HeaderTitle is Display")
	public void validate_PurchaseSpecificationList_header_title_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.purchaseSpecificationTopText,
				"PurchaseSpecificationListTopText");
	}

	@Then("validate PurchaseSpecificationList ExportList Template is Display")
	public void validate_PurchaseSpecificationList_export_list_template_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.exportListTemplate, "exportListTemplate");
	}

	@Then("validate importButton3 is Display")
	public void validate_import_button3_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.importButton, "importButton link");
	}

	@Then("validate searchIcon3 is Display")
	public void validate_search_icon3_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.searchIcon, "searchIcon ");
	}

	@Then("validate PurchaseSpecificationNumber column is display")
	public void validate_PurchaseSpecificationNumber_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.purchaseSpecificationNumberColumn,
				"PurchaseSpecificationNumber DropDown");
	}

	@Then("validate PurchaseSpecificationName column is display")
	public void validate_PurchaseSpecificationName_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.purchaseSpecificationNameColumn,
				"purchaseSpecificationNameColumn  Text");
	}

	@Then("validate Discipline column is display")
	public void validate_Discipline_column_is_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.disciplineColumn, "disciplineColumn Text");
	}

	@Then("validate addRow Icon3 is Display at bottom")
	public void validate_add_row_icon3_is_display_at_bottom() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.addRowButton, "addRowButton");
	}

	@Then("Validate user click on PurchaseSpecificationList SubSection")
	public void Validate_user_click_on_PurchaseSpecificationList_SubSection() {
		TestUtilDemo.clickElement(WBSInformationOBJ.purchaseListSection, "CWAListSection  Link");
	}

	@Then("validate user click on the addRow Icon3")
	public void validate_user_click_on_the_add_row_icon3() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton  Link");
		Thread.sleep(3000);
	}

	@Then("Validate user enter the value in PurchaseSpecificationNumber and PurchaseSpecificationName and Discipline column")
	public void Validate_user_enter_the_value_in_PurchaseSpecificationNumber_and_PurchaseSpecificationName_and_Discipline()
			throws Throwable {
		TestUtilDemo.dropDownSelect(WBSInformationOBJ.purchaseSpecificationNumberColumnDropDown, "61",
				"purchaseSpecificationNumberColumnDropDown ");
		Thread.sleep(3000);

		TestUtilDemo.clickElement(WBSInformationOBJ.rowClick, "rowClick");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.disciplineColumnTextBox, "Auto");
		Thread.sleep(3000);
		TestUtilDemo.clickElement(WBSInformationOBJ.rowClick, "rowClick");
		Thread.sleep(3000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.purchaseSpecificationNameColumnTextBox, "E");
		Thread.sleep(3000);

	}

	@Then("Validate save3 button is enabled")
	public void validate_save3_button_is_enabled() throws Throwable {
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "save button");
		Thread.sleep(3000);
	}

	@Then("Validate user click on the save3 button")
	public void validate_user_click_on_the_save3_button() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "save button click");
		Thread.sleep(3000);
	}

	@Then("validate save3 button is disabled")
	public void validate_save3_button_is_disabled() {
		//System.out.println("soonnnnnnnn");

	}

	@Then("validate complete3 button is enabled")
	public void validate_complete3_button_is_enabled() {
		TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON, "Complete button Enabled");

	}

	@Then("validate user click on complete button3")
	public void validate_user_click_on_complete_button3() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "Complete button");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

	/***************************
	 * MechanicalEquipmentList SubSection
	 *************************************/
	/*
	 * @Then("user click on MechanicalEquipmentList SubSection") public void
	 * user_click_on_mechanical_equipment_list_sub_section() throws Throwable {
	 * TestBase.initialization();
	 * TestUtilDemo.doSendKeys(ProjectInfoOBJ.LABEL_USERNAME,
	 * prop.getProperty("username"));
	 * TestUtilDemo.doSendKeys(ProjectInfoOBJ.LABEL_PASSWORD,
	 * prop.getProperty("password")); Thread.sleep(3000);
	 * TestUtilDemo.clickElement(ProjectInfoOBJ.SIGNINBUTTON, "SignIN Button");
	 * Thread.sleep(2000);
	 * TestUtilDemo.clickElement(ProjectInfoOBJ.PROJECTSELECTION,
	 * "Project Selection");
	 *
	 * TestUtilDemo.clickElement(WBSInformationOBJ.WBSInformationHeader,
	 * "WBSInformationHeader Link"); Thread.sleep(3000);
	 *
	 * TestUtilDemo.clickElement(WBSInformationOBJ.mechanicalListSection,
	 * "MechanicalEquipmentList Link"); Thread.sleep(3000);
	 *
	 * }
	 *
	 * @Then("validate MechanicalEquipmentList HeaderTitle is Display") public void
	 * validate_mechanical_equipment_list_header_title_is_display() {
	 * System.out.println("Xapth****************"); }
	 *
	 * @Then("validate MechanicalEquipmentList ExportList Template is Display")
	 * public void
	 * validate_mechanical_equipment_list_export_list_template_is_display() {
	 * TestUtilDemo.isElementPresent(WBSInformationOBJ.exportListTemplate,
	 * "exportListTemplate"); }
	 *
	 * @Then("validate EquipmentTag column is display") public void
	 * validate_equipment_tag_column_is_display() {
	 * TestUtilDemo.isElementPresent(WBSInformationOBJ.EquipmentTagColumn,
	 * "EquipmentTag Column"); }
	 *
	 * @Then("validate EquipmentName column is display") public void
	 * validate_equipment_name_column_is_display() {
	 * TestUtilDemo.isElementPresent(WBSInformationOBJ.EquipmentNameColumn,
	 * "EquipmentNameColumn"); }
	 *
	 * @Then("validate EquipmentType column is display") public void
	 * validate_equipment_type_column_is_display() {
	 * TestUtilDemo.isElementPresent(WBSInformationOBJ.EquipmentTypeColumn,
	 * "EquipmentType Column"); }
	 *
	 * @Then("validate purchaseSpecificationNumberName column is display") public
	 * void validate_purchase_specification_number_name_column_is_display() {
	 * TestUtilDemo.isElementPresent(WBSInformationOBJ.
	 * purchasespecificationnumbernameColumn,
	 * "purchasespecificationnumbername Column"); }
	 *
	 * @Then("validate ProcessAreaIDName column is display") public void
	 * validate_process_area_id_name_column_is_display() {
	 * TestUtilDemo.isElementPresent(WBSInformationOBJ.ProcessAreaIDNameColumn,
	 * "ProcessAreaIDName Column"); }
	 *
	 * @When("Validate user click on MechanicalEquipmentList SubSection") public
	 * void validate_user_click_on_mechanical_equipment_list_sub_section() {
	 * TestUtilDemo.isElementPresent(WBSInformationOBJ.mechanicalListSection,
	 * "mechanicalListSection link"); }
	 *
	 * @Then("Validate user enter the value in EquipmentTag, EquipmentName, EquipmentType,purchaseSpecificationNumberName, ProcessAreaIDName and CWANumberName column"
	 * ) public void
	 * validate_user_enter_the_value_in_equipment_tag_equipment_name_equipment_type_purchase_specification_number_name_process_area_id_name_and_cwa_number_name_column
	 * () throws Throwable {
	 * TestUtilDemo.doSendKeys(WBSInformationOBJ.EquipmentTagColumnTextBox,
	 * "EquipmentTagColumnTextBox "); Thread.sleep(2000);
	 * TestUtilDemo.doSendKeys(WBSInformationOBJ.EquipmentNameColumnTextBox,
	 * "1234 "); Thread.sleep(2000);
	 * TestUtilDemo.dropDownSelect(WBSInformationOBJ.equipmentTypedropDown, "Pump",
	 * "moduleNameColumnTextBox  "); Thread.sleep(2000);
	 * TestUtilDemo.dropDownSelect(WBSInformationOBJ.
	 * purchaseSpecificationNumberNamedropDown, "",
	 * "purchaseSpecificationNumberNamedropDown"); Thread.sleep(2000);
	 *
	 * TestUtilDemo.dropDownSelect(WBSInformationOBJ.processAreaIdNamedropDown,
	 * "1234-abc", "moduleNameColumnTextBox  ");
	 * TestUtilDemo.dropDownSelect(WBSInformationOBJ.cwaNumberNameDropDown,
	 * "1234-abc", "moduleNameColumnTextBox  ");
	 *
	 * Thread.sleep(2000);
	 *
	 * }
	 *
	 * @Then("validate complete4 button is enabled") public void
	 * validate_complete4_button_is_enabled() {
	 * TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON,
	 * "COMPLETE_BUTTON enabled"); }
	 */

	/****************** Below code for Piping DPS Role**********************/

	@Given("Validate DPS Piping discipline user loged in and select project")
	public void validate_DPS_logged_as_piping() throws Throwable {
		StepCommonMethod.login_with_a_selected_Role(WBSInformationOBJ.userName, "piping_username",
				ProjectInfoOBJ.SIGNINBUTTON, "SignIN Button", ProjectInfoOBJ.PROJECTSELECTIONWBS, "Project Selection");
	}

	@When("validate WBSInformationHeader is Display and click on header as a Piping DPS")
	public void click_on_WBSInformationHeader_Link()throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("wbsInformation",WBSInformationOBJ.WBSInformationHeader, WBSInformationOBJ.WBSInformationHeaderLink, "WBSInformation");
	}

	@When("validate As a DPS assigned to Piping discipline I will see sections:  Pipe Specification List, Tie-in Priority List")
	public void validate_PipeSpecificationList_and_TieinPriorityList_display() {

		TestUtilDemo.isElementPresent(WBSInformationOBJ.PipeSpecificationList, "PipeSpecificationList Section");
		TestUtilDemo.isElementPresent(WBSInformationOBJ.TieinPriorityList, "TieinPriorityList Section");
	}

	@Then("validate viewing data that needs to be updated, I can click on Pipe Specification List, Tie-in Priority List to addOrupdate the data and changes have been made on the screen the Save button enable. {string},{string},{string},{string}")
	public void validate_DataAdding_for_PipeSpecificationList_and_TieinPriorityList(String pipeSpecificationNumber, String pipeSpecificationMaterial, String pipeSpecificationClass, String tieInPriority) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.PipeSpecificationList, "PipeSpecificationList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationNumber,pipeSpecificationNumber );
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationMaterial,pipeSpecificationMaterial );
		TestUtilDemo.doSendKeys(WBSInformationOBJ.pipeSpecificationClass,pipeSpecificationClass);
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);

		TestUtilDemo.clickElement(WBSInformationOBJ.TieinPriorityList, "TieinPriorityList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.tieInPriority,tieInPriority );
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");

	}

	@Then("validate saving the changed data I will see the updated data and the Save button will be disabled and complete button Enabled")
	public void validate_complete_button_is_enable() {
		TestUtilDemo.clickElement(WBSInformationOBJ.PipeSpecificationList, "PipeSpecificationList Section");
		// TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");
		TestUtilDemo.clickElement(WBSInformationOBJ.TieinPriorityList, "TieinPriorityList Section");
		// TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");
	}

	@When("validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed, a check next to the Section label will display in left panel side")
	public void validate_complete_button_clicked_and_edit_button_display()
			throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.PipeSpecificationList, "PipeSpecificationList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");
		Thread.sleep(2000);
		TestUtilDemo.isElementPresent(WBSInformationOBJ.EDIT_BUTTON, "EDIT_BUTTON");
		TestUtilDemo.isElementPresent(WBSInformationOBJ.PipeSpecificationListCheckedMark,
				"PipeSpecificationListCheckedMark");

		TestUtilDemo.clickElement(WBSInformationOBJ.TieinPriorityList, "TieinPriorityList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");
		Thread.sleep(3000);
		TestUtilDemo.isElementPresent(WBSInformationOBJ.EDIT_BUTTON, "EDIT_BUTTON");
		TestUtilDemo.isElementPresent(WBSInformationOBJ.TieinPriorityListCheckedMark, "TieinPriorityListCheckedMark");
		driver.close();
		driver.quit();
	}

	/************ Structural Discipline
	 * @throws Throwable **************/
	@Given("Validate Structural discipline user loged in and select project")
	public void validate_Structural_discipline_user_loged_in_and_select_project() throws Throwable {
		StepCommonMethod.login_with_a_selected_Role(WBSInformationOBJ.userName, "structural_username",
				ProjectInfoOBJ.SIGNINBUTTON, "SignIN Button", ProjectInfoOBJ.PROJECTSELECTIONWBS, "Project Selection");
	}

	@When("validate WBSInformationHeader is Display and click on header as a Structural DPS")
	public void validate_WBSInformationHeader_is_display_and_click() throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("wbsInformation",WBSInformationOBJ.WBSInformationHeader, WBSInformationOBJ.WBSInformationHeaderLink, "WBSInformation");
	}

	@When("validate As a DPS assigned to Structural discipline I will see sections:  Foundation List, Structure List")
	public void validate_FoundationList_and_StructureListis_display() {
		TestUtilDemo.isElementPresent(WBSInformationOBJ.FoundationList, "FoundationList Section");
		TestUtilDemo.scrollDownTillBottum();
		TestUtilDemo.isElementPresent(WBSInformationOBJ.StructureList, "StructureList Section");
	}


	@Then("validate viewing data that needs to be updated, I can click on Foundation List, Structure List to addOrupdate the data and changes have been made on the screen the Save button enable.{string},{string},{string},{string}")
	public void validate_DataAdding_for_FoundationList_and_StructureList(String foundationTag,String foundationName,String structureTag ,String structureName) throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.FoundationList, "FoundationList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.foundationTag, "S5301-FDNA-Auto");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.foundationName, "BOG Compressor Auto");
		//TestUtilDemo.clickElement(WBSInformationOBJ.foundationType, "foundationType");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.foundationType, 1, "foundationType");
		//TestUtilDemo.clickElement(WBSInformationOBJ.cwaNumberNameDropDown1, "cwaNumberNameDropDown1");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.cwaNumberNameDropDown1, 1 , "cwaNumberNameDropDown1");
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);

		TestUtilDemo.clickElement(WBSInformationOBJ.FoundationList, "FoundationList Section");
		TestUtilDemo.scrollDownForShort();
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.StructureList, "StructureList Section");
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton, "addRowButton");
		Thread.sleep(1000);
		TestUtilDemo.doSendKeys(WBSInformationOBJ.structureTag, "S5301-FDNA-Auto");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.structureName, "BOG Compressor Auto");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.structureType, 1, "structureType");
		TestUtilDemo.dropDownSelectByIndex(WBSInformationOBJ.cwaNumberNameDropDown2, 1 , "cwaNumberNameDropDown2");
		TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.clickElement(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		Thread.sleep(2000);


	}

	@Then("validate saving the changed data Structural discipline user will see the updated data and the Save button will be disabled and complete button Enabled")
	public void validate_structural__complete_button_is_enable() {
		TestUtilDemo.clickElement(WBSInformationOBJ.FoundationList, "FoundationList Section");
		// TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");
		TestUtilDemo.clickElement(WBSInformationOBJ.StructureList, "StructureList Section");
		// TestUtilDemo.isEnabled(WBSInformationOBJ.SAVE_BUTTON, "SAVE_BUTTON");
		TestUtilDemo.isEnabled(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");

	}

	@When("validate Structural discipline user once clicked on complete button then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed, a check next to the Section label will display in left panel side")
	public void validate_Structural_complete_button_clicked_and_edit_button_display() throws Throwable {
		TestUtilDemo.clickElement(WBSInformationOBJ.FoundationList, "FoundationList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");
		Thread.sleep(2000);
		TestUtilDemo.isElementPresent(WBSInformationOBJ.EDIT_BUTTON, "EDIT_BUTTON");
		TestUtilDemo.isElementPresent(WBSInformationOBJ.FoundationListCheckedMark,
				"FoundationListCheckedMark");

		TestUtilDemo.clickElement(WBSInformationOBJ.StructureList, "StructureList Section");
		TestUtilDemo.clickElement(WBSInformationOBJ.COMPLETE_BUTTON, "COMPLETE_BUTTON");
		Thread.sleep(2000);
		TestUtilDemo.isElementPresent(WBSInformationOBJ.EDIT_BUTTON, "EDIT_BUTTON");
		TestUtilDemo.isElementPresent(WBSInformationOBJ.StructureListCheckedMark, "StructureListCheckedMark");
		driver.close();
		driver.quit();
	}


    @When("User select a workflow rule box  {string} and validate duration input textbox {string}")
    public void userSelectAWorkflowRuleBoxAndValidateDurationInputTextbox(String arg0, String arg1) {

		//label[contains(text(),'In-House')]/parent::div//button


    }
}
