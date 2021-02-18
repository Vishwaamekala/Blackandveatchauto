@Gigheaderflow

Feature: Click on Gig Workflows header navigated to Gig Workflow Landing page

  @TestCase44745
  Scenario:Completed all the the five steps on Gig Worflow Landing page
    Given  user login with gig workflow permission
      | assinguser    | assignpassword | projectID |
      | piping@bv.com | test           | AMR16     |

#    And user select  giga workflow from top menu
#    And user select the option gig workflow  dropdown
    And user select activity information and fill the details
      | Activity             |
      | Activity Information |
#
#    And user select Customize Fragnet and fill the details
#      | Activity          |
#      | Customize Fragnet |
#
#    And user select FragnetStep Information and fill the details
#      | Activity                |
#      | FragnetStep Information |
#
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
      | assinguser    | assignpassword | projectID |
      | piping@bv.com | test           | AMR20     |
    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information for piping and fill the details
      | Activity             |
      | Activity Information |

#
    #    And user select Customize Fragnet and fill the details
#      | Activity          |
#      | Customize Fragnet |
#
#    And user select FragnetStep Information and fill the details
#      | Activity                |
#      | FragnetStep Information |
#
#    And user select Customize Gignet and fill the details
#      | Activity         |
#      | Customize Gignet |
#
#    And user select Gig Information and fill the details
#      | Activity                                                              |
#      | CREATE SB STRESS ISO / PERFORM SB STRESS ANALYSIS / UPDATE STRESS ISO |
#      | Create Stress Isometric Package                                       |
#      | Perform Prelim SB Stress Analysis                                     |
#      | Add Stress Analysis Comments to  ISO's                                |
#

    Examples:
      | gigworkflow    |
      | LB Pipe Stress |
#      | SB Pipe stress |

  # Electrical
#    And user select  giga workflow from top menu
#    And user select the option gig workflow  dropdown
#    And user select activity information and fill the details
#      | Activity                           |
#      | Activity Information               |
#      | Overall Electrical One-Lines       |
#      | Instrument Raceway Plans & Details |
#
    #    And user select Customize Fragnet and fill the details
#      | Activity          |
#      | Customize Fragnet |
#
#    And user select FragnetStep Information and fill the details
#      | Activity                |
#      | FragnetStep Information |
#
#    And user select Customize Gignet and fill the details
#      | Activity         |
#      | Customize Gignet |
#  |Prepare Overall Electrical One Lines|
#  |IHR OVERALL ELECTRICAL ONE LINES                                    |
#  |CLIENT REVIEW OVERALL ELECTRICAL ONE LINES                          |

#
#    And user select Gig Information and fill the details
#      | Activity                                                              |
#      | Prepare Overall Electrical One Lines |
#      | Engineer complete one-lines                                       |
#      | Design technician draft drawings                                     |
#      | Engineer review drawings                                |
#|IHR OVERALL ELECTRICAL ONE LINES|
#    | Update drawing per Electrical studies report                               |
#    |Design technician update drawings                                           |
#    |Issue deliverables for IHR                                                  |
#    |CLIENT REVIEW OVERALL ELECTRICAL ONE LINES                                  |
#    |Place deliverables into Client Review                                       |
#    |Receive/Review/Approve Client Review comments                               |
#    |Update deliverables as needed                                               |