Feature: A-changeEmail

Scenario:  change User Email
    Given want to change a user Email
    When set oldEmail "sew@gmail.com" And newEmail "sewsew@gmail.com"
    Then Sucessfully Email Changed
    
  Scenario: change Email to an existed Email  
    Given  want to change a user Email
    When set oldEmail "new@gmail.com" And newEmail "new2@gmail.com"
    Then Changing Email failed
   
   Scenario: blank newEmail  
    Given  want to change a user Email
    When set oldEmail "new@gmail.com" And newEmail ""
    Then Changing Email failed
    
    Scenario: blank oldEmail 
    Given  want to change a user Email
    When set oldEmail "" And newEmail "sews@gmail.com"
    Then Changing Email failed
    
    Scenario: invalid newEmail  
    Given  want to change a user Email
    When set oldEmail "new@gmail.com" And newEmail "sews@gmail.cm"
    Then Changing Email failed
    
    
    
