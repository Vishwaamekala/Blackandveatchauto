#Author: RameshRathod
Feature: Assign Discipline as a PLI Role

  @pipingDiscipline
  Scenario: Validate as a Piping Lead : Select Roles and add professional name and Navigation
    Given validate when user login as a PLI role in AssignTeam 
    Then validate AssignTeamHeader is Display and click on AssignTeamHeader Link
    When validate Section is NOT completed, an empty circle next to the PipingLeadsSection label will display in left panel
    When validate toggle is on, the name field will enable in PipingLeadsSection.
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from PipingLeadsSection without saving data
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable in PipingLeadsSection.
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the PipingLeadsSection label will display in left panel
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual in PipingLeadsSection.
    Then validate multiple permissions can be selected for a single individual.
    Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections
    
    When validate user click on Electrical Leads section
    When validate validate Section is NOT completed, an empty circle next to the ElectricalLeadsSection is display
    When validate toggle is on, the name field will enable in ElectricalLeadsSection
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from ElectricalLeadsSection section screen without saving data
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable in ElectricalLeadsSection
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the ElectricalLeadsSection is display
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for ElectricalLeadsSection
    Then validate multiple permissions can be selected for a single individual.
    Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections
    Then validate closing the browser

  