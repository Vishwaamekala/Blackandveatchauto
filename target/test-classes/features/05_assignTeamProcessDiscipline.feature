#Author: RameshRathod
Feature: Assign Discipline Team for DPS Role

  @processDiscipline
  Scenario: Validate as a Process Discipline : Select Roles and add professional name and Navigation
   Given validate when user login as a Process Discipline role in AssignTeam 
    Then validate AssignTeamHeader is Display
    Then validate AssignTeamHeader is Display and click on AssignTeamHeader Link
    When validate validate Section is NOT completed, an empty circle next to the processsEngineeringTeamSection is display
    When validate toggle is on, the name field will enable in processsEngineeringTeam
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from processsEngineeringTeam section screen without saving data
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable in processsEngineeringTeam
    When validate For select roles, user can select +Add Professional from processsEngineeringTeam which will create a new blank field to populate an additional professional for a given role
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the processsEngineeringTeam is display
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for processsEngineeringTeam
    Then validate multiple permissions can be selected for a single individual.
    Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections
    
    When validate user click on processDesignTeam
    When validate validate Section is NOT completed, an empty circle next to the processDesignTeam is display
    When validate toggle is on, the name field will enable in processDesignTeam
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from processDesignTeam section screen without saving data
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable in processDesignTeam
    When validate For select roles, user can select +Add Professional from processDesignTeam which will create a new blank field to populate an additional professional for a given role
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the processDesignTeam is display
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for processDesignTeam
    Then validate multiple permissions can be selected for a single individual.
    Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections
    Then validate closing the browser
    
  
 