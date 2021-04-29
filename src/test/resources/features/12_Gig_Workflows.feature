Feature: Click on Gig Workflows header navigated to Gig Workflow Landing page

  @TestCase44745
  Scenario:Completed all the the five steps on Gig Worflow Landing page
    Given  user login with gig workflow permission
      | assinguser       | assignpassword | projectID |
      | equipment@bv.com | test           | SSE04     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown
    And user select activity information
      | Activity             |
      | Activity Information |
    And user click edit button to edit existing details.
    And user fill activity information form
    And user select Customize Fragnet
      | Activity          |
      | Customize Fragnet |
    And user click edit button and change fileds on customize fragnet page
    And user click save continue button
    And user select FragnetStepInformation tab
      | Activity                |
      | FragnetStep Information |
    And user click edit button and change fileds on FragnetStepInformation
    And user click save continue button

    And User selects Stepfour Customize Gignet
    And user click edit button for edit
    And user remove all selected customie gignet
      | Prepare & Issue Mech Equip Data Sheets Rev 0 |
      | Update & Issue Mech Equip Data Sheets Rev 1  |
      | Update & Issue Mech Equip Data Sheets Rev 2  |
    And user fill values and completed stepfour Customize Gignet and save continue allprocess
      | Prepare & Issue Mech Equip Data Sheets Rev 0 |
      | Update & Issue Mech Equip Data Sheets Rev 1  |
      | Update & Issue Mech Equip Data Sheets Rev 2  |
    And user select StepFive Gig Information
      | Activity Gignet Giginfo |
    And user click edit button for edit
    And user remove all selected Giginformation
      | Prepare & Issue Mech Equip Data Sheets Rev 0 |
      | Update & Issue Mech Equip Data Sheets Rev 1  |
      | Update & Issue Mech Equip Data Sheets Rev 2  |
    And user selects Selected values in Stepfive and complete slide menu on Gig information
      | Prepare & Issue Mech Equip Data Sheets Rev 0 | Review Process Datasheets,Prepare Draft Mechanical Datasheets,Check Draft Mechanical Datasheets,Setup IHR Session For Mechanical Datasheets,Conduct IHR For Mechanical DatasheetsSPACE,Resolve IHR Comments For Mechanical DatasheetsSPACE,Pe Stamp Datasheets,Issue Of PE Stamped DatasheetsSPACE,Heat Exchanger 2D CAD Sketches                                                                                                                          |
      | Update & Issue Mech Equip Data Sheets Rev 1  | Review Process Datasheets,Tanks 2D CAD Sketches,Vessels 2D CAD Sketches,Heat Exchanger 2D CAD Sketches,3D Modeling And Asme Code Calculations,HTRI Modeling And Code Calculations,Prepare Draft Mechanical Datasheets,Check Draft Mechanical Datasheets,Setup IHR Session For Mechanical Datasheets,Conduct IHR For Mechanical DatasheetsSPACE,Resolve IHR Comments For Mechanical DatasheetsSPACE,Pe Stamp Datasheets,Issue Of PE Stamped DatasheetsSPACE |
      | Update & Issue Mech Equip Data Sheets Rev 2  | Review Process Datasheets,Tanks 2D CAD Sketches,Vessels 2D CAD Sketches,Heat Exchanger 2D CAD Sketches,3D Modeling And Asme Code Calculations,HTRI Modeling And Code Calculations,Prepare Draft Mechanical Datasheets,Check Draft Mechanical Datasheets,Setup IHR Session For Mechanical Datasheets,Conduct IHR For Mechanical DatasheetsSPACE,Resolve IHR Comments For Mechanical DatasheetsSPACE,Pe Stamp Datasheets,Issue Of PE Stamped DatasheetsSPACE |

