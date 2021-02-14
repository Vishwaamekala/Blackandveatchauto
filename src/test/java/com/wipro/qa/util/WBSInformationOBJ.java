package com.wipro.qa.util;

import org.openqa.selenium.By;
import com.wipro.qa.base.TestBase;

public class WBSInformationOBJ extends TestBase {

	
	public static By WBSInformationHeader = By.xpath("//div[text()='WBS Information']");
	public static By WBSInformationHeaderLink = By.xpath("//a[@href='/projectSetup/wbsInformation']");
	public static By userName= By.name ("userEmail");
	public static By password= By.name ("password");
	public static By WBSBreadcrumb = By.xpath("//div[@class='project-breadcrumb']/span[3]");
	public static By WBSInformationText = By.xpath("//p[text()='CWA List']//parent::li//parent::ul//span[text()='WBS Information']");
	public static By CWAListSection = By.xpath("//p[text()='Module List']//parent::li//parent::ul//p[text()='CWA List']");
	public static By moduleListSection = By.xpath("//p[text()='CWA List']//parent::li//parent::ul//p[text()='Module List']");
	public static By purchaseListSection= By.xpath("//p[text()='CWA List']//parent::li//parent::ul//p[text()='Purchase Specification List']");
	public static By mechanicalListSection = By.xpath ("//p[text()='CWA List']//parent::li//parent::ul//p[text()='Mechanical Equipment List']");
	public static By laminarLogo1 = By.xpath ("//div[@class='sidebar-image']/img[1]");
	public static By laminarLogo2 = By.xpath ("//div[@class='sidebar-image']/img[2]");
	
	//CWA list
	public static By CWAListTopText = By.xpath ("//span[text()='CWA List']");
	public static By exportListTemplate = By.xpath ("//span[text()='Export List Template']");
	public static By importButton = By.xpath ("//button[text()='Import']");
	public static By searchIcon = By.xpath ("//span[text()='Export List Template']");
	public static By CWANumberColumn = By.xpath ("//th[text()='CWA Name']//parent::tr//th[text()='CWA Number']");
	public static By CWANameColumn = By.xpath ("//th[text()='CWA Number']//parent::tr//th[text()='CWA Name']");
	public static By addRowButton = By.xpath ("//span[@class='addWbsRow']/img");
	public static By CWANumberTextBox = By.name ("wbsTable[0].cwaId");
	public static By CWANameTextBox = By.name ("wbsTable[0].cwaName");
	public static By CWANumberTextBoxEdit = By.xpath ("//tbody/tr[1]/td[1]");
	public static By CWANumberTextBoxEdit1 = By.xpath ("//tbody/tr[1]/td[1]/div/div/input");
	
	//moduleList
	public static By moduleListTopText = By.xpath("//span[text()='Module List']");
	public static By moduleNumberColumn = By.xpath ("//th[text()='Module Name']//parent::tr//th[text()='Module Number']");
	public static By moduleNameColumn = By.xpath("//th[text()='Module Number']//parent::tr//th[text()='Module Name']");
	public static By CWANumberNameColumn = By.xpath("//th[text()='Module Name']//parent::tr//th[text()='CWA Number/Name']");
	public static By moduleNumberColumnTextBox = By.xpath ("//th[text()='Module Number']//parent::th//parent::tr//parent::thead//parent::table//input[@name='wbsTable[0].moduleNumber']");
	public static By moduleNameColumnTextBox = By.xpath("//input[@name='wbsTable[0].moduleName']");
	public static By CWANumberNameColumnTextBox = By.name ("wbsTable[0].cwaNumberName");
	
	//PurchaseSpecification List
	public static By purchaseSpecificationTopText = By.xpath("//span[text()='Purchase Specification List']");
	public static By purchaseSpecificationNumberColumn = By.xpath("//th[text()='Discipline']//parent::tr//th[text()='Purchase Specification Number']");
	public static By purchaseSpecificationNameColumn = By.xpath("//th[text()='Discipline']//parent::tr//th[text()='Purchase Specification Name']");
	public static By disciplineColumn = By.xpath("//th[text()='Purchase Specification Name']//parent::tr//th[text()='Discipline']");
	public static By purchaseSpecificationNumberColumnDropDown = By.name ("wbsTable[0].purchaseSpecNumber");
	public static By purchaseSpecificationNameColumnTextBox = By.name("wbsTable[0].purchaseSpecName");
	public static By disciplineColumnTextBox = By.name("wbsTable[0].discipline");
	public static By rowClick = By.xpath("//tbody/tr[1]");
	
	
	
