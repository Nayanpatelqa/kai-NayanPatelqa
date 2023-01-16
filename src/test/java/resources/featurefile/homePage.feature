Feature: Home Page Header

  Scenario Outline: User should be able to click on Header Menu
    Given I am on Home Page
    When I Click on Cookies Accept & Close
    And I click on Header "<Menu>"
    Then I navigate to a Header Menu Page

    Examples:
      | Menu     |
      | About Us |
      | OctopusPMI |
