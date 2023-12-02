Feature: A-edit prod

Scenario:  change url
    Given want to edit a prod
    When set desc "Car Alarms" And url "12312"
    Then Successfully Changed
    
Scenario:  invalid desc while change url
    Given want to edit a prod
    When set desc "new3@gmail.com" And url "12312"
    Then failed  Changed 
      
 
Scenario: change price
    Given want to edit a prod price
    When set desc  "Car Alarms" And price 40
    Then Successfully price Changed    
    
Scenario:  invalid desc while change price
    Given want to edit a prod price
    When set desc  "new3@gmail.com" And price 40
    Then failed price Changed     
    