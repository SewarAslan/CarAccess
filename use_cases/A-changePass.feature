Feature: A-changePass

Scenario:  change User Pass
    Given want to change a user pass
    When set Email "new@gmail.com" And newPass "123321"
    Then Sucessfully Pass Changed
    
  Scenario: invalid Email
    Given  want to change a user pass
    When set Email "asd" And newPass "123"
    Then Changing Pass failed
   
   Scenario: blank Pass  
    Given  want to change a user pass
    When set Email "new@gmail.com" And newPass ""
    Then Changing Pass failed
    
    Scenario: blank Email 
    Given  want to change a user pass
    When set Email "" And newPass "123321"
    Then Changing Pass failed
    
    Scenario: email does not exist  
    Given  want to change a user pass
    When set Email "new10@gmail.com" And newPass "sews@gmail.cm"
    Then Changing Pass failed
    
    