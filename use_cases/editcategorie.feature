Feature: Edit categorie

Scenario: valid change categorie name
    Given Admin wants to edit categorie name
    When set index 2 and categorie name to "Mechanical"
    Then Success Changed
    
Scenario: invalid change categorie name
    Given Admin wants to edit categorie name
    When set index 2 and categorie name to " "
    Then failed Changed
    
    
Scenario: invalid change categorie name
    Given Admin wants to edit categorie name
    When set index 2 and categorie name to "Exterior"
    Then failed Changed
    