#Piping

  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for  Piping discipline
    Given  user login with gig workflow permission
      | assinguser    | assig6npassword | projectID |
      | piping@bv.com | test            | SSE02     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information
      | Activity             |
      | Activity Information |
    And user click edit button to edit existing details.
    And user fill activity information form
    And user select Customize Fragnet
      | Activity          |
      | Customize Fragnet |
    And user click edit button and change fileds on customize fragnet page
    And user click save continue button
    And user select FragnetStepInformation tab
      | Activity                |
      | FragnetStep Information |
    And user click edit button and change fileds on FragnetStepInformation
    And user click save continue button
    And User selects Stepfour Customize Gignet
    And user click edit button for edit
    And user remove all selected customie gignet
      | Update Piping Tie-In List / Prepare Location Drawings & Details                                  |
      | IHR Piping Tie-In List, Location Dwgs & Details                                                  |
      | Incorp IHR Comments And Issue Piping Tie-In List, Location Drawings, & Details For Client Review |
      | Client Review Piping Tie-In List, Location Drawings & Details                                    |
      | Incorp Client Comments And IFC Piping Tie-In List, Location Drawings, & Details                  |

    And user fill values and completed stepfour Customize Gignet and save continue allprocess
      | Update Piping Tie-In List / Prepare Location Drawings & Details                                  |
      | IHR Piping Tie-In List, Location Dwgs & Details                                                  |
      | Incorp IHR Comments And Issue Piping Tie-In List, Location Drawings, & Details For Client Review |
      | Client Review Piping Tie-In List, Location Drawings & Details                                    |
      | Incorp Client Comments And IFC Piping Tie-In List, Location Drawings, & Details                  |
    And user select StepFive Gig Information
      | Activity Gignet Giginfo |
    And user click edit button for edit
    And user remove all selected Giginformation
      | Update Piping Tie-In List / Prepare Location Drawings & Details                                  |
      | IHR Piping Tie-In List, Location Dwgs & Details                                                  |
      | Incorp IHR Comments And Issue Piping Tie-In List, Location Drawings, & Details For Client Review |
      | Client Review Piping Tie-In List, Location Drawings & Details                                    |
      | Incorp Client Comments And IFC Piping Tie-In List, Location Drawings, & Details                  |

    And user selects Selected values in Stepfive and complete slide menu on Gig information
      | Update Piping Tie-In List / Prepare Location Drawings & Details                                  | Review Tie-Ins On P&IDs,Gather Info On Physical Tie-In Locations,Locate Tie-Ins In Model,Create Tie-In Spreadsheet,Create Tie-In Package,Create Tie-In Location Drawing,Issue Drawing For IHR |
      | IHR Piping Tie-In List, Location Dwgs & Details                                                  | IHR Facilitator Compiles IHR Comments                                                                                                                                                         |
      | Incorp IHR Comments And Issue Piping Tie-In List, Location Drawings, & Details For Client Review | Address IHR Comments,Issue For Client Review                                                                                                                                                  |
      | Client Review Piping Tie-In List, Location Drawings & Details                                    | Client Review Facilitator Compiles Comments                                                                                                                                                   |
      | Incorp Client Comments And IFC Piping Tie-In List, Location Drawings, & Details                  | Address Client Review Comments,Extract Info From Model / Clean Up And Annotate,PDE Review Approve And Stamp,PLD Review And Issue                                                              |

    Examples:
      | gigworkflow             |
      | Tie-In List And Details |

  # Process
  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for Process discipline
    Given  user login with gig workflow permission
      | assinguser     | assig6npassword | projectID |
      | process@bv.com | test            | SSE01     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information
      | Activity             |
      | Activity Information |
    And user click edit button to edit existing details.
    And user fill activity information form
    And user select Customize Fragnet
      | Activity          |
      | Customize Fragnet |
    And user click edit button and change fileds on customize fragnet page
    And user click save continue button
    And user select FragnetStepInformation tab
      | Activity                |
      | FragnetStep Information |
    And user click edit button and change fileds on FragnetStepInformation
    And user click save continue button

    And User selects Stepfour Customize Gignet
    And user click edit button for edit
    And user remove all selected customie gignet
      | Prepare & Issue Process Line Schedule |
    And user fill values and completed stepfour Customize Gignet and save continue allprocess
      | Prepare & Issue Process Line Schedule |

    And user select StepFive Gig Information
      | Activity Gignet Giginfo |
    And user click edit button for edit
    And user remove all selected Giginformation
      | Prepare & Issue Process Line Schedule|
    And user selects Selected values in Stepfive and complete slide menu on Gig information
      | Prepare & Issue Process Line Schedule | Engineer Prepare,Engineer Review,Engineer Update And Sign,Engineer Review And Sign,Lead Engineer Review Fragnet For Completion And Sign |

    Examples:
      | gigworkflow   |
      | Line Schedule |


