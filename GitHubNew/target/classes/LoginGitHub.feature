Feature: Github Login functionality

  Scenario: User is trying to sigin in GitHub account using Invalid credential
    Given User is on GitHub login Page
    When User enter Invalid credential and click submit Button 
    Then 'Incorrect username or password.' Message should display
   
  Scenario: User is trying to sigin in GitHub account using valid credential
    Given User is on GitHub login Page
    When User enter valid credential and click submit Button
    Then User should successfully sigin on his Github Account