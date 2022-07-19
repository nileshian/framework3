Feature: feature to test login functionality with Parameters

  Scenario Outline: Check login is successfull with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: #datatable
      | username | password |
      | Raghav   |    12345 |
      | ele      |    12345 |
