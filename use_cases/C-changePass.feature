Feature: C-changePass

Scenario:  valid Changing Pass
    Given want to change my pass
    When set oldPass "123123" And newPass "321321"
    Then Sucessfully myPass Changed
    
 Scenario:  blank oldPass
    Given want to change my pass
    When set oldPass "" And newPass "321321"
    Then Changing myPass failed

    
  Scenario:  blank newPass
    Given want to change my pass
    When set oldPass "123123" And newPass ""
    Then Changing myPass failed
  
Scenario:  oldPass is not the same
    Given want to change my pass
    When set oldPass "222" And newPass "321321"
    Then Changing myPass failed    
   