	//MechanicalEquipmentList List
	public static By EquipmentTagColumn = By.xpath("//th[text()='Equipment Name']//parent::tr//th[text()='Equipment Tag']");
	public static By EquipmentNameColumn = By.xpath("//th[text()='Equipment Tag']//parent::tr//th[text()='Equipment Name']");
	public static By EquipmentTypeColumn = By.xpath("//th[text()='Equipment Name']//parent::tr//th[text()='Equipment Type']");
	public static By purchasespecificationnumbernameColumn = By.xpath("//th[text()='Equipment Name']//parent::tr//th[text()='purchase specification number/name']");
	public static By ProcessAreaIDNameColumn = By.xpath("//th[text()='Equipment Name']//parent::tr//th[text()='Process Area ID/Name']");
	public static By CWAnumbernameColumn = By.xpath("//th[text()='Equipment Name']//parent::tr//th[text()='CWA number/name']");
	
	public static By EquipmentTagColumnTextBox = By.name("wbsTable[0].equipmentTag");
	public static By EquipmentNameColumnTextBox = By.name("wbsTable[0].equipmentName");
	public static By equipmentTypedropDown = By.name("wbsTable[0].equipmentType");
	public static By purchaseSpecificationNumberNamedropDown = By.name("wbsTable[0].purchaseSpecificationNumberName");
	public static By processAreaIdNamedropDown = By.name("wbsTable[0].processAreaIdName");
	public static By cwaNumberNameDropDown = By.name("wbsTable[0].cwaNumberName");
	
	//Piping
	public static By PipeSpecificationList = By.xpath("//p[text()='Tie-in Priority List']//parent::li//parent::ul//p[text()='Pipe Specification List']");
	public static By pipeSpecificationNumber = By.name ("wbsTable[0].pipeSpecificationNumber");
	public static By pipeSpecificationMaterial = By.name ("wbsTable[0].pipeSpecificationMaterial");
	public static By pipeSpecificationClass = By.name ("wbsTable[0].pipeSpecificationClass");
	public static By PipeSpecificationListCheckedMark = By.xpath ("//p[text()='Pipe Specification List']//parent::li//img[@class='sideMenuIcon']");
	
	public static By TieinPriorityList = By.xpath("//p[text()='Pipe Specification List']//parent::li//parent::ul//p[text()='Tie-in Priority List']");
	public static By tieInPriority = By.name ("wbsTable[0].tieInPriority");
	public static By TieinPriorityListCheckedMark = By.xpath ("//p[text()='Tie-in Priority List']//parent::li//img[@class='sideMenuIcon']");
	
	
	
	//Process
	public static By ProcessAreaList = By.xpath("//p[text()='Philosophy Document List']//parent::li//parent::ul//p[text()='Process Area List']");
	public static By processAreaId = By.name ("wbsTable[0].processAreaId");
	public static By processAreaName = By.name ("wbsTable[0].processAreaName");
	public static By ProcessAreaListCheckedMark = By.xpath ("//p[text()='Process Area List']//parent::li//img[@class='sideMenuIcon']");

	public static By PhilosophyDocumentList = By.xpath("//p[text()='Process Area List']//parent::li//parent::ul//p[text()='Philosophy Document List']");
	public static By philosophyDocumentNumber = By.name ("wbsTable[0].philosophyDocumentNumber");
	public static By philosophyDocumentName = By.name ("wbsTable[0].philosophyDocumentName");
	public static By PhilosophyDocumentListCheckedMark = By.xpath ("//p[text()='Philosophy Document List']//parent::li//img[@class='sideMenuIcon']");

	public static By StudyList = By.xpath("//p[text()='Philosophy Document List']//parent::li//parent::ul//p[text()='Study List']");
	public static By studyNumber = By.name ("wbsTable[0].studyNumber");
	public static By studyName = By.name ("wbsTable[0].studyName");
	public static By StudyListCheckedMark = By.xpath ("//p[text()='Study List']//parent::li//img[@class='sideMenuIcon']");

