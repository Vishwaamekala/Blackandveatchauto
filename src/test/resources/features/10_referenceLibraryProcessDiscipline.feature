#Author: RameshRathod
Feature: Reference Library as a Process role

 Scenario: Validate ProjectSpecificDocumentsPiping sections
    Given validate user login as a process role for ReferenceLibrary
    Then validate ReferenceLibraryHeader is display and click on header Link
    Then validate ProjectSpecificDocumentsPiping section is Display and click
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only editing of name and ID, deletingorpasting of link allowed
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate Hovering over link cell will display entire link
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    Then Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click
	  Then Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsPipingsection is display 
	  #When user click on AddReference button
    #Then validate Newly added row can be saved without ID or link populated
    
   Scenario: Validate ProceduresPiping section
    Then validate ProceduresPiping section is Display and click
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate Hovering over link cell will display entire link
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    When user click on AddReference button
    Then validate Newly added row can be saved without ID or link populated in ProcedureManagement
    Then Validate user click on the save and complete button and then edit button and checked mark next to ProcedurePipingsection is display
    
   
    #Then validate All user added rows (either by duplicate or by Add Reference) can be deleted by selecting the trash can on the far right of the row.
