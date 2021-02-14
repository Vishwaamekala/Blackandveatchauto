package com.wipro.qa.util;

import org.openqa.selenium.By;
import com.wipro.qa.base.TestBase;

public class AssignTeamOBJ extends TestBase {
	
	public static By  AssignTeamLink = By.xpath ("//a[@href='/projectSetup/assignProjectLeads']");
	public static By AssignTeamHeader = By.xpath ("//div[text()='Assign Team']");
	
	/*****Below xpath is for Piping Engineering Team********/
	public static By pipingEngineeringTeam = By.xpath ("//p[text()='Piping Design Team']//parent::li//parent::ul//p[text()='Piping Engineering Team']");
	public static By pipingEngineeringCheckedMark= By.xpath ("//p[text()='Piping Engineering Team']//parent::li//img[@class='sideMenuIcon']");
	public static By pipingEngineeringUnCheckedMark= By.xpath ("//p[text()='Piping Engineering Team']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By PipingPDE = By.xpath ("//label[text()='Piping Engineering Sub-lead/Co-Lead']");
	public static By PipingPLD = By.xpath ("//label[text()='Piping Designer Sub-lead/Co-Lead']");
	public static By dropDownBox = By.xpath ("//div[@class='auto-select-theme css-2b097c-container']/div/div[1]/div[1]");
	public static By dropDownValue = By.xpath ("//div[text()='Matthew Fowler / Lead / Kansas']");
	public static By dropDownValueforEdit = By.xpath ("//div[text()='john doe / Lead / Wipro']");
	public static By NotifyAllAssignees = By.xpath ("//span[text()='Notify All Assignees']");
	public static By togglePipingEngineering = By.xpath ("//label[@for='pipingEngineeringSubLeadCoLead']");
	public static By defineUserPermissions = By.xpath ("//span[text()='Define User Permissions']");
	public static By notify = By.xpath ("//span[text()='Notify']");
	public static By addProfesstional = By.xpath ("//div[@class='field-group row'][1]/div[2]/div[2]/button/span");
	public static By dropDownBoxAddProfesstional = By.xpath ("//div[@class='field-group row'][1]/div[2]/div[2]/div/div/div/div[1]");
	
	/*****Below xpath is for Piping Design Team********/
	public static By pipingDesignTeam = By.xpath ("//p[text()='Piping Engineering Team']//parent::li//parent::ul//p[text()='Piping Design Team']");
	public static By pipingDesignTeamCheckedMark= By.xpath ("//p[text()='Piping Design Team']//parent::li//img[@class='sideMenuIcon']");
	public static By pipingDesignTeamUnCheckedMark= By.xpath ("//p[text()='Piping Design Team']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By pipingEngineer = By.xpath ("//label[text()='Piping Engineer']");
	public static By pipingTechnician = By.xpath ("//label[text()='Piping Technician']");
	public static By togglePipingDesign = By.xpath ("//label[@for='pipingEngineer']");
	
	/*****Below xpath is for process Engineering Team********/
	public static By processEngineeringTeam = By.xpath ("//p[text()='Process Design Team']//parent::li//parent::ul//p[text()='Process Engineering Team']");
	public static By processEngineeringTeamCheckedMark= By.xpath ("//p[text()='Process Engineering Team']//parent::li//img[@class='sideMenuIcon']");
	public static By processEngineeringTeamUnCheckedMark= By.xpath ("//p[text()='Process Engineering Team']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By processEngineering = By.xpath ("//label[text()='Process Engineering Sub-lead/Co-Lead']");
	public static By processDesigner = By.xpath ("//label[text()='Process Designer Sub-lead/Co-Lead']");
	public static By toggleprocessEngineering = By.xpath ("//label[@for='processEngineeringSubLeadCoLead']");
	
	/********Below code for the process Desing Team***************/
	public static By processDesignTeam = By.xpath ("//p[text()='Process Engineering Team']//parent::li//parent::ul//p[text()='Process Design Team']");
	public static By processDesignTeamCheckedMark= By.xpath ("//p[text()='Process Design Team']//parent::li//img[@class='sideMenuIcon']");
	public static By processDesignTeamUnCheckedMark= By.xpath ("//p[text()='Process Design Team']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By processEngineeringText = By.xpath ("//label[text()='Process Engineer']");
	public static By processTechnician = By.xpath ("//label[text()='Process Technician']");
	public static By toggleprocessDesignTeam = By.xpath ("//label[@for='processEngineer']");
	
	/********Below code for the Piping Lead PLI***************/
	public static By pipingLeads = By.xpath ("//p[text()='Electrical Leads']//parent::li//parent::ul//p[text()='Piping Leads']");
	public static By pipingLeadsCheckedMark= By.xpath ("//p[text()='Piping Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By pipingLeadsUnCheckedMark= By.xpath ("//p[text()='Piping Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By pipingPDE = By.xpath ("//label[text()='Piping PDE / Engineering Lead']");
	public static By pipingPLD = By.xpath ("//label[text()='Piping PLD / Design Lead']");
	public static By togglepipingLeads = By.xpath ("//label[@for='pipingPdeEngineeringLead']");
	
	/********Below code for the Electrical Lead PLI***************/
	public static By ElectricalLeadsSection = By.xpath ("//p[text()='Piping Leads']//parent::li//parent::ul//p[text()='Electrical Leads']");
	public static By electricalCheckedMark= By.xpath ("//p[text()='Electrical Leads']//parent::li//img[@class='sideMenuIcon']");
	public static By electricalUnCheckedMark= By.xpath ("//p[text()='Electrical Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
	public static By toggleElectrical= By.xpath ("//label[@for='electricalPdeEngineeringLead']");
	public static By electricalPDE = By.xpath ("//label[text()='Electrical PDE / Engineering Lead']");
	public static By electricalPLD = By.xpath ("//label[text()='Electrical PLD / Design Lead']");
	public static By form = By.xpath ("//form[@initialvalues='[object Object]']");


	
	public static By addRoleButton = By.xpath ("//img[@src='/static/media/add.b23f718f.svg']");
	public static By roleTitle = By.xpath ("//*[@placeholder='input text'][@id='roleTitle']");
	public static By roleDescription = By.xpath ("//*[@placeholder='Write your message here'][@id='roleDescription']");
	public static By saveButtonAddRole = By.xpath ("//button[text()='Cancel']//parent::div//button[text()='Save']");
	
	// Define user permition 
	public static By gigDistributorRole = By.xpath ("//input[@value='gd']");
	public static By gigCompleterRole = By.xpath ("//input[@value='gc']");
	public static By iIconForGigcompleter = By.xpath ("//span[text()='Gig completer']//parent::div//img[@src='/static/media/icon-info.d60fb09f.svg']");
	public static By hoverInformation = By.xpath ("//span[text()='Person responsible for performing Gigs in Laminar (typically ALL USERs are Gig Completers)']");
	public static By saveForDefineUser = By.xpath ("//button[text()='Cancel']//parent::div//button[text()='Save']");
	
	public static By RESET_BUTTON= By.xpath("//button[text()='Save']//parent::div//button[text()='Reset']");
	public static By SAVE_BUTTON = By.xpath("//button[text()='Reset']//parent::div//button[text()='Save']");
	public static By COMPLETE_BUTTON= By.xpath("//button[text()='Reset']//parent::div//button[text()='Complete']");
	public static By EDIT_BUTTON= By.xpath ("//button[text()='Edit']");

	//electrical subSection

	
	//I&CLead subSection
		public static By IAndCLeadSection = By.xpath ("//p[text()='Electrical Leads']//parent::li//parent::ul//p[text()='I&C Leads']");
		public static By IAndCCheckedMark= By.xpath ("//p[text()='I&C Leads']//parent::li//img[@class='sideMenuIcon']");
		public static By IAndCUnCheckedMark= By.xpath ("//p[text()='I&C Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
		public static By toggleIAndC= By.xpath ("//label[@for='icPdeEngineeringLead']");
		public static By IAndCPDE = By.xpath ("//label[text()='I&C PDE / Engineering Lead']");
		public static By IAndCPLD = By.xpath ("//label[text()='I&C PLD / Design Lead']");
		
		//Structural Leads subSection
				public static By StructuralLeadsSection = By.xpath ("//p[text()='Electrical Leads']//parent::li//parent::ul//p[text()='StructuralLeads']");
				public static By StructuralLeadsCheckedMark= By.xpath ("//p[text()='StructuralLeads']//parent::li//img[@class='sideMenuIcon']");
				public static By StructuralLeadsUnCheckedMark= By.xpath ("//p[text()='StructuralLeads']//parent::li//span[@class='sideMenuIcon circle-white']");
				public static By toggleStructuralLeads= By.xpath ("//label[@for='structuralPdeEngineeringLead']");
				public static By StructuralLeadsCPDE = By.xpath ("//label[text()='Structural PDE / Engineering Lead']");
				public static By StructuralLeadsPLD = By.xpath ("//label[text()='Structural PLD / Design Lead']");

				//Process Leads subSection
				public static By processLeadsSection = By.xpath ("//p[text()='Electrical Leads']//parent::li//parent::ul//p[text()='Process Leads']");
				public static By processLeadsCheckedMark= By.xpath ("//p[text()='Process Leads']//parent::li//img[@class='sideMenuIcon']");
				public static By processLeadsUnCheckedMark= By.xpath ("//p[text()='Process Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
				public static By toggleprocessLeads= By.xpath ("//label[@for='processPdeEngineeringLead']");
				public static By processLeadsPDE = By.xpath ("//label[text()='Process PDE / Engineering Lead']");
				public static By processLeadsPLD = By.xpath ("//label[text()='Process PLD / Design Lead']");
				
				//Equipment Leads subSection
				public static By equipmentLeadsSection = By.xpath ("//p[text()='Electrical Leads']//parent::li//parent::ul//p[text()='Equipment Leads']");
				public static By equipmentLeadsCheckedMark= By.xpath ("//p[text()='Equipment Leads']//parent::li//img[@class='sideMenuIcon']");
				public static By equipmentLeadsUnCheckedMark= By.xpath ("//p[text()='Equipment Leads']//parent::li//span[@class='sideMenuIcon circle-white']");
				public static By toggleEquipmentLeads= By.xpath ("//label[@for='equipmentPdeEngineeringLead']");
				public static By equipmentLeadsPDE = By.xpath ("//label[text()='Equipment PDE / Engineering Lead']");
				public static By equipmentLeadsPLD = By.xpath ("//label[text()='Equipment PLD / Design Lead']");

				//Select All discipline
				public static By selectAnyProjectLeads= By.xpath ("//p[text()='textToReplace']//parent::li//span");
				public static By selectEnableAnyLeads = By.xpath("//div[@class='custom-control custom-switch toggle-button'][1]//label");
				public static By selectUser = By.xpath("//div[@class='field-group row']//div[contains(text(),'Select')][1]");
				public static By inputProfessionalname= By.xpath( "//div[@class='auto-select-prefix-theme__input']//input");


	//Management Team subSection
				public static By managementTeamSection = By.xpath ("//p[text()='Electrical Leads']//parent::li//parent::ul//p[text()='Management Team']");
				public static By managementTeamCheckedMark= By.xpath ("//p[text()='Management Team']//parent::li//img[@class='sideMenuIcon']");
				public static By managementTeamUnCheckedMark= By.xpath ("//p[text()='Management Team']//parent::li//span");
				public static By toggleManagementTeam= By.xpath ("//label[@for='projectManager']");
				public static By managementTeamPDE = By.xpath ("//label[text()='Equipment PDE / Engineering Lead']");
				public static By managementTeamPLD = By.xpath ("//label[text()='Equipment PLD / Design Lead']");
				public static By managementProjectProfessionalname= By.xpath("//label[@for='projectManager']//ancestor::div[@class='field-group row']//div[contains(text(),'Select')]");
				public static By managementinputProfessionalname= By.xpath( "//input[@id='react-select-6-input']");
				public static By PMModelwindowSavebtn = By.xpath("//div[@class='bvModalHeader']//parent::div//button[text()='Save']");

				//Structural Engineering Team subSection
				public static By structuralEngineeringTeamSection = By.xpath ("//p[text()='Electrical Leads']//parent::li//parent::ul//p[text()='Structural Engineering Team']");
				public static By structuralEngineeringTeamCheckedMark= By.xpath ("//p[text()='Structural Engineering Team']//parent::li//img[@class='sideMenuIcon']");
				public static By structuralEngineeringTeamUnCheckedMark= By.xpath ("//p[text()='Structural Engineering Team']//parent::li//span[@class='sideMenuIcon circle-white']");
				public static By togglestructuralEngineeringTeam= By.xpath ("//label[@for='structuralEngineeringSubLeadCoLead']");
				public static By structuralEngineeringTeamPDE = By.xpath ("//label[text()='Structural Engineering Sub-lead/Co-Lead']");
				public static By structuralEngineeringTeamPLD = By.xpath ("//label[text()='Structural Designer Sub-lead/Co-Lead']");
				
				//Management Team subSection
				public static By structuralDesignTeamSection = By.xpath ("//p[text()='Electrical Leads']//parent::li//parent::ul//p[text()='Structural Design Team']");
				public static By structuralDesignTeamCheckedMark= By.xpath ("//p[text()='Structural Design Team']//parent::li//img[@class='sideMenuIcon']");
				public static By structuralDesignTeamUnCheckedMark= By.xpath ("//p[text()='Structural Design Team']//parent::li//span[@class='sideMenuIcon circle-white']");
				public static By togglestructuralDesignTeam= By.xpath ("//label[@for='structuralEngineer']");
				public static By structuralDesignTeamPDE = By.xpath ("//label[text()='Structural Engineer']");
				public static By structuralDesignTeamPLD = By.xpath ("//label[text()='Structural Technician']");





}
