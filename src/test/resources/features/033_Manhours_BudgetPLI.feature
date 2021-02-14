-Feature: Allocate all Manhour budgets to all the project activities

  #42614 - Apply Manhours: Allocate Manhour Budget to Project Activities

  Scenario Outline: Click on the Manhour Budgets header and complete all the subsections as PLI user
  Given: When user clicks on Manhour Budgets Header area
    Then It should display default to Piping subsection
    Then User enters all the numeric values for all the text fields below Piping header below fields
    Then Validate user click on the save button
    Then validate user click on complete button

    Examples:

  Scenario Outline: Click on the Electrical header and complete all the subsections as PLI user
    Given: When user clicks on Electrical Header area
    Then It should display default to Electrical subsection
    Then User enters all the numeric values for all the text fields below Electrical header below fields
    Then Validate user click on the save button
    Then validate user click on complete button

    Examples:

  Scenario Outline: Click on the I&C header and complete all the subsections as PLI user
  Given: When user clicks on I&C Header area
    Then It should display default to I&C subsection
    Then User enters all the numeric values for all the text fields below I&C header below fields
    Then Validate user click on the save button
    Then validate user click on complete button

    Examples:

  Scenario Outline: Click on the Structural header and complete all the subsections as PLI user
  Given: When user clicks on Structural Header area
    Then It should display default to Structural subsection
    Then User enters all the numeric values for all the text fields below Structural header below fields
    Then Validate user click on the save button
    Then validate user click on complete button

    Examples:

  Scenario Outline: Click on the Process header and complete all the subsections as PLI user
  Given: When user clicks on Process Header area
    Then It should display default to Process subsection
    Then User enters all the numeric values for all the text fields below Process header below fields
    Then Validate user click on the save button
    Then validate user click on complete button

    Examples:

  Scenario Outline: Click on the Equipment header and complete all the subsections as PLI user
  Given: When user clicks on Equipment Header area
    Then It should display default to Equipment subsection
    Then User enters all the numeric values for all the text fields below Equipment header below fields
    Then Validate user click on the save button
    Then validate user click on complete button

    Examples:


