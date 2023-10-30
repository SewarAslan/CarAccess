Feature: customer installation request

Scenario: valid request
Given the customer wants to request an installation
When the customer sets a datetime "2024-01-03 12:30"
Then Requested successfully


Scenario:  invalid request
Given the customer wants to request an installation
When the customer sets a datetime "  "
Then Request failed
 
 Scenario:  invalid request
Given the customer wants to request an installation
When the customer sets a car model "  "
Then Request failed

 Scenario:  invalid request
Given the customer wants to request an installation
When the customer sets a product "  "
Then Request failed


Scenario:  invalid request
Given the customer wants to request an installation
When the customer sets a datetime "2024-01-01 12:30"
Then Request failed

