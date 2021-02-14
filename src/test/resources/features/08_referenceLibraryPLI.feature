##Author: RameshRathod
#@ReferenceLibrary
#Feature: Reference Library as a PLI Role
#
#  Scenario: Validate ProjectSpecificDocument sections
#    Given when user opens browser to run ReferenceLibrary Script
#    Then validate ReferenceLibraryHeader is display and click on header Link
#    Then validate ProjectSpecificDocument section is Display and click
#    When Validate user when moving the slider to on position
#    Then validate moving the slider to on position only editing of name and ID, deletingorpasting of link allowed
#    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
#    Then Validate Hovering over link cell will display entire link
#    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
#    Then Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click
#	  Then Validate user click on the save and complete button and then edit button and checked mark next to section is display 
#	  #When user click on AddReference button
#    #Then validate Newly added row can be saved without ID or link populated
#    
#   Scenario Outline: Validate ProcedureManagement section
#    Then validate ProcedureManagement section is Display and click
#    When Validate user when moving the slider to on position
#    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement
#    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
#    Then Validate Hovering over link cell will display entire link
#    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
#    When user click on AddReference button
#    Then validate Newly added row can be saved without ID or link populated in ProcedureManagement "nameTestdocument"
#    Then Validate user click on the save and complete button and then edit button and checked mark next to ProcedureManagementsection is display
#    
#    Examples:
#    |nameTestdocument|
#    |Automation|    
#  Scenario: Validate ManualsHandbooksManagementSection four columns will display: Include, Name, ID, Link
#    #When user click on ManualsHandbooksManagement SubSection
#    #Then validate Include column is display
#    #Then validate Name column is display
#    #Then validate ID column is display
#    #Then validate Link column is display
#    #When user click on AddReference button
#    #Then validate Newly added row can be saved without ID or link populated in ManualsHandbooksManagement
#  	#When Validate user when moving the slider to on position
#    #Then validate moving the slider to on position only editing of name and ID, deleting/pasting of link allowed
#    #Then Validate user can save the updated data and link will become a hyperlink to open the file or website
#    #Then Validate user click on the complete button
#
##  Scenario: Validate OtherManagementSection four columns will display Include, Name, ID, Link
#   #When user click on OtherManagement SubSection
#   #Then validate Include column is display
#   #Then validate Name column is display
#   #Then validate ID column is display
#   #Then validate Link column is display
#   #When user click on AddReference button
#   #Then validate Newly added row can be saved without ID or link populated in OtherManagement
#   #When Validate user when moving the slider to on position
#  	#Then validate moving the slider to on position only editing of name and ID, deleting/pasting of link allowed
#   #Then Validate user can save the updated data and link will become a hyperlink to open the file or website
#   #Then Validate user click on the complete button
#
##  Scenario: Validate ChecklistsManagementSection four columns will display: Include, Name, ID, Link
#   # When user click on ChecklistsManagement SubSection
#   # Then validate Include column is display
#   # Then validate Name column is display
#   # Then validate ID column is display
#   # Then validate Link column is display
#   # When user click on AddReference button
#   # Then validate Newly added row can be saved without ID or link populated in ChecklistsManagement
#   # When Validate user when moving the slider to on position
#    #Then validate moving the slider to on position only editing of name and ID, deleting/pasting of link allowed
#   # Then Validate user can save the updated data and link will become a hyperlink to open the file or website
#    # Then Validate user click on the complete butt