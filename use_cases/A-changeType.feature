Feature: A-changeType

Scenario:  change customer to Admin
    Given Start Point
    When set Email "new2@gmail.com" And newType 1
    Then Sucessfully Type Changed
    
 Scenario:  change customer to Installer
    Given Start Point
    When set Email "new3@gmail.com" And newType 2
    Then Sucessfully Type Changed 
    
 Scenario: change Admin Type  
    Given Start Point
    When set Email "Sewar@gmail.com" And newType 3
    Then Changing Type failed
    
 Scenario: Change Installer Type
    Given Start Point
    When set Email "new@gmail.com" And newType 1
    Then Changing Type failed
         