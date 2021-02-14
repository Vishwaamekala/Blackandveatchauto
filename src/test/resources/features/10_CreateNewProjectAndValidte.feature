Feature:  Create and validate project super and non super users

#@41854 - Initiate New Project
  @createnewprojectandassign
  Scenario Outline: Create a project with super user and validate the project
    Given As user login with super permission "<userName>", "<password>"
    Given As user i click on Createproject  and new project created with required values "<projectNumber>","<projectName>"
    Then Select newly created project card
    Then click on Assign the Project  and assigned to the user "<assigneduser>"
    Then close the browser
    Given validate when user login as a PLI role in projectInformation


    Examples:
      | userName         | password | projectNumber | projectName                   | assigneduser      |
      | superuser@bv.com | test     | AUTO          | project Name With  Automation | M K Vishwa Prasad |

  @assigndisciplines
  Scenario Outline: Assign permission to different displains user to differnet users and validate.
    Given As user login with super permission "<userName>", "<password>"
  #  Then Select newly created project card "<projectid>"
    Then click on Assign the Project  and assigned to the user "<assigndiscipline>" ,"<assigneddisplainuser>"
#9780, 5870, 6147 all headers done
    Examples:
      | userName        | password | projectid | assigndiscipline | assigneddisplainuser  |
#      | prasadm1@bv.com | test     | AUTO6147   | Piping Leads     | Piping Discipline    |
      | prasadm1@bv.com | test     | AUTO6147  | Electrical Leads | Electrical Discipline |

  @TestCase44745
  Scenario Outline: validaate electrical discipline
#    Given As user login with super permission "<superuserName>", "<superpassword>"
#    Given As user i click on Createproject  and new project created with required values "<projectNumber>","<projectName>"
#    Then Select newly created project card
#    Then click on Assign the Project  and assigned to the user "<assigneduser>"
#    Then close the browser
#    Given validate when user login as a PLI role in projectInformation
#    Then close the browser
#    Given As user login with super permission "<manageruserName>", "<managerpassword>"
#    Then Select newly created project card "<projectid>"
#    Then click on Assign the Project  and assigned to the user "<assigndiscipline>" ,"<assigneddisplainuser>"
#    Then close the browser
    Given As user login with super permission "<assignedruserName>", "<assignedpassword>"
    Then Select newly created project card "<projectid>"
    Then Click on WBS Option
    Then validate electrical displain options on left menu "<listoptions>"
    Then user fill the the details for Electrical Equipment List
      | Type                      | Electricalequipmentnumber | Electricalequipmentname | Electricalequipmenttype | Voltage | CWAnumbername |
      | Electrical Equipment List | EEN2009                   | Generater               | TypeAuto                | 220V    | VWS234        |
    Then user fill the the details for Powerhouse List
      | Type            | PowerhouseTag | PowerhouseName          | CWAnumbername |
      | Powerhouse List | P212          | Security Power supooort | test by auto  |
    Then user fill the the details for Electrical systems name
      | Type                    | Electricalsystemsname         |
      | Electrical Systems List | Automation  electrical system |



    Examples:
      | superuserName    | superpassword | projectNumber | projectName                   | assigneduser      | manageruserName | managerpassword | projectid | assigndiscipline | assigneddisplainuser  | assignedruserName | assignedpassword | listoptions                                      |
      | superuser@bv.com | test          | AUTO          | project Name With  Automation | M K Vishwa Prasad | prasadm1@bv.com | test            | AUTO2910  | Electrical Leads | Electrical Discipline | electrical@bv.com | test             | Powerhouse List;Electrical Systems List;CWA List |


  Scenario Outline: validaate Project information
#    Given As user login with super permission "<superuserName>", "<superpassword>"
#    Given As user i click on Createproject  and new project created with required values "<projectNumber>","<projectName>"
#    Then Select newly created project card
#    Then click on Assign the Project  and assigned to the user "<assigneduser>"
#    Then close the browser
#    Given validate when user login as a PLI role in projectInformation
#    Then close the browser
#    Given As user login with super permission "<manageruserName>", "<managerpassword>"
#    Then Select newly created project card "<projectid>"
#    Then click on Assign the Project  and assigned to the user "<assigndiscipline>" ,"<assigneddisplainuser>"
#    Then close the browser
    Given As user login with super permission "<assignedruserName>", "<assignedpassword>"
    Then Select newly created project card "<projectid>"
    Then Click on Project information
    Then Click on WBS Option
    Then validate electrical displain options on left menu "<listoptions>"




    Examples:
      | superuserName    | superpassword | projectNumber | projectName                   | assigneduser      | manageruserName | managerpassword | projectid | assigndiscipline | assigneddisplainuser  | assignedruserName | assignedpassword | listoptions                                      |
      | superuser@bv.com | test          | AUTO          | project Name With  Automation | M K Vishwa Prasad | prasadm1@bv.com | test            | AUTO2910  | Electrical Leads | Electrical Discipline | electrical@bv.com | test             | Powerhouse List;Electrical Systems List;CWA List |






