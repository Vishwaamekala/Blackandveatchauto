@Gigheaderflow

Feature: Click on Gig Workflows header navigated to Gig Workflow Landing page

  @TestCase44745
  Scenario:Completed all the the five steps on Gig Worflow Landing page
    Given  user login with gig workflow permission
      | assinguser       | assignpassword | projectID |
      | equipment@bv.com | test           | AMR14     |

    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown
#    And user select activity information and fill the details
#      | Activity             |
#      | Activity Information |

#    And user select Customize Fragnet and fill the details
#      | Activity          |
#      | Customize Fragnet |

#    And user select FragnetStep Information and fill the details
#      | Activity                |
#      | FragnetStep Information |

#    And user select Customize Gignet and fill the details
#      | Activity         |
#      | Customize Gignet |

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





#  Scenario Outline: Completed all the the five steps on Gig Worflow Landing page
#    Given  user login with gig workflow permission
#      | assinguser        | assignpassword | projectID |
#      | structural@bv.com | test           | AMR14     |

##     And Select any value from project activity  dropdown
##     And click on  activity information link
##     When user fill required data in the Activity information and click on save button and compete button
#
#
##     Given Activity Information is the first Step from the Gig Workflows Landing page for each Project Activity
##     Then Click on Step1 on Activity Information title and fill all the mandatory fields
##     Then Clicking Save will save users edits and activate continue button
##     Then Selecting Continue will save form and navigate user to Step 2 Customize Fragnet
##     Then Validate	Step 2 screen contain 4 toggle options (In-House Review, Client Review, Combined In-House Review, and 3rd-Party Review) with default settings based on the PLI selections
#
#    Examples:
#      |test  |
#
#
#
