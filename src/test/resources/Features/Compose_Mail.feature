Feature: Verification of compose functionality in Gmail

  Scenario: Verifying the compose and send functions
    Given user opens the Gmail application
    When user enters the valid username "manikandan18msm@gmail.com" and valid password "mani18MS" to login Gmail
    Then user compose the subject "Incubyte" and body "Automation QA test for Incubyte" and send mail to mail-ID "manikandan18msm@gmail.com"
