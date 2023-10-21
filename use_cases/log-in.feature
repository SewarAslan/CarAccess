Feature: log-in


Scenario:  Valid Login
    Given I am not on the system
    When set Email "Sewar@gmail.com" And Password "123123" 
    Then I am on the system
    
Scenario:  invalid Email
    Given I am not on the system
    When set Email "Sewargmail.com" And Password "123123" 
    Then log-in failed
    
 Scenario:  blank Email
    Given I am not on the system
    When set Email "" And Password "123123" 
    Then log-in failed
    
 Scenario:  blank Password
    Given I am not on the system
    When set Email "Sewar@gmail.com" And Password "" 
    Then log-in failed
    
      
    
    
