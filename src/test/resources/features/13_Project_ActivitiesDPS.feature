Feature: Click on the Project Activties and complete

 #@44784,44785,44786,44795,44796,44797,46864, Manhour Budgets 45290,44735,44737,44739,44741
  # Story - @42610,42611,45556, Manhour Budgets 44077,44744,44078,44174

  Scenario Outline: Click on the Project Activities header and complete all the subsections
  Given: When user clicks on Project Activities Header area
    Then When user enters Define Activities screen
    Then When user clicks on Generate Project Activities
    Then Verify DPS is able to edit the Activity name in the Activities list
    Then Verify when DPS selects multiple values from dropdown in WBS related fields
    Then Verify DPS is able to add new DOS Activity in Activities list
    Then To verify Mark DOS activity complete
    Then Verify when DPS selects DOS Activity form in Manhour Budgets section
    Then Apply Manhours: Viewing Manhour Budgets
    Then Verify ENG & DSGN Hours
    Then Apply Manhours: Viewing Manhour Budgets
    Then Verify DSGN Hours and associated functionality.
    Then Verify DOS Activity when completed
    Then Apply Manhours: Number count of DOS Activities completed and remaining


    Examples: