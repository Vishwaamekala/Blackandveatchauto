#Author: RameshRathod
Feature: WorkflowRule for PLI Role

  Background:  login for all test
    Given validate when user login as a PLI role in projectInformation


  Scenario: View and Update FragmentStep duration
    Then validate WorkflowRuleHeader is Display and click on header as a PLI role
    Then validate is there any checkbox defaultly select. remove all check marks from the fragnent steps
    Then validate if user selects any of the checkbox it should display duration below in textbox
    Then validate default value if user modifed  duration and check and uncheck checkbox

  @Test123
  Scenario Outline: View all the fragement box steps are displayed in Workflow header section
    When  User select a workflow rule box  "Nameoftherulebox" and validate duration input textbox "durationinput"
    Then  User unselect the workflow rule box, the duration input textbox should not display

    Examples:
      | Nameoftherulebox             | durationinput |
      | In-House Review              | 5             |
      | Client Review                | 5             |
      | Combined IHR & Client Review | 5             |
      | 3rd-Party Review             | 60            |


#      Then validate Create,In-House Review , Client Review, Combined IHR & Client Review, and 3rd-Party Review, Issue for Construction are displayed;
#      Then validate Create and Issue for construction is static
#      Then validate In-House Review, Client Review, Combined IHR & Client Review, and 3rd-Party Review are selectable.
#      Then validate if the box is unsselected upon hovering over a box a select button appear
#      Then validate selecting box displays a check box in the upper left corner
#
#    Scenario: WorkflowVersion1 In-House Review and Client Review is selected then Combined IHR & Client Review CANNOT be selected
#      Then validate In-House and Client Review checkbox is checked it should not allow user to select Combined IHE and Client Review boxes
#      Then validate it should it should display Duration text box below the box
#      Then validate user is not allowed to see uncheck boxes Duration text field
#
#    Scenario: WorkflowVersion2 Combined IHR and Client Review checkbox is selected it should not allow user to check In-House Review, Client Review and 3rd-Party Review
#      Then validate Combined IHR and Client Review checkbox is selected it should not allow to check In-House Review, Client Review and 3rd-Party Review
#      Then validate it should it should display Duration text box below the box
#      Then validate user is not allowed to see uncheck boxes Duration text field
#
#    Scenario: WorkflowVersion3 In-House Review checkbox is selected then user is not allowed to select Client Review, Combined IHR and Client Review and 3rd-Party Review
#      Then validate when user selects In-House Review checkbox it should not allow user to select Client Review, Combined IHR and Client Review and 3rd-Party Review checkboxes
#      Then validate it should it should display Duration text box below the box
#      Then validate user is not allowed to see uncheck boxes Duration text field
#
#  Scenario: WorkflowVersion4 In-House Review, Client Review and 3rd-Party Review checkbox is selected it should not allow user to select Combined IHR and Client Review checkbox
#    Then validate user select In-House Review, Client Review and 3rd-Party Review checkbox is selected user is not allowed to select Combined IHR and Client Review checkbox
#    Then validate it should display Duration text box below the box
#    Then validate user is not allowed to see uncheck boxes Duration text field
#
#  Scenario: WorkflowVersion5 In-House Review, Client Review not able to select it should allow user to select Combined IHR and Client Review and 3rd-Party Review checkbox
#    Then validate when user did not select In-House Review and Client Review checkbox then user can able to select Combined IHR and Client Review and 3rd-Party Review checkbox
#    Then validate user is not allowed to see uncheck boxes Duration text field
#
#    Scenario: WorkflowVersion5 In-House Review and 3rd-Party Review checkbox is selected then user is not allowed to select Client Review and Combined IHR and Client Review checkbox
#      Then validate it should display Duration text box below the box
#      Then validate user is not allowed to see uncheck boxes Duration text field
#
#


#  Scenario: Validate As a PLI Define Workflow Rules: View and update FragnetStep durations and Define Workflow Rules: Select Applicable FragnetStep Types
#    #Given validate when user login as a PLI role in WorkflowRule
#    Then validate WorkflowRuleHeader is Display and click on header as a PLI role
#    Then validate If the box is unselected, upon hovering over a box, a select button appears
#    Then validate Upon selecting FragnetStep boxes, I can view the default durations tied to each step
#    Then validate when a duration needs to be changed, I can edit the durations by selecting the duration field
#    Then validate PLI is displayed a generic workflow with Create, and Issue for Construction static; In-House Review, Client Review, Combined IHR & Client Review, and 3rd-Party Review are selectable
#    Then validate If In-House Review or Client Review is selected, Combined IHR & Client Review CANNOT be selected and vice versa
#    Then validate If the box is selected, upon hovering over a box, a deselect button appears
#    Then validate Deselecting box removed check from upper left corner.
#
