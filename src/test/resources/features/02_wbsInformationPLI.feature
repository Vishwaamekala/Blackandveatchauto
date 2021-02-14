#Author: RameshRathod
@WBSInformation
Feature: WBS Information as a PLI role

  Scenario: Validate As a PLI see the sections titles on the left side: Purchase Specification List, CWA List, Module List, MechanicalEquipmentList.
    Given validate when user login as a PLI role in WBSInformation
    Then validate WBSInformationHeader is Display and click on header
    Then validate CWAList section text is Display
    Then validate ModuleList section text is Display
    Then validate PurchaseSpecificationList Section text is Display
    Then validate MechanicalEquipmentList Section text is Display

  Scenario: Validate CWA List two columns will display: CWA number, CWA name
    When user click on CWAList SubSection
    Then validate CWAList HeaderTitle is Display
    Then validate CWA ExportList Template is Display
    Then validate importButton is Display
    Then validate searchIcon is Display
    Then validate CWA number column is display
    Then validate CWA name column is display
    Then validate addRow Icon is Display at bottom

  Scenario Outline: Validate user are able to Add new Row in CWAList
    When Validate user click on CWAList SubSection
    Then validate user click on the addRow Icon
    Then Validate user enter the CWA Number and CWA Name "CWANumberTextBox","CWANameTextBox"
    Then Validate save button is enabled
    Then Validate user click on the save button
    Then validate save button is disabled
    Then validate complete button is enabled
    Then validate user click on complete button
    #Then validate user edit the row
    #Then validate user reset the data
    #Then validate user again edit the row
    #Then Validate save button is enabled and save the updated data
    #Then validate updated data is display

    Examples:
      | CWANumberTextBox | CWANameTextBox |
      | 1234             | Test123        |

  Scenario: Validate ModuleList three columns will display: Module number, module name, CWA Number/name
    When user click on ModuleList SubSection
    Then validate ModuleList HeaderTitle is Display
    Then validate ModuleList ExportList Template is Display
    Then validate importButton2 is Display
    Then validate searchIcon2 is Display
    Then validate Module number column is display
    Then validate module name column is display
    Then validate CWA Numbersname column is display
    Then validate addRow Icon2 is Display at bottom

  Scenario Outline: Validate user are able to Add new Row in ModuleList
    When Validate user click on ModuleList SubSection
    Then validate user click on the addRow Icon2
    Then Validate user enter the Modulenumber and modulename and CWA Numbername "moduleNumberColumnTextBox","moduleNameColumnTextBox"
    Then Validate save2 button is enabled
    Then Validate user click on the save2 button
    Then validate save2 button is disabled
    Then validate complete2 button is enabled
    Then validate user click on complete2 button
    #Then validate user edit the row
    #Then validate user reset the data
    #Then validate user again edit the row
    #Then Validate save button is enabled and save the updated data
    # Then validate updated data is display
    Examples:
      | moduleNumberColumnTextBox | moduleNameColumnTextBox |
      | 1234M                     | cwaNumberNameDropDown   |


  Scenario: Validate Purchase Specification List three columns will display: Purchase Specification number, purchase specification name, Discipline
    When user click on PurchaseSpecificationList SubSection
    Then validate PurchaseSpecificationList HeaderTitle is Display
    Then validate PurchaseSpecificationList ExportList Template is Display
    Then validate importButton3 is Display
    Then validate searchIcon3 is Display
    Then validate PurchaseSpecificationNumber column is display
    Then validate PurchaseSpecificationName column is display
    Then validate Discipline column is display
    Then validate addRow Icon3 is Display at bottom

  Scenario: Validate user are able to Add new Row in PurchaseSpecificationList
    When Validate user click on PurchaseSpecificationList SubSection
    Then validate user click on the addRow Icon3
    Then Validate user enter the value in PurchaseSpecificationNumber and PurchaseSpecificationName and Discipline column
    Then Validate save3 button is enabled
    Then Validate user click on the save3 button
    Then validate save3 button is disabled
    Then validate complete3 button is enabled
    Then validate user click on complete button3
    #Then validate user edit the row
    #Then validate user reset the data
    #Then validate user again edit the row
    #Then Validate save button is enabled and save the updated data
    # Then validate updated data is display
