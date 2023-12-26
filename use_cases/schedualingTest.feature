Feature: I-Sche

  Scenario: Ordering my array Success
    Given I want to reorder my array
    When I swap the array by the date
    Then I should have better appointments

  Scenario: Ordering my array failed
    Given I want to reorder my array
    When I swap the array by the date
    Then I should have filed appointments

  Scenario: Add a new installation request
    Given I want to reorder my array
    When I add a new installation request for "Toyota" on "2026-06-15 14:00" for "Car GPS Systems" from "new@example.com"
    Then I should see the new appointment in the scheduled list
