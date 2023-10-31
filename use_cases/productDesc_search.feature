Feature: productName_search


Scenario: valid search
    Given The user wants to search
    When the user set the name of product "Rear view mirror"
    Then Searched Successfully
    
Scenario: one word
    Given The user wants to search
    When the user set the name of product "red"
    Then Searched Successfully
    
Scenario: blank Proname
 Given The user wants to search
    When the user set the name of product ""
    Then Searching failed
 
 Scenario: not exist name
 Given The user wants to search 
    When the user set the name of product "Steering wheel blue cover"
    Then   Searching failed 
    