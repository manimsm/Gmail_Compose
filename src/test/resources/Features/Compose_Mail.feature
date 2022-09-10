Feature: Verification of compose functionality in Gmail

  Scenario: Verifying the compose and send functions
    Given user opens the Gmail application
    When user enters the valid username "example@gmail.com" and valid password "example" to login Gmail
    Then user compose the subject "Incubyte" and body "Automation QA test for Incubyte" and send mail to mail-ID "example@gmail.com"
