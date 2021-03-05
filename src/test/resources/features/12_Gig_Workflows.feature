Feature: Click on Gig Workflows header navigated to Gig Workflow Landing page

  @TestCase44745
  Scenario:Completed all the the five steps on Gig Worflow Landing page
    Given  user login with gig workflow permission
      | assinguser       | assignpassword | projectID |
      | equipment@bv.com | test           | AMR69     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown
    And user select activity information and fill the details
      | Activity             |
      | Activity Information |

    And user select Customize Fragnet and fill the details
      | Activity          |
      | Customize Fragnet |
#
    And user select FragnetStep Information and fill the details
      | Activity                |
      | FragnetStep Information |

#
    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive
      | Activity Gignet Giginfo             |
      | Review Process Datasheets           |
      | Prepare Draft Mechanical Datasheets |
      | Check Draft Mechanical Datasheets   |



#Piping

  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for  Piping discipline
    Given  user login with gig workflow permission
      | assinguser    | assig6npassword | projectID |
      | piping@bv.com | test            | AMR69     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information and fill the details
      | Activity             |
      | Activity Information |

    And user select Customize Fragnet and fill the details
      | Activity          |
      | Customize Fragnet |

    And user select FragnetStep Information and fill the details
      | Activity                |
      | FragnetStep Information |

    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive "<gigworkflow>","<submenus>"

    Examples:
      | gigworkflow    | submenus                                                          |
      | SB Pipe stress | Create Stress Isometric Package,Perform Prelim SB Stress Analysis |
      | LB Pipe Stress | Create Stress Isometric Package,Perform prelim LB Stress Analysis |

  # Process
  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for Process discipline
    Given  user login with gig workflow permission
      | assinguser     | assig6npassword | projectID |
      | process@bv.com | test            | AMR69     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information and fill the details
      | Activity             |
      | Activity Information |

    And user select Customize Fragnet and fill the details
      | Activity          |
      | Customize Fragnet |

    And user select FragnetStep Information and fill the details
      | Activity                |
      | FragnetStep Information |

    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive "<gigworkflow>","<submenus>"

    Examples:
      | gigworkflow    | submenus                                                                                                                                |
      | Line Schedule  | Engineer Prepare,Engineer Review,Engineer Update and Sign,Engineer Review and Sign,Lead Engineer Review Fragnet for Completion and Sign |
      | Equipment List | Engineer Prepare,Engineer Review,Engineer Update and Sign,Engineer Review and Sign,Lead Engineer Review Fragnet for Completion and Sign |


#    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive
#      | Activity Gignet Giginfo                              |
#      | Engineer Prepare                                     |
#      | Engineer Review                                      |
#      | Engineer Update and Sign                             |
#      | Engineer Review and Sign                             |
#      | Lead Engineer Review Fragnet for Completion and Sign |

#    And user select Customize Gignet and fill the details
#      | Activity         |
#      | Customize Gignet |
#
#    And user select Gig Information and fill the details for Process
#      | Activity                                             |
#      | Gig Information                                      |
#      | Engineer Prepare                                     |
#      | Engineer Review                                      |
#      | Engineer Update and Sign                             |
#      | Engineer Review and Sign                             |
#      | Lead Engineer Review Fragnet for Completion and Sign |

#    Examples:
#      | gigworkflow    |
#      | Line Schedule  |
#      | Equipment List |


    # Electrical
  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for Electrical discipline
    Given  user login with gig workflow permission
      | assinguser        | assig6npassword | projectID |
      | electrical@bv.com | test            | AMR69     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information and fill the details for Process
      | Activity             |
      | Activity Information |

    And user select Customize Fragnet and fill the details
      | Activity          |
      | Customize Fragnet |

    And user select FragnetStep Information and fill the details
      | Activity                |
      | FragnetStep Information |

    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive "<gigworkflow>","<submenus>"

    Examples:
      | gigworkflow                                              | submenus                                                                                                        |
      | Electrical Load List including Voltage Drop Calculations | Engineer populate deliverable list,Engineer review studies/results with PDE,Populate preliminary circuit length |
      | Electrical Load List excluding Voltage Drop Calculations | Engineer populate deliverable list,Engineer review studies/results with PDE,Populate preliminary circuit length |

#    And user select Customize Gignet and fill the details
#      | Activity         |
#      | Customize Gignet |

