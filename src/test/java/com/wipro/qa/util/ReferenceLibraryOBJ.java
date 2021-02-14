package com.wipro.qa.util;

import org.openqa.selenium.By;
import com.wipro.qa.base.TestBase;

public class ReferenceLibraryOBJ extends TestBase {

	public static By referenceLibraryHeader = By.xpath("	//div[text()='Reference Library']");
	public static By referenceLibraryHeaderLink = By.xpath("//a[@href='/projectSetup/referenceLibrary']");
	public static By ProjectSpecificDocumentsManagementSection = By.xpath("//p[text()='Client Documents - Management']//parent::li//parent::ul//p[text()='Project-Specific Documents - Management']");
	public static By ClientDocumentsManagementSection = By.xpath("//p[text()='Project-Specific Documents - Management']//parent::li//parent::ul//p[text()='Client Documents - Management']");
	public static By ProceduresManagementSection= By.xpath("//p[text()='Project-Specific Documents - Management']//parent::li//parent::ul//p[text()='Procedures - Management']");
	public static By ManualsHandbooksManagementSection = By.xpath ("//p[text()='Project-Specific Documents - Management']//parent::li//parent::ul//p[text()='Manuals/Handbooks - Management']");
	public static By OtherManagementSection = By.xpath("//p[text()='Project-Specific Documents - Management']//parent::li//parent::ul//p[text()='Other - Management']");
	public static By ChecklistsManagementSection= By.xpath("//p[text()='Project-Specific Documents - Management']//parent::li//parent::ul//p[text()='Checklists - Management']");
	public static By laminarLogo1 = By.xpath ("//div[@class='sidebar-image']/img[1]");
	public static By laminarLogo2 = By.xpath ("//div[@class='sidebar-image']/img[2]");
	public static By IncludeColumn = By.xpath ("//th[text()='Name']//parent::tr//th[text()='Include']");
	public static By CategoryColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='Category']");
	public static By NameColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='Name']");
	public static By IDColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='ID']");
	public static By LinkColumn = By.xpath ("//th[text()='Include']//parent::tr//th[text()='Link']");
	public static By toggle = By.xpath("//tbody/tr[1]/td[1]/label/span");
	public static By categoryTextLink = By.xpath("//tbody/tr[1]/td[2]");
	public static By secondRowText = By.xpath("//tbody/tr[2]/td[2]");
	public static By nameTextBox = By.name ("name");
	public static By IDtextBox = By.name ("documentId");
	public static By linkTextBox = By.name ("link");
	public static By addReferenceButton = By.xpath ("//img[@src='/static/media/add.b23f718f.svg']");
	public static By copyIcon = By.xpath ("//tbody/tr[1]/td[6]/img[@src='/static/media/copyClipboard.e9522ab0.svg']");
	public static By categoryDropDown = By.xpath("//div[text()='Category Name']");
	public static By categoryDropDownvalue = By.xpath("//*[@class=' css-1n7v3ny-option'][text()='Scope Management']");
	public static By googleLink = By.xpath("//a[@href='https://www.google.com/']");
	public static By ProjectSpecificDocumentsManagementCheckedMark= By.xpath ("//p[text()='Project-Specific Documents - Management']//parent::li//img[@class='sideMenuIcon']");
	public static By proceduresManagementCheckedMark= By.xpath ("//p[text()='Procedures - Management']//parent::li//img[@class='sideMenuIcon']");
	
	
	public static By nameTextBoxdocument = By.xpath("//*[@name='name'][@value='']");
	public static By RESET_BUTTON= By.xpath("//button[text()='Save']//parent::div//button[text()='Reset']");
	public static By SAVE_BUTTON = By.xpath("//button[text()='Reset']//parent::div//button[text()='Save']");
	public static By COMPLETE_BUTTON= By.xpath("//button[text()='Reset']//parent::div//button[text()='Complete']");
	public static By EDIT_BUTTON= By.xpath ("//button[text()='Edit']");
	
	//DPS Role component xpath
	public static By projectSpecificDocumentsPipingCheckedMark= By.xpath ("//p[text()='Project-Specific Documents - Piping']//parent::li//img[@class='sideMenuIcon']");
	public static By projectSpecificDocumentsPiping= By.xpath ("//p[text()='Project-Specific Documents - Piping']");
	public static By clientDocumentsPiping= By.xpath ("//p[text()='Client Documents - Piping']");
	public static By proceduresPiping= By.xpath ("//p[text()='Procedures - Piping']");
	public static By proceduresPipingCheckedMark= By.xpath ("//p[text()='Procedures - Piping']//parent::li//img[@class='sideMenuIcon']");
	
	
	public static By userName= By.name ("userEmail");
	public static By password= By.name ("password");
	public static By ProjectSpecificDocumentsStructuralSection = By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Project-Specific Documents - Structural']");
	public static By ClientDocumentsStructuralSection = By.xpath("//p[text()='Project-Specific Documents - Structural']//parent::li//parent::ul//p[text()='Client Documents - Structural']");
	public static By ProceduresStructuralSection= By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Procedures - Structural']");
	public static By CalculationTemplatesStructuralSection= By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Calculation Templates - Structural']");
	public static By TypicalDetailsStructuralSection= By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Typical Details - Structural']");
	public static By ManualsHandbooksStructuralSection = By.xpath ("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Manuals/Handbooks- Structural']");
	public static By TrainingStructuralSection= By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Training - Structural']");
	public static By OtherStructuralSection = By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Other - Structural']");
	public static By ChecklistsStructuralSection= By.xpath("//p[text()='Client Documents - Structural']//parent::li//parent::ul//p[text()='Checklists - Structural']");

	public static By linkDeleteIcon= By.xpath ("//img[@src='/static/media/xCircleFill.fab3e1a4.svg']");
	public static By link= By.xpath ("//a[@href='https://www.google.com/']");
	public static By crossIcon= By.xpath ("//img[@src='/static/media/xCircleFill.fab3e1a4.svg']");
	public static By crossDeleteButton= By.xpath ("//button[text()='Cancel']//parent::div//button[text()='Delete']");
	
}
