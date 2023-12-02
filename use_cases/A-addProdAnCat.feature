Feature: A-addProdAndCat

Scenario:  existed product Name
    Given want to add a  prod
    When set Productname "Car Alarms" And Type "Electronic" And price 55 And avil to "true" And needInst to "true"
    Then adding prod failed
    
   
   Scenario: blank desc
    Given  want to add a  prod
    When set Productname "" And Type "Electronic" And price 55 And avil to "true" And needInst to "true"
    Then adding prod failed
    
    Scenario: blank type
    Given  want to add a  prod
    When set Productname "Amplifiers" And Type "" And price 55 And avil to "true" And needInst to "true"
    Then adding prod failed
    
    Scenario:  wrong product type
    Given want to add a  prod
    When set Productname "Amplifiers" And Type "Ectronic" And price 55 And avil to "true" And needInst to "true"
    Then adding prod failed
    
    Scenario: adding product sucessfully
    Given want to add a  prod
    When set Productname "Amplifiers" And Type "Electronic" And price 55 And avil to "true" And needInst to "true"
    Then adding prod success
    
    Scenario: blank CateName
    Given  want to add a  Cate
    When set name Catetname "Electronic"
    Then adding Cate failed
    
    Scenario: exisited CateName
    Given  want to add a  Cate
    When set name Catetname "Electronic"
    Then adding Cate failed
    
    Scenario: adding Cate sucessfully
    Given want to add a  Cate
    When set name Catetname "Maintenance"
    Then adding Cate success
    
    