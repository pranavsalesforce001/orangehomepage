@login

Feature: log in
Scenario: user should able to see login page
  Given user is on homepage
  When user enter valid details in login details
  And user click on log in button
  Then user is able to see login page


