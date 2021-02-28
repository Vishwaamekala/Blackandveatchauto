Feature: Click on Gig Workflows header navigated to Gig Workflow Landing page

  @TestCase44745
  Scenario:Completed all the the five steps on Gig Worflow Landing page
    Given  user login with gig workflow permission
      | assinguser       | assignpassword | projectID |
      | equipment@bv.com | test           | AMR68     |

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

#    And user select Customize Gignet and fill the details
#      | Activity         |
#      | Customize Gignet |
#
#    And user select Gig Information and fill the details
#      | Activity                                       |
#      | Gig Information                                |
#      | Review Process Datasheets                      |
#      | Prepare Draft Mechanical Datasheets            |
#      | Check Draft Mechanical Datasheets              |
#      | Setup IHR session for Mechanical Datasheets    |
#      | Conduct IHR for Mechanical Datasheets          |
#      | Resolve IHR comments for Mechanical Datasheets |
#      | PE stamp Datasheets                            |
#      | Issue of PE stamped Datasheets                 |

#Piping

  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for  PIPing displaine
    Given  user login with gig workflow permission
      | assinguser    | assig6npassword | projectID |
      | piping@bv.com | test            | AMR60     |

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

    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive
      | Activity Gignet Giginfo           |
      | Update Line Schedule              |
      | Review Line Schedule              |
#      | Create Stress Isometric Package   |
#      | Perform prelim LB Stress Analysis |
#      | Add Stress Analysis Comments to  ISO's |

#    And user select Customize Gignet and fill the details
#      | Activity         |
#      | Customize Gignet |
#
#    And user select Gig Information and fill the details for Process
#      | Activity                               |
#      | Gig Information                        |
#      | Update Line Schedule                   |
#      | Review Line Schedule                   |
#      | Create Stress Isometric Package        |
#      | Perform prelim LB Stress Analysis      |
#      | Add Stress Analysis Comments to  ISO's |

    Examples:
      | gigworkflow          |
      | Piping Line Schedule |
#      | LB Pipe Stress       |

  # Process
  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for Process displaine
    Given  user login with gig workflow permission
      | assinguser     | assig6npassword | projectID |
      | process@bv.com | test            | AMR53     |

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

    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive
      | Activity Gignet Giginfo                              |
      | Engineer Prepare                                     |
      | Engineer Review                                      |
      | Engineer Update and Sign                             |
      | Engineer Review and Sign                             |
      | Lead Engineer Review Fragnet for Completion and Sign |

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

    Examples:
      | gigworkflow    |
      | Line Schedule  |
      | Equipment List |




    # Electrical
  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for Electrical displaine
    Given  user login with gig workflow permission
      | assinguser        | assig6npassword | projectID |
      | electrical@bv.com | test            | AMR45     |

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

    And user select Customize Gignet and fill the details
      | Activity         |
      | Customize Gignet |

    And user select Gig Information and fill the details for Process
      | Activity                                 |
      | Gig Information                          |
      | Engineer populate deliverable list       |
      | Engineer review studies/results with PDE |
      | Populate preliminary circuit length      |

    Examples:
      | gigworkflow                                              |
      | Electrical Load List including Voltage Drop Calculations |
      | Electrical Load List excluding Voltage Drop Calculations |


        # I and C
  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for IandC displaine
    Given  user login with gig workflow permission
      | assinguser   | assig6npassword | projectID |
      | iandc@bv.com | test            | AMR40     |

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

    And user select Customize Gignet and fill the details
      | Activity                                                |
      | Customize Gignet                                        |
      | Issue for Programming DCS/PLC/SIS Software Config Rev 0 |
      | Issue for Programming DCS/PLC/SIS Software Config Rev 1 |

    And user select Gig Information and fill the details for Process
      | Activity                                                                               |
      | Gig Information                                                                        |
      | Collect & Review latest updated resources from internal/other discipline/client/vendor |
      | Create Engineer Deliverables (datasheet/index/requisition/control config/calculations) |
      | Senior/Lead/PDE Engineer/Designer perform QA                                           |
      | Receive/Review/Approve QA comments                                                     |
      | Update deliverables as needed                                                          |
      | Lead/PDE Engineer approve/Stamp deliverables to IFC/RFP                                |
      | Responsible parties sign and seal IFC/RFP deliverables                                 |
      | Issue for Programming DCS/PLC/SIS Software Config Rev 1                                |
      | Collect & Review latest updated resources from internal/other discipline/client/vendor |
      | Create Engineer Deliverables (datasheet/index/requisition/control config/calculations) |
      | Senior/Lead/PDE Engineer/Designer perform QA                                           |
      | Receive/Review/Approve QA comments                                                     |
      | Update deliverables as needed                                                          |
      | Lead/PDE Engineer approve/Stamp deliverables to IFC/RFP                                |
      | Responsible parties sign and seal IFC/RFP deliverables                                 |

    Examples:
      | gigworkflow                                |
      | DCS/PLC/SIS Software Configuration-F&G-F&G |
      | Instrument Tag Numbering                   |
