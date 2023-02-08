@Sign_in
Feature: sign in
  I want to sign in

  @cnx_sample
  Scenario: sign in with valid credentials
    Given I navigate on website
    When I enter username
    And I enter password
    And I click on login button
    Then the inventory page shows

  @cnx_param
  Scenario: sign in with valid credentials param
    Given I navigate on website
    When user enter username "standard_user"
    And I enter password
    And I click on login button
    Then the inventory page shows

  @cnx_examples
  Scenario Outline: sign in with valid credentials examples
    Given I navigate on website
    When I enter "<username>"
    And I put "<password_username>"
    And I click on login button
    Then the inventory page shows

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
