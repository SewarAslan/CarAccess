Feature: C_makePurch

Scenario:  the Array is empty
    Given i want to make a purch
    When set size 0 
    Then  the size will be 1
    
Scenario:  invalid date with letters
    Given i want to make a purch
    When set size date "2022-MM-dd HH:mm"
    Then  wrong date
    
 Scenario:  invalid date
    Given i want to make a purch
    When set size date "202-12-12 22:12"
    Then  wrong date      
    
  Scenario:  valid date
    Given i want to make a purch
    When set size date "2022-12-12 22:12"
    Then  right date           
    