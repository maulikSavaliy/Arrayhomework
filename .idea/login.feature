Feature: As a user I want to login to my account so that i continue my shhopping.
  Scenario: User should be login with valid username and valid password
    Given I am on a login page
    When I Enter username as <mauliksavaliya>
    And I Enter password as <maulik9555>
    And I clik on login botton
    Then I should be logged in

  Scenario: User should not  login with invalid username and valid password
      Given I am on a login page
      When I Enter username as <Maliksavaliya>
      And I Enter password as <maulik9555>
      And I click on login botton
      Then I am not abel to logged in

  Scenario: User should not login with valid invalid user name and invalid password
        Given I am on login page
        When I Enter username as <Maliksavaliya>
        And I Enter a Password as <Maulik9999>
        And I click on a login botton
        Then I am not abel to logged in

  Scenario: User should not login only valid username
          Given I am on login page
          When I Enter Username as <mauliksavaliya>
          And I click on login botton
          Then I am not abel to loggd in

  Scenario: User should not login only valid password
            Given I am on login page
            When I Enter password as <maulik9555>
            And I click on login botton
            Then I am not abel to logged in

  Scenario: User should not login only invalid username
    Given I am on login page
    When I Enter Username as <Maliksavaliya>
    And I click on login botton
    Then I am not abel to loggd in

  Scenario: User should not login only invalid password
    Given I am on login page
    When I Enter password as <Maulik9999>
    And I click on login botton
    Then I am not abel to logged in

  Scenario: user should not  login with valid userid and invalid password
    Given I am on login page
    When I Enter valid userid <mauliksavaliya>
    And I Enter Invalid password <Maulik9999>
    And I click on login botton
    Then I am not abel to logged in
