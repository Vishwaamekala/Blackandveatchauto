#Author: RameshRathod
@WBSInformationDPS
Feature: WBS Information as a Structural discipline Role

  Scenario: validate As a DPS assigned to Structural discipline I will see sections:  Foundation List, Structure List
  	Given Validate Structural discipline user loged in and select project
    When validate WBSInformationHeader is Display and click on header as a Structural DPS
    When validate As a DPS assigned to Structural discipline I will see sections:  Foundation List, Structure List
    Then validate viewing data that needs to be updated, I can click on Foundation List, Structure List to addOrupdate the data and changes have been made on the screen the Save button enable.
    Then validate saving the changed data Structural discipline user will see the updated data and the Save button will be disabled and complete button Enabled
    When validate Structural discipline user once clicked on complete button then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed, a check next to the Section label will display in left panel side
  
   