#    And user select Gig Information and fill the details for Process
#      | Activity                                 |
#      | Gig Information                          |
#      | Engineer populate deliverable list       |
#      | Engineer review studies/results with PDE |
#      | Populate preliminary circuit length      |
#
#    Examples:
#      | gigworkflow                                              |
#      | Electrical Load List including Voltage Drop Calculations |
#      | Electrical Load List excluding Voltage Drop Calculations |


        # I and C  70 72 -76
  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for IandC displaine
    Given  user login with gig workflow permission
      | assinguser   | assig6npassword | projectID |
      | iandc@bv.com | test            | AMR81     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information and fill the details for Process
      | Activity             |
      | Activity Information |

    And uncheck all FragnetStep Information nonreview steps and select first  nonreview step
    And user select Customize Fragnet and fill the details
      | Activity          |
      | Customize Fragnet |
    And user select FragnetStep Information and fill the details
      | Activity                |
      | FragnetStep Information |

    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive "<gigworkflow>","<submenus>"

    Examples:
      | gigworkflow                        | submenus                                                                                                                                                                                           |
      | DCS/PLC/SIS Software Configuration | Collect & Review latest updated resources from internal/other discipline/client/vendor,Senior/Lead/PDE Engineer/Designer perform QA,Receive/Review/Approve QA comments                             |
      | Instrument Tag Numbering           | Collect & Review latest updated resources from internal/other discipline/client/vendor,Verify & update instrument tag numbers. ,Confirm & back circle updated instrument tag numbers with process. |


#    And user select Customize Gignet and fill the details
#      | Activity                                                |
#      | Customize Gignet                                        |
#      | Issue for Programming DCS/PLC/SIS Software Config Rev 0 |
#      | Issue for Programming DCS/PLC/SIS Software Config Rev 1 |

#    And user select Gig Information and fill the details for Process
#      | Activity                                                                               |
#      | Gig Information                                                                        |
#      | Collect & Review latest updated resources from internal/other discipline/client/vendor |
#      | Create Engineer Deliverables (datasheet/index/requisition/control config/calculations) |
#      | Senior/Lead/PDE Engineer/Designer perform QA                                           |
#      | Receive/Review/Approve QA comments                                                     |
#      | Update deliverables as needed                                                          |
#      | Lead/PDE Engineer approve/Stamp deliverables to IFC/RFP                                |
#      | Responsible parties sign and seal IFC/RFP deliverables                                 |

#      | Issue for Programming DCS/PLC/SIS Software Config Rev 1                                |
#      | Collect & Review latest updated resources from internal/other discipline/client/vendor |
#      | Create Engineer Deliverables (datasheet/index/requisition/control config/calculations) |
#      | Senior/Lead/PDE Engineer/Designer perform QA                                           |
#      | Receive/Review/Approve QA comments                                                     |
#      | Update deliverables as needed                                                          |
#      | Lead/PDE Engineer approve/Stamp deliverables to IFC/RFP                                |
#      | Responsible parties sign and seal IFC/RFP deliverables                                 |

#    Examples:
#      | gigworkflow                                |
#      | DCS/PLC/SIS Software Configuration-F&G-F&G |
#      | Instrument Tag Numbering                   |


# Structural
  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for Structural displaine
    Given  user login with gig workflow permission
      | assinguser        | assig6npassword | projectID |
      | structural@bv.com | test            | AMR68     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information and fill the details for Process
      | Activity             |
      | Activity Information |

    And uncheck all FragnetStep Information nonreview steps and select first  nonreview step
    And user select Customize Fragnet and fill the details
      | Activity          |
      | Customize Fragnet |
    And user select FragnetStep Information and fill the details
      | Activity                |
      | FragnetStep Information |

    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive "<gigworkflow>","<submenus>"

    Examples:
      | gigworkflow                               | submenus                                                                                                                                                                                          |
      | Secondary Structural Steel Design & Model | Engineer Secondary Steel / Prepare Calculation,Update 3D Model for Secondary Steel,IHR & Incorp COMMENTS SECONDARY STRUCT STEEL MODEL,Issue for IHR,IHR Facilitator Compiles IHR Comments         |
      | Modules Structures Drawings               | Update 2D Sketch / Produce Formal 2D Drawings for IHR,Engineer Check Drawings,Designer Check Drawings,Update 3D Model / 2D Drawings as Needed,Lead Engineer Approve Drawing for IHR,Issue for IHR |

