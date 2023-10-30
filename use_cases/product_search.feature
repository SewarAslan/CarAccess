Feature: product search


Scenario: valid search

    Given The user wants to search
    When the user set the name of product "Rear view mirror"
    Then Searched Successfully
    
Scenario: invalid search

 Given The user wants to search
    When the user set the name of product " "
    Then Searching failed
 
 Scenario: invalid search

 Given The user wants to search 
    When the user set the name of product "Steering wheel blue cover"
    Then   Searching failed 
    