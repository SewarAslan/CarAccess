Feature: deletecategorie

Scenario:  valid_deletion
    Given Admin wants to delete a categorie
    When set categorie index 2
    Then successfuly_deleted
    
 Scenario:  invalid_deletion
    Given Admin wants to delete a product
    When set categorie index -2
    Then failed_