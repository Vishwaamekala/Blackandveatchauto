Feature: Enter all the required fields in WBS header section for each subsections

  #story - 42147 Initiate New Project: Manually Enter WBS Lists

  Scenario Outline: Click on the WBS Information header and complete all the subsections as PLI user
  Given: When user clicks on WBS Information Header area
    Then validate user by default on CWA List subsection and he click on the addRow link in CWA List header below
    Then Validate user enter the CWA Number and CWA Name "CWANumberTextBox","CWANameTextBox" in the text box
    Then Validate user click on the save button
    Then validate user click on complete button

    Examples:
      | CWANumberTextBox | CWANameTextBox |
      | 1234             | Test123        |

  Scenario Outline: Click on Module List subsection and enter all the required fields until complete button done
  Given User click on ModuleList SubSection and below Module List below header
    Then validate user click on the addRow link
    Then Validate user enter the Modulenumber and modulename and CWA Numbername "moduleNumberColumnTextBox","moduleNameColumnTextBox"
    Then Validate Save button is clicked
    Then Validate Complete button is clicked

    Examples:
      | moduleNumberColumnTextBox | moduleNameColumnTextBox |
      | 1234M                     | cwaNumberNameDropDown   |

  Scenario Outline: Click on Purchase Specification List subsection and enter all the required fields until complete button done
    Given User click on Purchase Specification List SubSection and below header
    Then validate user click on the addRow link
    Then Validate user selects "<Purchase Specification Number>" from the dropdown
    Then Validate Save button is clicked
    Then Validate Complete button is clicked

    Examples:

