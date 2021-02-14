package com.wipro.qa.util;
/**
 * @author rameshrathod
 *
 */
import org.junit.Assert;
import org.openqa.selenium.By;
import com.wipro.qa.base.TestBase;

import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StepCommonMethod extends TestBase {

	/**
	 * Method to click on an element
	 * 
	 * @param          : String : Locator type (id, name, class, xpath, css)
	 * @param  : String : Locator value
	 */
	public static void login_with_a_selected_Role(By username, String usernameValue, By signInButton,
			String signInIdentifire, By projectSelection, String projectSelectionIdentifire) throws Throwable {
		TestBase.initialization();
		TestUtilDemo.doSendKeys(username, prop.getProperty(usernameValue));
		Thread.sleep(2000);
		TestUtilDemo.clickElement(signInButton, signInIdentifire);
		Thread.sleep(2000);
		if (projectSelectionIdentifire.startsWith("AUTO")){
			String getprojectID ;
			getprojectID= ProjectInfoOBJ.selectProjectCard.toString().replace("textToReplace",ProjectID).replaceAll("By.xpath:","");
			ProjectInfoOBJ.selectProjectCard =null;
			ProjectInfoOBJ.selectProjectCard= By.xpath(getprojectID);
			Thread.sleep(3000);
			webDriverWait.until(ExpectedConditions.elementToBeClickable(ProjectInfoOBJ.selectProjectCard) );
			TestUtilDemo.clickElement(ProjectInfoOBJ.selectProjectCard,"select Project card");

		}else {
			TestUtilDemo.clickElement(projectSelection, projectSelectionIdentifire);
		}
	}


	public static void login_with_a_selected_Role(By username, String usernameValue, By password,String passwordvalue, By signInButton)
												   throws InterruptedException {
		TestBase.initialization();
		TestUtilDemo.doSendKeys(username, usernameValue);
		Thread.sleep(2000);
		TestUtilDemo.doSendKeys(password,passwordvalue);
		Thread.sleep(2000);
		TestUtilDemo.clickElement(signInButton, "Click on Sign in button");
		Thread.sleep(2000);

	}
	// generic Method
	public static void validate_top_header_is_Display_and_click(String propHeaderName, By header, By headerLink,
			String identifire) throws Throwable {
		Thread.sleep(2000);
		String informationHeaderEX = prop.getProperty(propHeaderName);
		String informationHeaderAC = TestUtilDemo.getTex(header);
		Assert.assertEquals(informationHeaderAC, informationHeaderEX);
		TestUtilDemo.clickElement(headerLink, identifire);
		Thread.sleep(3000);

	}
	
	// generic Method
	public static void validate_sections_is_Display(String propHeaderName, By header, String identifire) throws Throwable {
			Thread.sleep(2000);
			String informationHeaderEX = prop.getProperty(propHeaderName);
			System.out.println("property file header name :" +informationHeaderEX);
			String informationHeaderAC = TestUtilDemo.getTex(header);
			System.out.println("Screen file header name :" +informationHeaderAC);
			Assert.assertEquals(informationHeaderAC, informationHeaderEX);
	}
	
	public static void validate_subSection_is_Display_and_click(By headerName,String identifire) throws Throwable {
		Thread.sleep(2000);
		TestUtilDemo.isElementPresent(headerName, identifire);
		TestUtilDemo.clickElement(headerName, identifire);
		Thread.sleep(3000);

	}

	public static void save_complete_click_and_edit_display(By saveButton, By completeButton, By editButton,By checkedMark,
			String signInIdentifire) throws Throwable {
		TestUtilDemo.clickElement(saveButton, signInIdentifire);
		Thread.sleep(4000);
		TestUtilDemo.clickElement(completeButton, signInIdentifire);
		Thread.sleep(2000);
		TestUtilDemo.isElementPresent(editButton, signInIdentifire);
		TestUtilDemo.isElementPresent(checkedMark, signInIdentifire);
	}
	// Generic Method
	public static void validate_empty_circle_next_to_the_Section_label_will_display(By unCheckedMark, String identifire)
			throws Throwable {
		TestUtilDemo.isElementPresent(unCheckedMark, identifire);
	}

	// Generic Method
	public static void default_editable_section_display_as_toggled_off(By sectionPDE, By sectionPLD, String identifire)
			throws Throwable {
		TestUtilDemo.isElementPresent(sectionPDE, identifire);
		TestUtilDemo.isElementPresent(sectionPLD, identifire);
		Thread.sleep(3000);

	}

	// Generic Method
	public static void validate_toggle_is_on_the_name_field_will_enable(By form, By toggle, String identifire)
			throws Throwable {
		TestUtilDemo.clickElement(form, identifire);
		TestUtilDemo.scrollUpTop();
		Thread.sleep(2000);
		TestUtilDemo.clickElement(toggle, identifire);
		Thread.sleep(3000);
	}

	// Generic Method
	public static void autoSearchName_in_dropdown_and_select(By PDEDropDownBox, By PDEDropDownValue, String identifire)
			throws Throwable {
		TestUtilDemo.clickElement(PDEDropDownBox, identifire);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(PDEDropDownValue, identifire);
		Thread.sleep(3000);
	}

	// Generic Method
	public static void notify_and_define_user_permissions_option_is_activate(By defineUserPermissions, By notify,
			By SAVE_BUTTON, String identifire) throws Throwable {
		TestUtilDemo.isElementPresent(defineUserPermissions, identifire);
		TestUtilDemo.isElementPresent(notify, identifire);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(SAVE_BUTTON, identifire);
		Thread.sleep(3000);
	}

	// Generic Method
	public static void over_editing_save_button_will_enable(By form, By locator, By PDEDropDownBox,
			By PDEDropDownValue1, By SAVE_BUTTON, String identifire) throws Throwable {
		TestUtilDemo.clickElement(form, identifire);
		TestUtilDemo.scrollUpTop();
		TestUtilDemo.clickElement(PDEDropDownBox, identifire);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(PDEDropDownValue1, identifire);
		Thread.sleep(3000);
		TestUtilDemo.isEnabled(SAVE_BUTTON, identifire);

	}

	// Generic Method
	public static void leaving_page_without_saving(By electricalLeadsSection, String identifire) throws Throwable {
		TestUtilDemo.clickElement(electricalLeadsSection, identifire);
		Thread.sleep(3000);

	}

	// Generic Method
	public static void saving_data_and_complete_button_enable(By SAVE_BUTTON, By form, By COMPLETE_BUTTON,
			String identifire) throws Throwable {
		TestUtilDemo.clickElement(SAVE_BUTTON, identifire);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(form, identifire);
		TestUtilDemo.scrollUpTop();
		TestUtilDemo.isEnabled(COMPLETE_BUTTON, identifire);

	}

	// generic Method
	public static void toggling_off_and_field_will_disable(By toggleAssignTeam, By SAVE_BUTTON, String identifire)
			throws Throwable {
		TestUtilDemo.clickElement(toggleAssignTeam, identifire);
		Thread.sleep(5000);
		TestUtilDemo.clickElement(SAVE_BUTTON, identifire);
		Thread.sleep(1000);
	}

	// Generic Method
	public static void add_new_role(By addRoleButton, By PDEDropDownBox, By PDEDropDownValue, By SAVE_BUTTON,
			String identifire) throws Throwable {

		TestUtilDemo.clickElement(addRoleButton, identifire);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(PDEDropDownBox, identifire);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(PDEDropDownValue, identifire);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(SAVE_BUTTON, identifire);
		Thread.sleep(2000);

	}

	// generic method
	public static void edit_button_is_display(By COMPLETE_BUTTON, By EDIT_BUTTON, String identifire) throws Throwable {
		TestUtilDemo.clickElement(COMPLETE_BUTTON, identifire);
		Thread.sleep(5000);
		TestUtilDemo.isElementPresent(EDIT_BUTTON, identifire);

	}

	// Generic Method
	public static void checkMark_is_display_next_to_section(By assignCheckedMark, By EDIT_BUTTON, String identifire)
			throws Throwable {
		TestUtilDemo.isElementPresent(assignCheckedMark, identifire);
		Thread.sleep(5000);
		TestUtilDemo.clickElement(EDIT_BUTTON, identifire);
	}

	// generic method
	public static void clicking_on_DefineUserPermissions(By form, By toggleAssignTeam, By PDEDropDownBox, By PDEDropDownValue,
			By defineUserPermissions, String identifire) throws Throwable {
		TestUtilDemo.clickElement(form, identifire);
		TestUtilDemo.scrollUpTop();
		Thread.sleep(3000);
		TestUtilDemo.clickElement(toggleAssignTeam, identifire);
		Thread.sleep(1000);
		TestUtilDemo.clickElement(PDEDropDownBox, identifire);
		TestUtilDemo.clickElement(PDEDropDownValue, identifire);
		Thread.sleep(5000);
		TestUtilDemo.clickElement(defineUserPermissions, identifire);
		Thread.sleep(3000);

	}

	// Generic Method
	public static void validate_multiple_permissions_selection(By DisciplineSpecificProjectSetupRole,
			By gigCompleterRole, String identifire) throws Throwable {
		TestUtilDemo.clickElement(DisciplineSpecificProjectSetupRole, identifire);
		TestUtilDemo.clickElement(gigCompleterRole, identifire);
		Thread.sleep(3000);

	}

	// generic Method
	public static void validate_hovering_over_i(By iIconForDisciplineSpecific, By hoverInformation, String identifire)
			throws Throwable {
		TestUtilDemo.mouseHover(iIconForDisciplineSpecific);
		Thread.sleep(5000);
		TestUtilDemo.isElementPresent(hoverInformation, identifire);
		Thread.sleep(3000);

	}

	// generic method
	public static void validate_user_can_save_selection(By saveForDefineUser, By SAVE_BUTTON, By COMPLETE_BUTTON,
			String identifire) throws Throwable {
		TestUtilDemo.clickElement(saveForDefineUser, identifire);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(SAVE_BUTTON, identifire);
		Thread.sleep(3000);
		TestUtilDemo.clickElement(COMPLETE_BUTTON, identifire);
		Thread.sleep(3000);

	}
}