	public static By SystemFluidList = By.xpath("//p[text()='Philosophy Document List']//parent::li//parent::ul//p[text()='System/Fluid List']");
	public static By fluidName = By.name ("wbsTable[0].fluidName");
	public static By SystemFluidListCheckedMark = By.xpath ("//p[text()='System/Fluid List']//parent::li//img[@class='sideMenuIcon']");

	//Structural 
		public static By FoundationList = By.xpath("//p[text()='Structure List']//parent::li//parent::ul//p[text()='Foundation List']");
		public static By foundationTag = By.name ("wbsTable[0].foundationTag");
		public static By foundationName = By.name ("wbsTable[0].foundationName");
		public static By foundationType = By.name ("wbsTable[0].foundationType");
		public static By cwaNumberNameDropDown1 = By.name ("wbsTable[0].cwaNumberName");
		public static By FoundationListCheckedMark = By.xpath ("//p[text()='Foundation List']//parent::li//img[@class='sideMenuIcon']");
		
		public static By StructureList = By.xpath("//p[text()='Foundation List']//parent::li//parent::ul//p[text()='Structure List']");
		public static By structureTag = By.name ("wbsTable[0].structureTag");
		public static By structureName = By.name ("wbsTable[0].structureName");
		public static By structureType = By.name ("wbsTable[0].structureType");
		public static By cwaNumberNameDropDown2 = By.name ("wbsTable[0].cwaNumberName");
		public static By StructureListCheckedMark = By.xpath ("//p[text()='Structure List']//parent::li//img[@class='sideMenuIcon']");
		
	//Electrical 
				public static By ElectricalEquipmentList = By.xpath("//p[text()='Powerhouse List']//parent::li//parent::ul//p[text()='Electrical Equipment List']");
				public static By electricalEquipmentNumber = By.name ("wbsTable[0].electricalEquipmentNumber");
				public static By electricalEquipmentName = By.name ("wbsTable[0].electricalEquipmentName");
				public static By electricalEquipmentType = By.name ("wbsTable[0].electricalEquipmentType");
				public static By electricalvoltage = By.name ("wbsTable[0].voltage");
				public static By cwaNumberNameDropDown3 = By.name ("wbsTable[0].cwaNumberName");
				public static By ElectricalEquipmentListCheckedMark = By.xpath ("//p[text()='Electrical Equipment List']//parent::li//img[@class='sideMenuIcon']");
				public static By PowerhouseList = By.xpath("//p[text()='Electrical Equipment List']//parent::li//parent::ul//p[text()='Powerhouse List']");
				public static By powerhouseTag = By.name ("wbsTable[0].powerhouseTag");
				public static By powerhouseName = By.name ("wbsTable[0].powerhouseName");
				public static By cwaNumberNameDropDown4 = By.name ("wbsTable[0].cwaNumberName");	
				public static By PowerhouseListCheckedMark = By.xpath ("//p[text()='Powerhouse List']//parent::li//img[@class='sideMenuIcon']");
				public static By ElectricalSystemsList = By.xpath("//p[text()='Powerhouse List']//parent::li//parent::ul//p[text()='Electrical Systems List']");
				public static By electricalSystemsName = By.name ("wbsTable[0].electricalSystemsName");
				public static By ElectricalSystemsListCheckedMark = By.xpath ("//p[text()='Electrical Systems List']//parent::li//img[@class='sideMenuIcon']");
				public static By deleteIcon = By.xpath ("//img[@src='/static/media/trash.ca7161ca.svg']");
				public static By validateelectricalequipmentlst= By.xpath("//ul[@value='Electrical Equipment List']//li//p[text()='textToReplace']");
				public static By electricalequipmentlst= By.xpath("//ul[@value='Electrical Equipment List']//li//p[text()='textToReplace']");

	public static By RESET_BUTTON= By.xpath("//button[text()='Save']//parent::div//button[text()='Reset']");
	public static By SAVE_BUTTON = By.xpath("//button[text()='Reset']//parent::div//button[text()='Save']");
	public static By COMPLETE_BUTTON= By.xpath("//button[text()='Reset']//parent::div//button[text()='Complete']");
	public static By EDIT_BUTTON= By.xpath ("//button[text()='Edit']");

}
