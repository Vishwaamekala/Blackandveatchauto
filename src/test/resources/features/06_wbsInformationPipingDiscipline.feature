#Author: RameshRathod
@WBSInformationDPS
Feature: WBS Information as a Piping discipline Role

  Scenario Outline: validate As a DPS assigned to Piping discipline I will see sections:  Pipe Specification List, Tie-in Priority List
    Given Validate DPS Piping discipline user loged in and select project
    When validate WBSInformationHeader is Display and click on header as a Piping DPS
    When validate As a DPS assigned to Piping discipline I will see sections:  Pipe Specification List, Tie-in Priority List
    Then validate viewing data that needs to be updated, I can click on Pipe Specification List, Tie-in Priority List to addOrupdate the data and changes have been made on the screen the Save button enable. "pipeSpecificationNumber","pipeSpecificationMaterial","pipeSpecificationClass","tieInPriority"
    Then validate saving the changed data I will see the updated data and the Save button will be disabled and complete button Enabled
    When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed, a check next to the Section label will display in left panel side

    Examples:
      | pipeSpecificationNumber | pipeSpecificationMaterial | pipeSpecificationClass | tieInPriority |
      | 66666                   | Automation Piping         | Test Class             | 6666          |
#  String foundationTag,String foundationName,String structureTag ,String structureName
  Scenario: validate As a DPS assigned to Process discipline I will see sections:  Process Area List, Philosophy Document List, Study List, System / Fluid List
		#Given Validate Process discipline user loged in and select project
    #When validate DPS Process discipline click on WBSInformationHeader Link
    #When validate As a DPS assigned to Process discipline I will see sections:  Process Area List, Philosophy Document List, Study List, SystemFluid List
    #Then validate viewing data that needs to be updated, I can click on Process Area List, Philosophy Document List, Study List, SystemFluid List to addOrupdate the data and changes have been made on the screen the Save button enable.
    #Then validate saving the changed data Process discipline user will see the updated data and the Save button will be disabled and complete button Enabled
    #When validate Process discipline user once clicked on complete button then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed, a check next to the Section label will display in left panel side

  Scenario: validate As a DPS assigned to Electrical discipline I will see sections:  Electrical Equipment List, Powerhouse List, Electrical System List
		#Given Validate Electrical discipline user loged in and select project
    #When validate DPS Electrical discipline click on WBSInformationHeader Link
    #When validate As a DPS assigned to Electrical discipline I will see sections:  Electrical Equipment List, Powerhouse List, Electrical System List
   	#Then validate viewing data that needs to be updated, I can click on Electrical Equipment List, Powerhouse List, Electrical System List to addOrupdate the data and changes have been made on the screen the Save button enable.
    #Then validate saving the changed data Electrical discipline user will see the updated data and the Save button will be disabled and complete button Enabled
    #When validate Electrical discipline user once clicked on complete button then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed, a check next to the Section label will display in left panel side

  Scenario: validate As a DPS assigned to I&C discipline I will see sections:  Instrument Type List, Control System list, Control panel List
		#Given Validate I&C discipline user loged in and select project
    #When validate DPS I&C discipline click on WBSInformationHeader Link
    #When validate As a DPS assigned to I&C discipline I will see sections:  Instrument Type List, Control System list, Control panel List
    #Then validate viewing data that needs to be updated, I can click on Instrument Type List, Control System list, Control panel List to addOrupdate the data and changes have been made on the screen the Save button enable.
    #Then validate saving the changed data I&C discipline user will see the updated data and the Save button will be disabled and complete button Enabled
    #When validate I&C discipline user once clicked on complete button then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed, a check next to the Section label will display in left panel side
  
  


  