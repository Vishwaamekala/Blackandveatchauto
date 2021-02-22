Feature: Click on Gig Workflows header navigated to Gig Workflow Landing page

  @TestCase44745
  Scenario:Completed all the the five steps on Gig Worflow Landing page
    Given  user login with gig workflow permission
      | assinguser       | assignpassword | projectID |
      | equipment@bv.com | test           | AMR32     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown
    And user select activity information and fill the details
      | Activity             |
      | Activity Information |
#
    And user select Customize Fragnet and fill the details
      | Activity          |
      | Customize Fragnet |
#
    And user select FragnetStep Information and fill the details
      | Activity                |
      | FragnetStep Information |
#
    And user select Customize Gignet and fill the details
      | Activity         |
      | Customize Gignet |

    And user select Gig Information and fill the details
      | Activity                                       |
      | Gig Information                                |
      | Review Process Datasheets                      |
      | Prepare Draft Mechanical Datasheets            |
      | Check Draft Mechanical Datasheets              |
      | Setup IHR session for Mechanical Datasheets    |
      | Conduct IHR for Mechanical Datasheets          |
      | Resolve IHR comments for Mechanical Datasheets |
      | PE stamp Datasheets                            |
      | Issue of PE stamped Datasheets                 |



#Piping

  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for  PIPing displaine
    Given  user login with gig workflow permission
      | assinguser    | assig6npassword | projectID |
      | piping@bv.com | test            | AMR35     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information for piping and fill the details
      | Activity             |
      | Activity Information |
#
    And user select Customize Fragnet and fill the details
      | Activity          |
      | Customize Fragnet |

    And user select FragnetStep Information and fill the details
      | Activity                |
      | FragnetStep Information |

    And user select Customize Gignet and fill the details
      | Activity         |
      | Customize Gignet |

    And user select Gig Information and fill the details for piping
      | Activity                             |
      | Gig Information                      |
      | Create Stress Isometric Package      |
      | Perform Prelim SB Stress Analysis    |
      | Add Stress Analysis Comments to  ISO |


    Examples:
      | gigworkflow    |
      | LB Pipe Stress |
      | SB Pipe stress |

  # Process
  @TestCase44745
  Scenario Outline:Completed all the the five steps on Gig Worflow for Process displaine
    Given  user login with gig workflow permission
      | assinguser     | assig6npassword | projectID |
      | process@bv.com | test            | AMR37     |

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
      | Activity                                             |
      | Gig Information                                      |
      | Engineer Prepare                                     |
      | Engineer Review                                      |
      | Engineer Update and Sign                             |
      | Engineer Review and Sign                             |
      | Lead Engineer Review Fragnet for Completion and Sign |

    Examples:
      | gigworkflow   |
      | Line Schedule |
#      | Equipment List |
