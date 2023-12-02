Feature: deleteproduct

Scenario:  valid deletion
    Given Admin wants to delete a product
    When set index 1
    Then successfuly deleted
    
 Scenario:  invalid deletion
    Given Admin wants to delete a product
    When set index -1
    Then failed
    
 
    

  
            