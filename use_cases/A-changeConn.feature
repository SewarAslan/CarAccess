Feature: A-changeconn

Scenario:  change User Name
    Given want to change a user data
    When set Email "new3@gmail.com" And Name "Sewar Aslan" And Phone "" And Address ""
    Then Successfully Conn Changed
    
  Scenario: change User Phone
    Given  want to change a user data
    When set Email "new3@gmail.com" And Name "" And Phone "090807" And Address ""
    Then Successfully Conn Changed
   
 Scenario:  change User Address
    Given want to change a user data
    When set Email "new3@gmail.com" And Name "" And Phone "" And Address "Nablus"
    Then Successfully Conn Changed
    
    Scenario:  All blank 
    Given want to change a user data
    When set Email "new3@gmail.com" And Name "" And Phone "" And Address ""
    Then Changing Conn failed
    
   Scenario:  onlyName blank 
    Given want to change a user data
    When set Email "new3@gmail.com" And Name "" And Phone "657458" And Address "Nablus"
    Then Changing Conn failed
    
    Scenario:  onlyPhone blank 
    Given want to change a user data
    When set Email "new3@gmail.com" And Name "Sewar Aslan" And Phone "" And Address "Nablus"
    Then Changing Conn failed
    
    Scenario:  onlyAddress blank 
    Given want to change a user data
    When set Email "new3@gmail.com" And Name "Sewar" And Phone "657458" And Address ""
    Then Changing Conn failed