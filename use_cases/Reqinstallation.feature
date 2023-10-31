Feature: customer installation request

Scenario: valid request
Given the customer wants to request an installation
When the customer sets model "Skoda" And datetime "2024-01-03 12:30" And product "Tires" 
Then Requested successfully


Scenario:  blank datetime
Given the customer wants to request an installation
When the customer sets model "Skoda" And datetime "" And product "Tires" 
Then Request failed
 
 Scenario:  blank car model
Given the customer wants to request an installation
When the customer sets model "" And datetime "2024-01-03 12:30" And product "Tires" 
Then Request failed

 Scenario:  blank productName
Given the customer wants to request an installation
When the customer sets model "Skoda" And datetime "2024-01-03 12:30" And product "Tires" 
Then Request failed


Scenario:  busy date
Given the customer wants to request an installation
When the customer sets model "Skoda" And datetime "2024-01-01 12:30" And product "Tires" 
Then Request failed

