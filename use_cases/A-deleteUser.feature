Feature: A-deleteUser

Scenario:  valid deletion
    Given wants to delete a user
    When set Email "new2@gmail.com"
    Then Sucessfully Deleted
    
 Scenario:  blank email
    Given wants to delete a user
    When set Email ""
    Then Deletion failed
    
 Scenario: invalid deletion 
    Given wants to delete a user
    When set Email "A@gmail.com"
    Then Deletion failed
    

  Scenario: try to delete the main Admin 
    Given wants to delete a user
    When set Email "Sewar@gmail.com"
    Then Deletion failed
            