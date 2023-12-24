Feature: Email Sender Feature

  Scenario: Sending an email
    Given the email sender is set up
    When an email is sent to "test@example.com" with subject "Test Subject" and message "Test Message"
    Then the email should be received