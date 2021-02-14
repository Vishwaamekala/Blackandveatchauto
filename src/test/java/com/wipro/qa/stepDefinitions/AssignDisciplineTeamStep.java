package com.wipro.qa.stepDefinitions;


import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.wipro.qa.base.TestBase;
import com.wipro.qa.util.AssignTeamOBJ;
import com.wipro.qa.util.ProjectInfoOBJ;
import com.wipro.qa.util.StepCommonMethod;
import com.wipro.qa.util.TestUtilDemo;
import com.wipro.qa.util.WBSInformationOBJ;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AssignDisciplineTeamStep extends TestBase {

	@Given("^validate when user login as a Piping Discipline role in AssignTeam$")
	public void login_as_a_piping_Role() throws Throwable {
		StepCommonMethod.login_with_a_selected_Role(WBSInformationOBJ.userName, "piping_username",ProjectInfoOBJ.SIGNINBUTTON,
				"SignIN Button", ProjectInfoOBJ.PROJECTSELECTIONWBS, "Project Selection");
	}

	@Then("^validate AssignTeamHeader is Display and click on AssignTeamHeader Link$")
	public void validate_assignTeamHeader_is_display_and_click() throws Throwable {
		StepCommonMethod.validate_top_header_is_Display_and_click("assignTeam",AssignTeamOBJ.AssignTeamHeader, AssignTeamOBJ.AssignTeamLink, "AssignTeamHeader");
	}

	@When("validate Section is NOT completed, an empty circle next to the Section label will display in left panel")
	public void validate_empty_circle_next_to_the_Section_label_will_display_in_left_panel() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.pipingEngineeringUnCheckedMark, "UnCheckedMark ");
	}

	@Then("validate For each editable section Engineering Team or Design Team the appropriate roles will display as default toggled off.")
	public void default_editable_section_display_as_toggled_off_In_PipingSection() throws Throwable {
		StepCommonMethod.default_editable_section_display_as_toggled_off(AssignTeamOBJ.PipingPDE,
				AssignTeamOBJ.PipingPLD, "PipingPDE/PLD Engineering Team");
	}

	@When("validate toggle is on, the name field will enable.")
	public void validate_toggle_on_the_name_field_will_enable_in_pipingSection() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,AssignTeamOBJ.togglePipingEngineering,
				"toggle On");
	}

	@When("validate entering the assignee name, it will search matching names and display NameJobFamilyOffice")
	public void autoSearchName_in_dropdown_and_select_in_pipingSection() throws Throwable {
		StepCommonMethod.autoSearchName_in_dropdown_and_select(AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValue,
				"pipingPDEDropDownBox/value");
	}

	@When("validate name is populated a Notify and Define User Permissions option will activate to the right of the name box")
	public void notify_and_define_user_permissions_option_is_activate_in_pipingSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.notify_and_define_user_permissions_option_is_activate(AssignTeamOBJ.defineUserPermissions,
				AssignTeamOBJ.notify, AssignTeamOBJ.SAVE_BUTTON, "defineUserPermissionsAndnotifyAndSaveButton");
	}

	@When("validate upon making an edit, the Save button will be enabled and the Complete button will be disabled")
	public void save_button_will_enable_in_pipingSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.over_editing_save_button_will_enable(AssignTeamOBJ.form, AssignTeamOBJ.notify,
				AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON,
				"PDEDropDownBox/ValueAndSaveButton");
	}

	@When("validate System will prompt user to save record if user is moving away from sectionscreen without saving data")
	public void leaving_page_without_saving_in_pipingSection() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingEngineeringTeam, "pipingEngineeringTeam");
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.pipingDesignTeam, "leaving page without save ");
	}

	@When("validate the section information has been saved, the Complete button will be enabled")
	public void saving_data_and_complete_button_enable_in_pipingSection() throws Throwable {
		StepCommonMethod.saving_data_and_complete_button_enable(AssignTeamOBJ.SAVE_BUTTON,AssignTeamOBJ.form,
				AssignTeamOBJ.COMPLETE_BUTTON, "save and complete button");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable.")
	public void toggling_off_and_field_will_disable_in_pipingSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.togglePipingEngineering,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_pipingSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_pipingSection();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate a section within a header area that does not have dependencies (Project Information, Project Reference Library, Assign Project Lead) has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.")
	public void edit_button_is_display_in_pipingSection() throws Throwable {
		StepCommonMethod.edit_button_is_display(AssignTeamOBJ.COMPLETE_BUTTON, AssignTeamOBJ.EDIT_BUTTON,
				"complete button clicked and edit button display");
	}

	@When("validate Section is completed, a check next to the Section label will display in left panel")
	public void checkMark_is_display_next_to_pipingSection() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.pipingEngineeringCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual.")
	public void clicking_on_DefineUserPermissions_in_pipingSection() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.togglePipingEngineering,
				AssignTeamOBJ.dropDownBox, AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions,
				"clicked_on_DefineUserPermissions");
	}

	@Then("validate multiple permissions can be selected for a single individual.")
	public void validate_multiple_permissions_selection_in_pipingSection() throws Throwable {
		StepCommonMethod.validate_multiple_permissions_selection(AssignTeamOBJ.gigDistributorRole,
				AssignTeamOBJ.gigCompleterRole, "roles selection");
	}

	@Then("validate hovering over i next to user permissions provides additional informationORdescription of permissions.")
	public void validate_hovering_over_i_in_pipingSection() throws Throwable {
		StepCommonMethod.validate_hovering_over_i(AssignTeamOBJ.iIconForGigcompleter, AssignTeamOBJ.hoverInformation,
				"hover message");
	}

	@Then("validate user can select Save to save selections")
	public void validate_user_can_save_selection_in_pipingSection() throws Throwable {
		StepCommonMethod.validate_user_can_save_selection(AssignTeamOBJ.saveForDefineUser, AssignTeamOBJ.SAVE_BUTTON,
				AssignTeamOBJ.COMPLETE_BUTTON, "clicked on save button");
	}

	//Below code for the PipingDesignTeam
	@When("validate user click on piping Design Team")
	public void validate_user_click_on_pipingDesignTeam_Section() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingEngineeringTeam, "pipingEngineeringTeam Section");
		TestUtilDemo.scrollDownForShort();
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingDesignTeam, "pipingDesignTeam Section");
	}

	@When("validate validate Section is NOT completed, an empty circle next to the pipingDesingTeamSection is display")
	public void validate_empty_circle_next_to_the_pipingDesingTeamSection_will_display() throws Throwable {
		StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
				AssignTeamOBJ.pipingDesignTeamUnCheckedMark, "UnCheckedMark ");
	}

	@Then("validate For each editable section Engineering Team or Design Team the appropriate roles will display as default toggled off in pipingDesingTeamSection")
	public void default_editable_section_display_as_toggled_off_in_pipingDesingTeamSection() throws Throwable {
		StepCommonMethod.default_editable_section_display_as_toggled_off(AssignTeamOBJ.PipingPDE,
				AssignTeamOBJ.PipingPLD, "PipingPDE/PLD Engineering Team");
	}

	@When("validate toggle is on, the name field will enable in pipingDesingTeamSection")
	public void validate_toggle_on_the_name_field_will_enable_in_pipingDesingTeamSection() throws Throwable {
		StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,AssignTeamOBJ.togglePipingDesign,
				"toggle On");
	}

	@When("validate System will prompt user to save record if user is moving away from pipingDesingTeamSection section screen without saving data")
	public void leaving_page_without_saving_in_pipingDesingTeamSection() throws Throwable {
		TestUtilDemo.clickElement(AssignTeamOBJ.pipingEngineeringTeam, "pipingEngineeringTeam");
		TestUtilDemo.scrollDownForShort();
		StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.pipingDesignTeam, "leaving page without save ");
	}

	@When("validate toggling off a role with a name populated the name will clear and field will disable in pipingDesingTeamSection")
	public void toggling_off_and_field_will_disable_in_pipingDesingTeamSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.togglePipingDesign,
				AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
	}

	@When("validate For select roles, user can select +Add Professional from pipingDesingTeamSection which will create a new blank field to populate an additional professional for a given role")
	public void add_new_role_in_pipingDesingTeamSection() throws Throwable {
		TestUtilDemo.scrollUpTop();
		validate_toggle_on_the_name_field_will_enable_in_pipingDesingTeamSection();
		autoSearchName_in_dropdown_and_select_in_pipingSection();
		Thread.sleep(2000);
		StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
				AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
	}

	@When("validate Section is completed, a check next to the pipingDesingTeamSection is display")
	public void checkMark_is_display_next_to_pipingDesingTeamSection() throws Throwable {
		StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.pipingDesignTeamCheckedMark,
				AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
		TestUtilDemo.scrollUpTop();
	}

	@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for pipingDesingTeamSection")
	public void clicking_on_DefineUserPermissions_in_pipingDesingTeamSection() throws Throwable {
		StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.togglePipingDesign, AssignTeamOBJ.dropDownBox,
				AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
		driver.close();
		driver.quit();
	}
	
	//Below code for the processsEngineeringTeam
	@Given("^validate when user login as a Process Discipline role in AssignTeam$")
	public void login_as_a_Process_Discipline_Role() throws Throwable {
		StepCommonMethod.login_with_a_selected_Role(WBSInformationOBJ.userName, "process_username",ProjectInfoOBJ.SIGNINBUTTON,
				"SignIN Button", ProjectInfoOBJ.PROJECTSELECTIONWBS, "Project Selection");
	}
		@When("validate user click on processsEngineeringTeam")
		public void validate_user_click_on_processsEngineeringTeam_Section() throws Throwable {
			TestUtilDemo.clickElement(AssignTeamOBJ.processEngineeringTeam, "processEngineeringTeam Section");
			}

		@When("validate validate Section is NOT completed, an empty circle next to the processsEngineeringTeamSection is display")
		public void validate_empty_circle_next_to_the_processsEngineeringTeam_will_display() throws Throwable {
			Thread.sleep(2000);
			StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
					AssignTeamOBJ.processEngineeringTeamUnCheckedMark, "UnCheckedMark ");
		}

		@Then("validate For each editable section Engineering Team or Design Team the appropriate roles will display as default toggled off in processsEngineeringTeam")
		public void default_editable_section_display_as_toggled_off_in_processsEngineeringTeam() throws Throwable {
			StepCommonMethod.default_editable_section_display_as_toggled_off(AssignTeamOBJ.processEngineering,
					AssignTeamOBJ.processDesigner, "PipingPDE/PLD Engineering Team");
		}

		@When("validate toggle is on, the name field will enable in processsEngineeringTeam")
		public void validate_toggle_on_the_name_field_will_enable_in_processsEngineeringTeam() throws Throwable {
			StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form,AssignTeamOBJ.toggleprocessEngineering,
					"toggle On");
		}

		@When("validate System will prompt user to save record if user is moving away from processsEngineeringTeam section screen without saving data")
		public void leaving_page_without_saving_in_processsEngineeringTeam() throws Throwable {
			TestUtilDemo.clickElement(AssignTeamOBJ.processEngineeringTeam, "processEngineeringTeam");
			TestUtilDemo.scrollDownForShort();
			TestUtilDemo.clickElement(AssignTeamOBJ.processDesignTeam, "processDesignTeam");
			}

		@When("validate toggling off a role with a name populated the name will clear and field will disable in processsEngineeringTeam")
		public void toggling_off_and_field_will_disable_in_processsEngineeringTeam() throws Throwable {
			TestUtilDemo.scrollUpTop();
			Thread.sleep(5000);
			StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleprocessEngineering,
					AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
		}

		@When("validate For select roles, user can select +Add Professional from processsEngineeringTeam which will create a new blank field to populate an additional professional for a given role")
		public void add_new_role_in_processsEngineeringTeam() throws Throwable {
			TestUtilDemo.scrollUpTop();
			validate_toggle_on_the_name_field_will_enable_in_processsEngineeringTeam();
			autoSearchName_in_dropdown_and_select_in_pipingSection();
			Thread.sleep(2000);
			StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
					AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
		}

		@When("validate Section is completed, a check next to the processsEngineeringTeam is display")
		public void checkMark_is_display_next_to_processsEngineeringTeam() throws Throwable {
			StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.processEngineeringTeamCheckedMark,
					AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
			TestUtilDemo.scrollUpTop();
		}

		@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for processsEngineeringTeam")
		public void clicking_on_DefineUserPermissions_in_processsEngineeringTeam() throws Throwable {
			StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.toggleprocessEngineering, AssignTeamOBJ.dropDownBox,
					AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
		}
		
		//below code for the processDesingTeam
		@When("validate user click on processDesignTeam")
		public void validate_user_click_on_processDesignTeam_Section() throws Throwable {
			TestUtilDemo.clickElement(AssignTeamOBJ.processEngineeringTeam, "processEngineeringTeam Section");
			TestUtilDemo.scrollDownForShort();
			TestUtilDemo.clickElement(AssignTeamOBJ.processDesignTeam, "processDesignTeam Section");
		}

		@When("validate validate Section is NOT completed, an empty circle next to the processDesignTeam is display")
		public void validate_empty_circle_next_to_the_processDesignTeamSection_will_display() throws Throwable {
			StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
					AssignTeamOBJ.processDesignTeamUnCheckedMark, "UnCheckedMark ");
		}

		@Then("validate For each editable section Engineering Team or Design Team the appropriate roles will display as default toggled off in processDesignTeam")
		public void default_editable_section_display_as_toggled_off_in_processDesignTeam() throws Throwable {
			StepCommonMethod.default_editable_section_display_as_toggled_off(AssignTeamOBJ.processEngineeringText,
					AssignTeamOBJ.processTechnician, "processEngineeringText/processTechnician label");
		}

		@When("validate toggle is on, the name field will enable in processDesignTeam")
		public void validate_toggle_on_the_name_field_will_enable_in_processDesignTeam() throws Throwable {
			StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form, AssignTeamOBJ.toggleprocessDesignTeam,
					"toggle On");
		}

		@When("validate System will prompt user to save record if user is moving away from processDesignTeam section screen without saving data")
		public void leaving_page_without_saving_in_processDesignTeam() throws Throwable {
			TestUtilDemo.clickElement(AssignTeamOBJ.processEngineeringTeam, "processEngineeringTeam");
			TestUtilDemo.scrollDownForShort();
			StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.processDesignTeam, "leaving page without save ");
		}

		@When("validate toggling off a role with a name populated the name will clear and field will disable in processDesignTeam")
		public void toggling_off_and_field_will_disable_in_processDesignTeam() throws Throwable {
			TestUtilDemo.scrollUpTop();
			StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleprocessDesignTeam,
					AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
		}

		@When("validate For select roles, user can select +Add Professional from processDesignTeam which will create a new blank field to populate an additional professional for a given role")
		public void add_new_role_in_processDesignTeam() throws Throwable {
			TestUtilDemo.scrollUpTop();
			validate_toggle_on_the_name_field_will_enable_in_processDesignTeam();
			autoSearchName_in_dropdown_and_select_in_pipingSection();
			Thread.sleep(2000);
			StepCommonMethod.add_new_role(AssignTeamOBJ.addProfesstional, AssignTeamOBJ.dropDownBoxAddProfesstional,
					AssignTeamOBJ.dropDownValueforEdit, AssignTeamOBJ.SAVE_BUTTON, "Adding new role ");
		}

		@When("validate Section is completed, a check next to the processDesignTeam is display")
		public void checkMark_is_display_next_to_processDesignTeam() throws Throwable {
			StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.processDesignTeamCheckedMark,
					AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
			TestUtilDemo.scrollUpTop();
		}

		@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for processDesignTeam")
		public void clicking_on_DefineUserPermissions_in_processDesignTeam() throws Throwable {
			StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.toggleprocessDesignTeam, AssignTeamOBJ.dropDownBox,
					AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
			driver.close();
			driver.quit();
		}
		
		// Below code for PLI Role for piping
		@Given("^validate when user login as a PLI role in AssignTeam$")
		public void login_as_a_pli_Role() throws Throwable {
			StepCommonMethod.login_with_a_selected_Role(WBSInformationOBJ.userName, "rathod_username",ProjectInfoOBJ.SIGNINBUTTON,
					"SignIN Button", ProjectInfoOBJ.PROJECTSELECTIONWBS, "Project Selection");
		}
		@When("validate Section is NOT completed, an empty circle next to the PipingLeadsSection label will display in left panel")
		public void validate_empty_circle_next_to_the_PipingLeadsSection_will_display() throws Throwable {
			StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
					AssignTeamOBJ.pipingLeadsUnCheckedMark, "UnCheckedMark ");
		}

		@When("validate toggle is on, the name field will enable in PipingLeadsSection.")
		public void validate_toggle_on_the_name_field_will_enable_in_PipingLeadsSection() throws Throwable {
			StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form, AssignTeamOBJ.togglepipingLeads,
					"toggle On");
		}
		
		@When("validate System will prompt user to save record if user is moving away from PipingLeadsSection without saving data")
		public void leaving_page_without_saving_in_PipingLeadsSection() throws Throwable {
			TestUtilDemo.clickElement(AssignTeamOBJ.pipingLeads, "pipingLeads");
			TestUtilDemo.scrollDownForShort();
			StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.ElectricalLeadsSection, "leaving page without save ");
		}
		@When("validate toggling off a role with a name populated the name will clear and field will disable in PipingLeadsSection.")
		public void toggling_off_and_field_will_disable_in_pipingLeadsSection() throws Throwable {
			TestUtilDemo.scrollUpTop();
			StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.togglepipingLeads,
					AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
		}
		@When("validate Section is completed, a check next to the PipingLeadsSection label will display in left panel")
		public void checkMark_is_display_next_to_PipingLeadsSection() throws Throwable {
			StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.pipingLeadsCheckedMark,
					AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
			TestUtilDemo.scrollUpTop();

		}
		@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual in PipingLeadsSection.")
		public void clicking_on_DefineUserPermissions_in_PipingLeadsSection() throws Throwable {
			StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.togglepipingLeads, AssignTeamOBJ.dropDownBox,
					AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
			
		}
		
		// Below code for PLI Role for Electrical
				@Given("^validate user click on Electrical Leads section$")
				public void click_on_Electrical_Leads_section() throws Throwable {
					TestUtilDemo.clickElement(AssignTeamOBJ.pipingLeads, "pipingLeads");
					TestUtilDemo.scrollDownForShort();
					TestUtilDemo.clickElement(AssignTeamOBJ.ElectricalLeadsSection, "ElectricalLeads Section ");
				}
				@When("validate validate Section is NOT completed, an empty circle next to the ElectricalLeadsSection is display")
				public void validate_empty_circle_next_to_the_ElectricalLeadsSection_will_display() throws Throwable {
					StepCommonMethod.validate_empty_circle_next_to_the_Section_label_will_display(
							AssignTeamOBJ.electricalUnCheckedMark, "UnCheckedMark ");
				}

				@When("validate toggle is on, the name field will enable in ElectricalLeadsSection")
				public void validate_toggle_on_the_name_field_will_enable_in_ElectricalLeadsSection() throws Throwable {
					StepCommonMethod.validate_toggle_is_on_the_name_field_will_enable(AssignTeamOBJ.form, AssignTeamOBJ.toggleElectrical,
							"toggle On");
				}
				
				@When("validate System will prompt user to save record if user is moving away from ElectricalLeadsSection section screen without saving data")
				public void leaving_page_without_saving_in_ElectricalLeadsSection() throws Throwable {
					StepCommonMethod.leaving_page_without_saving(AssignTeamOBJ.pipingLeads, "leaving page without save ");
				}
				@When("validate toggling off a role with a name populated the name will clear and field will disable in ElectricalLeadsSection")
				public void toggling_off_and_field_will_disable_in_ElectricalLeadsSection() throws Throwable {
					TestUtilDemo.scrollUpTop();
					StepCommonMethod.toggling_off_and_field_will_disable(AssignTeamOBJ.toggleElectrical,
							AssignTeamOBJ.SAVE_BUTTON, "clicked on toggle off and save ");
				}
				@When("validate Section is completed, a check next to the ElectricalLeadsSection is display")
				public void checkMark_is_display_next_to_ElectricalLeadsSection() throws Throwable {
					StepCommonMethod.checkMark_is_display_next_to_section(AssignTeamOBJ.electricalCheckedMark,
							AssignTeamOBJ.EDIT_BUTTON, "CheckedMark displayed ");
					TestUtilDemo.scrollUpTop();

				}
				@When("validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for ElectricalLeadsSection")
				public void clicking_on_DefineUserPermissions_in_ElectricalLeadsSection() throws Throwable {
					StepCommonMethod.clicking_on_DefineUserPermissions(AssignTeamOBJ.form, AssignTeamOBJ.toggleElectrical, AssignTeamOBJ.dropDownBox,
							AssignTeamOBJ.dropDownValue, AssignTeamOBJ.defineUserPermissions, "clicked_on_DefineUserPermissions");
					
				}
							
				@When("validate closing the browser")
				public void validate_closing_the_browser() throws Throwable {
					driver.close();
					driver.quit();
					
				}



		@Then("Select newly created project card {string}")
		public void selectNewlyCreatedProjectCard(String projectid) throws InterruptedException {
			Thread.sleep(3000);
			if (projectid.length()==0){
				projectid =ProjectID;
			}
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			String getprojectID ;
			getprojectID= ProjectInfoOBJ.selectProjectCard.toString().replace("textToReplace",projectid).replaceAll("By.xpath:","");
			ProjectInfoOBJ.selectProjectCard =null;
			ProjectInfoOBJ.selectProjectCard= By.xpath(getprojectID);
			Thread.sleep(3000);
			if (!TestUtilDemo.isEnabled(ProjectInfoOBJ.selectProjectCard ,"Project card")) {
				TestUtilDemo.scrollDownToElementPresent(ProjectInfoOBJ.selectProjectCard);
			}
			webDriverWait.until(ExpectedConditions.elementToBeClickable(ProjectInfoOBJ.selectProjectCard) );
			TestUtilDemo.clickElement(ProjectInfoOBJ.selectProjectCard,"select Project card");

		}



		@Then("click on Assign the Project  and assigned to the user {string} ,{string}")
		public void clickOnAssignTheProjectAndAssignedToTheUser(String assignleads, String assigneduser) throws InterruptedException {
				Thread.sleep(3000);
				TestUtilDemo.clickElement(AssignTeamOBJ.AssignTeamHeader ,"Click on Assign to team");
				String setassignlead ;
				setassignlead= AssignTeamOBJ.selectAnyProjectLeads.toString().replace("textToReplace",assignleads).replaceAll("By.xpath:","");
				AssignTeamOBJ.selectAnyProjectLeads =null;
				AssignTeamOBJ.selectAnyProjectLeads= By.xpath(setassignlead);
				Thread.sleep(3000);

				TestUtilDemo.scrollDownToElementPresent(AssignTeamOBJ.selectAnyProjectLeads);
				TestUtilDemo.clickElement(AssignTeamOBJ.selectAnyProjectLeads, "Click on the Select "+assignleads+" assign lead");
				Thread.sleep(1000);
				TestUtilDemo.clickElement(AssignTeamOBJ.selectEnableAnyLeads,"Enable Lead assignment");
				Thread.sleep(1000);
				TestUtilDemo.clickElement(AssignTeamOBJ.selectUser,"Select Project professional name");
				Thread.sleep(2000);
				TestUtilDemo.doSendKeys(AssignTeamOBJ.inputProfessionalname,assigneduser + Keys.ENTER);
				TestUtilDemo.clickElement(AssignTeamOBJ.defineUserPermissions,"Define user permission");
				TestUtilDemo.clickElement(AssignTeamOBJ.PMModelwindowSavebtn,"Project manager Model Save button");

				TestUtilDemo.clickElement(AssignTeamOBJ.SAVE_BUTTON,"Save button");
				Thread.sleep(2000);
				TestUtilDemo.clickElement(AssignTeamOBJ.COMPLETE_BUTTON,"click on Compleded");

			}

	@Then("validate electrical displain options on left menu {string}")
	public void validateElectricalDisplainOptionsOnLeftMenu(String listdisplain) {

		String[] eledisplain = listdisplain.split(";");
		for(String ele :eledisplain){

			String geteledis ;
			geteledis= WBSInformationOBJ.validateelectricalequipmentlst.toString().replace("textToReplace",ele).replaceAll("By.xpath:","");
			WBSInformationOBJ.validateelectricalequipmentlst =null;
			WBSInformationOBJ.validateelectricalequipmentlst= By.xpath(geteledis);
			Assert.assertTrue(TestUtilDemo.isElementPresent(WBSInformationOBJ.validateelectricalequipmentlst , ele+"Found in list"));

		}

	}

	@Then("Click on WBS Option")
	public void clickOnWBSOption() throws InterruptedException {
		Thread.sleep(2000);
		TestUtilDemo.clickElement(WBSInformationOBJ.WBSInformationHeaderLink , "Click on WBS Link");


	}

	@Then("user fill the the details for Electrical Equipment List")
	public void userFillTheTheDetailsForElectricalDisplain(DataTable elect) {
		List<List<String>> data = elect.cells();
		String geteledis=  WBSInformationOBJ.electricalequipmentlst.toString() ;
		geteledis=geteledis.replace("textToReplace",data.get(1).get(0)).replaceAll("By.xpath:","");
		TestUtilDemo.clickElement(By.xpath(geteledis) ,"Select the electiral displain");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton,"Row button selected ");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.electricalEquipmentNumber, data.get(1).get(1) );
		TestUtilDemo.doSendKeys(WBSInformationOBJ.electricalEquipmentName, data.get(1).get(2) );
		TestUtilDemo.doSendKeys(WBSInformationOBJ.electricalEquipmentType, data.get(1).get(3));
		TestUtilDemo.doSendKeys(WBSInformationOBJ.electricalvoltage, data.get(1).get(4));
		TestUtilDemo.doSendKeys(WBSInformationOBJ.cwaNumberNameDropDown3, data.get(1).get(5) );

	}

	@Then("user fill the the details for Powerhouse List")
	public void userFillTheTheDetailsForPowerhouseList(DataTable powerhouse) {
		List<List<String>> data = powerhouse.asLists();
		String geteledis=  WBSInformationOBJ.electricalequipmentlst.toString() ;
		geteledis=geteledis.replace("textToReplace",data.get(1).get(0)).replaceAll("By.xpath:","");
		TestUtilDemo.clickElement(By.xpath(geteledis) ,"Select the electiral displain");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton,"Row button selected ");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.powerhouseTag, data.get(1).get(1) );
		TestUtilDemo.doSendKeys(WBSInformationOBJ.powerhouseName,data.get(1).get(2) );
		TestUtilDemo.doSendKeys(WBSInformationOBJ.cwaNumberNameDropDown4, data.get(1).get(3));
	}

	@Then("user fill the the details for Electrical systems name")
	public void userFillTheTheDetailsForElectricalsystemsnameList(DataTable esn) {
		List<List<String>> data = esn.asLists();
		String geteledis=  WBSInformationOBJ.electricalequipmentlst.toString() ;
		geteledis=geteledis.replace("textToReplace",data.get(1).get(0)).replaceAll("By.xpath:","");
		TestUtilDemo.clickElement(By.xpath(geteledis) ,"Select the electiral displain");
		TestUtilDemo.clickElement(WBSInformationOBJ.addRowButton,"Row button selected ");
		TestUtilDemo.doSendKeys(WBSInformationOBJ.electricalSystemsName, data.get(1).get(0) );


	}
}
