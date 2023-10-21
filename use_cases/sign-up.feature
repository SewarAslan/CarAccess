Feature: sign-up

Scenario: Valid signUp
Given I am in the sign-up page
When set Email "Hi@gmail.com" and Password "123123"
Then I signed up sucessfully


Scenario: The Email is token
Given I am in the sign-up page
When set Email "Sewar@gmail.com" and Password "123123"
Then I couldn't sign up

Scenario:  Email is invalid
Given I am in the sign-up page
When set Email "Sewar" and Password "123123"
Then I couldn't sign up

Scenario:  blank Email
Given I am in the sign-up page
When set Email "" and Password "123123"
Then I couldn't sign up

Scenario:  blank Password
Given I am in the sign-up page
When set Email "Hi@gmail.com" and Password ""
Then I couldn't sign up


