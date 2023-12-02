Feature: A-edit prod

Scenario:  change url
    Given want to edit a prod
    When set index 2 And url "12312"
    Then Successfully Changed
    
Scenario:  invalid index while change url
    Given want to edit a prod
    When set index -1 And url "12312"
    Then failed  Changed 
      
 
Scenario: change price
    Given want to edit a prod price
    When set index 1 And price 40
    Then Successfully price Changed    
    
Scenario:  invalid index while change price
    Given want to edit a prod price
    When set index -1 And price 40
    Then failed price Changed    
    
     
Scenario:  valid index while change availabiltiy
    Given want to edit a prod availabiltiy
    When set index 2 and availabiltiy to true
    Then success availabiltiy Change
    
Scenario:  invalid index while change availabiltiy
    Given want to edit a prod availabiltiy
    When set index -1 and availabiltiy to true
    Then failed availabiltiy Change
    
 Scenario:  valid index while change availabiltiy
    Given want to edit a prod availabiltiy
    When set index 2 and availabiltiy to false
    Then success availabiltiy Change
    
Scenario:  invalid index while change availabiltiy
    Given want to edit a prod availabiltiy
    When set index -1 and availabiltiy to false
    Then failed availabiltiy Change
    
      