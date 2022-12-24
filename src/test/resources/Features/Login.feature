Feature: Login

  Scenario: Login with valid credentials
    Given User navigate to "https://www.saucedemo.com/"
    When User input Username "standard_user"
    And user input password "secret_sauce"
    Then User land on Product page