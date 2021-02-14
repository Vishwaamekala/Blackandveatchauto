Feature: Initiate New Project: Populate Project Metadata

  #story - 42146 Initiate New Project: Populate Project Metadata
  Scenario Outline: As a PLI user i am entering all the Project Information relevant field values until all Section is complete
    Given: When user click on Project Information header. It should display subsections and all relevant fields
    Then User click on the GeneralProjectInformation SubSection First Time entered all the required values
    When Verify user can select value from the TypeOfFacility dropdown
    Then Verify user can select value from the SupportingOffices dropdown
    Then Verify user can select radio button in RiskAssessmentCompleted field
    Then Select newly created project card "<projectid>"
    Then Verify user can enter value in ProposalProjectRiskScore Textbox "ProposalProjectRiskScore"
    Then Verify user can enter value in ProposalProjectRiskLevel Textbox "risklevel"
    Then Verify user can select value from the LeadOffice dropdown
    Then Verify user can enter the value in FacilityTechnology textBox "FacilityTechnology"
    Then Verify user can select value from the ConstructionContractType dropdown
    Then Verify user can enter value in ClientName Textbox "ClientName"
    Then Verify user can select radio button from BrownAndGreen field
    Then Verify user can select radio button from AreThereForiegnContract field
    Then Verify user can select radio button from IsBlackAndVeatch field
    Then Validate ProjectLocation Ttile is display
    Then Validate AddField IconText is display
    Then Verify user can enter value in ProjectLocationState Textbox "ProjectLocationState"
    Then Verify user can enter value in ProjectLocationCountry Textbox "ProjectLocationCountry"
    Then Verify user can enter value in ProjectLocationCity Textbox "ProjectLocationCity"
    Then Validate KeyScheduleDates Ttile is display
    Then Validate AddField IconText is display
    Then Verify user can enter value in EstEngineeringTimeframe Textbox "EstEngineeringTimeframe"
    Then Verify user can enter value in EstConstructionTimeframe Textbox "EstConstructionTimeframe"
    Then Validate user click on the Save button
    Then Validate user click on the complete button

    Examples:
      |projectid| ProposalProjectRiskScore | risklevel | FacilityTechnology | ClientName             | ProjectLocationState | ProjectLocationCountry | ProjectLocationCity | EstEngineeringTimeframe | EstConstructionTimeframe |
      |AUTO9780 | 244                      | 233       | 233                | Client Name Automation | Maharastra           | India                  | Pune                | 35                      | 40                       |

#Project Scope section
  Scenario Outline: Checking all mandatory field of Project Scope section
    Given When user click on the Project Controls Subsection
    Then validate user select and check all mandatory field in ProjectScope and click on save then complete "<PerformanceResponsibility>"
    Then Select all mandatory radio buttons
    Then Validate user click on the Save button
    Then Validate user click on the complete button

    Examples:
      | PerformanceResponsibility |
      | Automation Testing        |







