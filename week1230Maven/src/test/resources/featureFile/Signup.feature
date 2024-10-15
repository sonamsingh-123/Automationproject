Feature: Demo signup functionality

  Background: 
    Given user is  at signuppage

  @single
  Scenario: Verify the signup with valid data
    Given user is at signuppage
    When user  enter the name and email
    And click on signup Button
    Then user navigate to the information page

  @multiple
  Scenario Outline: Verify the signup with multiple set of data
    Given user navigated to the signup page
    When user  enter the<username> and <emaild>
    And click on signup Button
    Then user navigate to the information page with valid data

    Examples: 
      | username | emailid         |
      | abc      | sonam.@com      |
      | xyz      | sonam@.in       |
      | sonam    | sonam@gmail.com |
